package com.main.spring.Controller;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.main.spring.Entity.Calculator;
import com.main.spring.Entity.userInput;

@Controller
class ConversionController {

	@RequestMapping(method= RequestMethod.GET)
	public String seeIndex(Map<String, Object> model) {
		userInput userInput = new userInput();
		model.put("userOptions", userInput);
		
		List<String> ConvFrom = new ArrayList<>();
		ConvFrom.add("milligram");
		ConvFrom.add("gram");
		ConvFrom.add("kilogram");
		model.put("fromWeightList", ConvFrom);
		
		List<String> ConvTo = new ArrayList<>();
		ConvTo.add("milligram");
		ConvTo.add("gram");
		ConvTo.add("kilogram");
		model.put("toWeightList", ConvTo);
		
		return "Index";
			
	}
	
	@RequestMapping(method= RequestMethod.POST)
	public String Calculate(@ModelAttribute("userOptions") userInput userDetails, Map<String, Object> model) {
		
		Calculator calc = new Calculator(userDetails.getInput());
	
		double convMilligramTogram = calc.MilligramToGram(calc.getUserInput());
		System.out.println("User input: " +userDetails.getInput());
		model.put("fromuser", userDetails.getInput());
		System.out.println("Converting from : " + userDetails.getConvFrom());
		model.put("from", userDetails.getConvFrom());
		System.out.println("Converting to : " + userDetails.getConvTo());
		model.put("to", userDetails.getConvTo());

		if(userDetails.getConvFrom().equalsIgnoreCase(userDetails.getConvTo()))
		{
			return "errorPage";
		}
		
		double result=calc.Calculation(userDetails.getConvFrom(), userDetails.getConvTo(), userDetails.getInput());
		String unitWeight=calc.getUnit(userDetails.getConvTo());
		
		
		System.out.println("results: "+result);
		model.put("finalanswer", result+unitWeight);
		return "Results";
		
	}
	
}

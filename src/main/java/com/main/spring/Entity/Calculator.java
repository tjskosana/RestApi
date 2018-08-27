package com.main.spring.Entity;

public class Calculator {
	
	private int id;
	private double userInput;
	private double Conv;
	private String options;
	
	public Calculator() {}
	public double Calculation(String option1, String option2,double num) {
		
				
		switch(option1)
		{
		case "milligram":
			if(option2.equalsIgnoreCase("gram"))//return kilometers
			{
				return this.MilligramToGram(num);
			}
			else if(option2.equalsIgnoreCase("Kilogram"))//to centimeter
			{
				return this.MilligramToKilogram(num);
			}
			break;
			
		case "gram":
			if(option2.equalsIgnoreCase("Milligram"))//return kilometers
			{
				return this.GramToMilligram(num);
			}
			else if(option2.equalsIgnoreCase("Kilogram"))//to centimeter
			{
				return this.GramToKilogram(num);
			}
			break;
			
		case "kilogram":
			if(option2.equalsIgnoreCase("Milligram"))//return kilometers
			{
				return this.KilogramToMilligram(num);
			}
			else if(option2.equalsIgnoreCase("gram"))//to centimeter
			{
				return this.KilogramToGram(num);
			}
			break;
		}
		return -1;
		
	}
	
	public Calculator(double userInput) {
		super();
		this.userInput = userInput;
	}
	
	public double MilligramToGram(double milligram)
	{
		
		 return milligram / 1000;
	}
	public double MilligramToKilogram(double milligram)
	{
		
		 return milligram / 1000000;
	}
	
	public double GramToMilligram(double gram)
	{
		
		 return gram * 1000;
	}

	public double GramToKilogram(double gram)
	{
		
		 return gram / 1000;
	}
	
	public double KilogramToMilligram(double kilogram)
	{
		
		 return kilogram * 1000000;
	}
	
	public double KilogramToGram(double kilogram)
	{
		
		 return kilogram * 1000;
	}
	
	public String getUnit(String method)
	{
		String unit="";
		
		switch(method)
		{
		case"milligram":
			unit= " mg.";
			break;			
		case"gram":		
			unit= " g.";
			break;		
		case"kilogram":
			unit=" kg.";
			break;
			
		}
		
		return unit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getUserInput() {
		return userInput;
	}
	public void setUserInput(double userInput) {
		this.userInput = userInput;
	}
	public double getConv() {
		return Conv;
	}
	public void setConv(double conv) {
		Conv = conv;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	
	public Calculator(double userInput, double Conv) {
		super();
		this.userInput = userInput;
		this.Conv = Conv;
	}


	@Override
	public String toString() {
		return "converter [id=" + id + ", User Input=" + userInput + ", Conv=" + Conv + ", options=" + options
				+ "]";
	}
	
	
}

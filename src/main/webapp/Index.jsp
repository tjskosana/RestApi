<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
<div align="left">
		<form:form action="Results" method="post" modelAttribute="userOptions">
			<table border="0">
				<tr>
					<td colspan="2" align="left"><h2>WEIGHT CONVERTER</h2></td>
				</tr>
		
				<tr>
					<td>Convert from:</td>
					<td><form:select path="ConvFrom" items="${fromWeightList}" /></td>
				</tr>
				
				<tr>
					<td>Convert to:</td>
					<td><form:select path="ConvTo" items="${toWeightList}" /></td>
				</tr>
				
				<tr>
					<td>unit:</td>
					<td><form:input path="input" /></td>
				</tr>
				
				
				<tr>
					<td colspan="2" align="center"><input type="submit" value="Convert" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sample Spring Boot</title>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script> -->
<script>
	/* $( document ).ready(function() {
		alert("eiei");
    	$.ajax({
    		  method:"POST",
    		  url: "getTaxtype"
    		}).success(function() {
    			alert("success");
    		});
	}); */
</script>
</head>
<body>

<%-- <form:form method="POST" action="saveTaxType" modelAttribute="mstTaxType">
   <form:label path="taxTypeCode">Tax Type</form:label>
   <form:input type="text" path="taxTypeCode"  />
   <form:label path="description">Description</form:label>
   <form:input type="text" path="description" />
   <form:label path="active">Active</form:label>
   <form:input type="text" path="active" />
   <input type="submit" value="Submit" /> 
</form:form> --%>

<form:form method="POST" action="saveTaxType" modelAttribute="trnInvoice">
   <form:label path="doctorCode">Doctor Code</form:label>
   <form:input type="text" path="doctorCode"  />
   <form:label path="doctorNameEn">Doctor Name</form:label>
   <form:input type="text" path="doctorNameEn" />
   <form:label path="active">Active</form:label>
   <form:input type="text" path="active" />
   <input type="submit" value="Submit" />   
</form:form>



</body>
</html>
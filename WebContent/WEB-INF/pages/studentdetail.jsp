<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="./header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring:message code="name"/> ${Student.studentName }<br/>

<spring:message code="reg"/>${Student.registrationNumber}<br/>
<form:form action="test.htm" commandName="test" method="post">

<spring:message code="tetstname"/> <form:input path="testName"/><br/>
<spring:message code="mark1"/> <form:input path="actualMark"/><br/>
<spring:message code="mark2"/> <form:input path="studentMark"/>
<form:errors path="studentMark"  cssClass="error"></form:errors>
<br/>
<input type="submit" value="Submit"></input>
</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="./header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function getAll(frm) {
		alert("");
		frm.action = "getreg.htm";
		frm.method = "get";
		frm.submit();
	}
</script>
</head>
<body>
<spring:message code="studentregistraion"></spring:message>
<form:form commandName="student">

	<form:select path="registrationNumber" onchange="getAll(this.form);">
		<form:option value="0">-----Select-----</form:option>
		<c:forEach items="${regnumbers}" var="reg">
			<form:option value="${reg.registrationNumber}">${reg.registrationNumber}</form:option>
		</c:forEach>
	</form:select>

</form:form>
</body>
</html>
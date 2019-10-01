<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<jsp:useBean id="usebean" scope="request" class="tom.UseBean"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		usebean.setName("たま");
		usebean.setAge(1);
	%>
	<%= usebean.getName() %>は、<%= usebean.getAge() %>歳になりました
</body>
</html>
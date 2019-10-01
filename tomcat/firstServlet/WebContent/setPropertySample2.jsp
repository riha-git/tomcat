<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="usebean" scope="request" class="tom.UseBean" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:setProperty name="usebean" property="name" param="name" />
	<jsp:setProperty name="usebean" property="age" param="age" />
	<%=usebean.getName() %>は、<%=usebean.getAge() %>才になりました
</body>
</html>
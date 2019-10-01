<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:useBean id="usebean" scope="request" class="tom.UseBean" />
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Insert title here</title>
</head>
<body>
	<jsp:setProperty name="usebean" property="name" value="たま" />
	<jsp:setProperty name="usebean" property="age" value="1" />
	<%=usebean.getName() %>は、<%=usebean.getAge() %>才になりました。
</body>
</html>
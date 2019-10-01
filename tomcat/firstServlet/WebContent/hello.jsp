<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello,World!</h1>
	現在日時：<%= java.text.DateFormat.getDateTimeInstance().format (new java.util.Date ()) %>
</body>
</html>
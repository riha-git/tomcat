<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>入力結果</h1>
		お名前：
		<%= request.getAttribute("name") %>
		<br>
		ふりがな：
		<%= request.getAttribute("kana") %>
</body>
</html>
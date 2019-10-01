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
	<h1>入力フォーム</h1>
	<form action="/firstServlet/servlet/tom.JspSrvBeanSample1" method="post">
		お名前：
		<input type="text" name="name" value="">
		<br>
		ふりがな：
		<input type="text" name="kana" value="">
		<br>
		<input type="submit" value="送信">
	</form>
</body>
</html>
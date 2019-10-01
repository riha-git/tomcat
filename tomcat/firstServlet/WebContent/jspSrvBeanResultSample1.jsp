<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <jsp:useBean id="bn" scope="request" class="tom.JspSrvBean" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>入力結果</h1>
		お名前：
		<jsp:getProperty name="bn" property="name" />
		<br>
		ふりがな：
		<jsp:getProperty name="bn" property="kana" />
</body>
</html>
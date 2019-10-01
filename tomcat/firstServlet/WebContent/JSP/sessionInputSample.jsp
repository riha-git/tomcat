<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>
    <%-- 確認画面から戻ったときの値取得 --%>
    <jsp:useBean id="bn" scope="request" class="tom.InputBean" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>入力フォーム</h1>
	<form action="../servlet/tom.SessionInputSample" method="post">
		お名前：
		<input type="text" name="name" value="<%= bn.getName() %>">
		<br>
		ふりがな：
		<input type="text" name="name" value="<%= bn.getKana() %>">
		<br>
		<input type="submit" value="確認">
	</form>
</body>
</html>
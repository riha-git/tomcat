<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%-- 確認画面から戻ったときの値取得 --%>
    <jsp:useBean id="bn" scope="session" class="tom.InputBean" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>入力確認</h1>
	<form action="../servlet/tom.SessionConfSample" method="post">
		お名前：
		<jsp:getProperty name="bn" property="name" />
		<br>
		ふりがな：
		<jsp:getProperty name="bn" property="kana" />
		<br>
		<input type="submit" name="back" value="戻る">
		<input type="submit" name="next" value="登録">
	</form>
</body>
</html>
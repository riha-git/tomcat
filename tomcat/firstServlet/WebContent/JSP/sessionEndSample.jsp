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
	<h1>登録完了</h1>
	<form action="../servlet/tom.SessionInputSample" method="post">
		<input type="submit" value="追加登録">
	</form>
</body>
</html>
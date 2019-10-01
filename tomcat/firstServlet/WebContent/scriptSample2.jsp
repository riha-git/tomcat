<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J">
<title>Insert title here</title>
</head>
<body>
	<% String fruites[] = {"リンゴ", "バナナ", "なし", "もも", "いちご"}; %>
	<select>
		<% for(String fruite: fruites){ %>
		<option><% out.println(fruite); %></option>
		<% } %>
	</select>
</body>
</html>
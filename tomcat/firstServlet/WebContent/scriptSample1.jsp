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
	<% Calendar cal = Calendar.getInstance(); 
	int week = cal.get(Calendar.DAY_OF_WEEK);
	switch (week)
	{
		case Calendar.SUNDAY:
			out.println("���j��");
			break;
		case Calendar.MONDAY:
			out.println("���j��");
			break;
		case Calendar.TUESDAY:
			out.println("�Ηj��");
			break;
		case Calendar.WEDNESDAY:
			out.println("���j��");
			break;
		case Calendar.THURSDAY:
			out.println("�ؗj��");
			break;
		case Calendar.FRIDAY:
			out.println("���j��");
			break;
		case Calendar.SATURDAY:
			out.println("�y�j��");
			break;
	}
	%>
</body>
</html>
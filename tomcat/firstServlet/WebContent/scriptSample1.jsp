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
			out.println("日曜日");
			break;
		case Calendar.MONDAY:
			out.println("月曜日");
			break;
		case Calendar.TUESDAY:
			out.println("火曜日");
			break;
		case Calendar.WEDNESDAY:
			out.println("水曜日");
			break;
		case Calendar.THURSDAY:
			out.println("木曜日");
			break;
		case Calendar.FRIDAY:
			out.println("金曜日");
			break;
		case Calendar.SATURDAY:
			out.println("土曜日");
			break;
	}
	%>
</body>
</html>
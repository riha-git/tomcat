package tom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OutPutMondai_1_2 extends HttpServlet {

	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response
	)throws ServletException, IOException
	{
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<h1>入力フォーム</h1>");
		out.println("名前：<input type='text' name='name' value=''>");
		out.println("<br>");
		out.println("誕生日：");
		out.println("<select name='month'>");
		for(int i = 1 ; i <= 12; i++)
		{
			out.println("<option value='" + i + "'>" + i + "</option>");
		}
		out.println("月");
		out.println("</select>");
		out.println("<select name='day'>");
		for(int i = 1 ; i <= 31; i++)
		{
			out.println("<option value='" + i + "'>" + i +"</option>");
		}
		out.println("</select>");
		out.println("日");
		out.println("</html>");
		out.close();
	}
}

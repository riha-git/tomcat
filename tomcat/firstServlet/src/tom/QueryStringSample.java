package tom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QueryStringSample extends HttpServlet {

	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response
	)throws ServletException, IOException
	{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out =  response.getWriter();
		out.println("<html><body>");
		out.println("<h1>doPostメソッドサンプル</h1>");
		out.println("Name: ");
		out.println(request.getParameter("name"));
		out.println("<br>");
		out.println("Mail: ");
		out.println(request.getParameter("mail"));
		out.println("<br>");
		out.println("<span>query string data</span>");
		out.println("<br>");
		out.println("Address: ");
		out.println(request.getParameter("address"));
		out.println("<br>");
		out.println("Age: ");
		out.println(request.getParameter("age"));
		out.println("</body></html>");
	}
}

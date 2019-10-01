package tom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetSample extends HttpServlet {

	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response
	)throws ServletException, IOException
	{
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out =  response.getWriter();
		out.println("<html><body>");
		out.println("<h1>doGetメソッドサンプル</h1>");
		out.println("Name: ");
		out.println(request.getParameter("name"));
		out.println("<br>");
		out.println("Mail: ");
		out.println(request.getParameter("mail"));
		out.println("</body></html>");
	}
}

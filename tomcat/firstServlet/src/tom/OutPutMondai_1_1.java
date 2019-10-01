package tom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OutPutMondai_1_1 extends HttpServlet {

	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response
	)throws ServletException, IOException
	{
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("ようこそ鈴木さん");
		out.println("</html>");
		out.close();
	}
}

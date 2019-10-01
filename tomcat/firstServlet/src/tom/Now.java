package tom;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Now extends HttpServlet {

	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response
	)throws ServletException, IOException
	{
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setIntHeader("Refresh", 5);
		response.setContentType("text/html; charset=Shift_Jis");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<h1>現在の時刻</h1>");
		out.println(DateFormat.getDateTimeInstance().format(new Date())); 
		out.println("</html>");
		out.close();
	}
}

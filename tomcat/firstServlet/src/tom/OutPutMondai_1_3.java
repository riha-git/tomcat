package tom;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OutPutMondai_1_3 extends HttpServlet {

	String str = "";
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response
	)throws ServletException, IOException
	{
		str += "チクタク・・";
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setContentType("text/html; charset=Shift_Jis");
		response.setIntHeader("Refresh", 10);
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println(str);
		out.println("</html>");
		out.close();
	}
}

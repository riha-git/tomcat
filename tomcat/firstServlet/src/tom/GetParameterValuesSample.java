package tom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetParameterValuesSample extends HttpServlet {

	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response
	)throws ServletException, IOException
	{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out =  response.getWriter();
		out.println("<html><body>");
		out.println("<h1>入力されったデータリスト</h1>");
		out.println("Skill: ");
		String[] skills = request.getParameterValues("skill");
		out.println("<table>");
		for(String skill: skills)
		{
			out.println("<tr><td>");
			out.println(skill);
			out.println("<td></tr>");
		}
		out.println("</table>");
		out.println("</body></html>");
	}
}

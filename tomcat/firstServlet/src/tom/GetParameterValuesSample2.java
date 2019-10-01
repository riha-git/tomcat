package tom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetParameterValuesSample2 extends HttpServlet {

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
		out.println("お名前: ");
		out.println(request.getParameter("name"));
		out.println("<br>");
		out.println("性別: ");
		out.println(request.getParameter("gender"));
		out.println("<br>");
		out.println("行ってみたいところ: ");
		out.println(request.getParameter("place"));
		out.println("<br>");
		out.println("興味のある言語: ");
		String[] language = request.getParameterValues("language");
		out.println("<table>");
		for(String lang: language)
		{
			out.println("<tr><td>");
			out.println(lang);
			out.println("<td></tr>");
		}
		out.println("</table>");
		out.println("<br>");
		out.println("お問い合わせ内容: ");
		out.println("<pre>");
		out.println(request.getParameter("question"));
		out.println("</pre>");
		out.println("</body></html>");
	}
}

package tom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFavorite extends HttpServlet {

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
		out.println("私の好きな食べ物は");
		out.println(request.getParameter("eat"));
		out.println("です");
		out.println("<br>");
		out.println("私の好きな歌は");
		out.println(request.getParameter("song"));
		out.println("です");
		out.println("<br>");
		String[] language = request.getParameterValues("language");
		out.println("<table>");
		for(String lang: language)
		{
			out.println("<tr><td>");
			out.println("私の好きな言語は");
			out.println(lang);
			out.println("です");
			out.println("<td></tr>");
		}
		out.println("</table>");
		out.println("<br>");
		out.println("</body></html>");
	}
}

package tom;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JspSrvSample1 extends HttpServlet {

	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response
	)throws ServletException, IOException
	{
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String kana = request.getParameter("kana");
		
		// 取得したhttpServletRequestをオブジェクトに設定
		request.setAttribute("name", name);
		request.setAttribute("kana", kana);
		
		//jsp設定
		RequestDispatcher rd = request.getRequestDispatcher("/jspSrvResultSample.jsp");
		
		// 遷移
		rd.forward(request, response);
	}
}

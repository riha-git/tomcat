package tom;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionConfSample extends HttpServlet {

	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response
	)throws ServletException, IOException
	{
		// 定数定義
		final String NEXT_PATH = "/JSP/sessionEndSample.jsp";
		final String BACK_PATH = "/JSP/sessionInputSample.jsp";

		// ボタン制御
		String path = "";
		if(request.getParameter("back") != null)
		{
			path = BACK_PATH;
		}else
		{
			path = NEXT_PATH;
		}

		//jsp設定
		RequestDispatcher rd = request.getRequestDispatcher(path);

		// 遷移
		rd.forward(request, response);
	}
}

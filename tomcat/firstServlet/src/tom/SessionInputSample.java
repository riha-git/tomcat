package tom;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionInputSample extends HttpServlet {

	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response
	)throws ServletException, IOException
	{
		// 定数定義
		final String NEXT_PATH = "/JSP/sessionConfSample.jsp";
	
		// セッションオブジェクト生成
		HttpSession session = request.getSession();
		
		// 入力値取得
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String kana = request.getParameter("kana");
		
		// javabeanオブジェクト生成
		JspSrvBean bn = new JspSrvBean();
		
		// beansに設定
		bn.setName(name);
		bn.setKana(kana);

		// 取得したhttpServletRequestをオブジェクトに設定
		request.setAttribute("bn", bn);
		
		//jsp設定
		String path = NEXT_PATH;
		RequestDispatcher rd = request.getRequestDispatcher(path);

		// 遷移
		rd.forward(request, response);
	}
}

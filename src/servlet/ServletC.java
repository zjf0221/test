package servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletC extends HttpServlet{
	private static final long serialVersionUID =1L;
	private  ServletConfig config = null;
	private  ServletContext context = null;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.config = this.getServletConfig();
		this.context  = config.getServletContext();
		this.context.setAttribute("name", "Ö£¼Î·¼");
		System.out.println(context.getAttribute("name"));
	}

}

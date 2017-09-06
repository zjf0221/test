package servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.naming.java.javaURLContextFactory;
import org.eclipse.jdt.internal.compiler.ast.ThisReference;

public class ServletB extends HttpServlet{
   /*
    * 
    */
	private static final long serialVersionUID =1L;
	private  ServletConfig config = null; 
	private  ServletContext context = null;
	//
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		 		throws ServletException, IOException {
		    //获取Servlet携带的参数方法2
		    this.config = this.getServletConfig();
//		    System.out.println(config.getInitParameter("user"));
		    //获取全部参数
		    java.util.Enumeration<String> names = this.config.getInitParameterNames();
		    while (names.hasMoreElements()) {
				String name = (String) names.nextElement();
				System.out.println(name +":" + this.config.getInitParameter(name));			
			}
//		    System.out.println(this.config.getServletName());
		    
		    this.context  = config.getServletContext(); 
		    System.out.println(context.getAttribute("name"));
		}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			doGet(req, resp);
		}
//	@Override
//		public void init(ServletConfig config) throws ServletException {
	        //获取Servlet携带的参数方法1
//			this.config = config;
//			System.out.println(config.getInitParameter("user"));
//		}

}

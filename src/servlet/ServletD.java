package servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

public class ServletD extends HttpServlet{
	private static final long serialVersionUID =1L;
	private  ServletContext context = null;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	ServletContext context = this.getServletContext();
    	String path = context.getRealPath("/WEB-INF/classes/servlet/db.properties");
        InputStream in = new FileInputStream(path);
        String str = IOUtils.toString(in);
        System.out.println(str);
    }
}

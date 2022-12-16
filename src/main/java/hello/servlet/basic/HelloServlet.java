package hello.servlet.basic;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("HelloServlet.service");
		System.out.println("req ::: " + req);
		System.out.println("res ::: " + res);
		
		String username = req.getParameter("username");
		System.out.println("username ::: " + username);
		
		res.setContentType("text/plain");
		res.setCharacterEncoding("utf-8");
		res.getWriter().write("hello " + username);
	}

}

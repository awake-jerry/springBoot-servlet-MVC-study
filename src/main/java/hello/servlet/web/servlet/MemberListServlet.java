package hello.servlet.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "memberListServlet", urlPatterns = "/servlet/members")
public class MemberListServlet extends HttpServlet {

	private MemberRepository memberRepository = MemberRepository.getInstance();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("MemberListServlet.service");

		List<Member> members = memberRepository.findAll();

		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");

		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println(" <meta charset=\"UTF-8\">");
		writer.println(" <title>Title</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<a href=\"/index.html\">메인</a>");
		writer.println("<table>");
		writer.println(" <thead>");
		writer.println(" <th>id</th>");
		writer.println(" <th>username</th>");
		writer.println(" <th>age</th>");
		writer.println(" </thead>");
		writer.println(" <tbody>");

		for (Member member : members) {
			writer.println(" <tr>");
			writer.println(" <td>" + member.getId() + "</td>");
			writer.println(" <td>" + member.getUsername() + "</td>");
			writer.println(" <td>" + member.getAge() + "</td>");
			writer.println(" </tr>");
		}
		writer.println(" </tbody>");
		writer.println("</table>");
		writer.println("</body>");
		writer.println("</html>");

	}
}

package com.mypersonal.first;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/members/create")
public class CreateMemberServlet extends HttpServlet {
    private MemberDao memberDao;

    @Override
    public void init() {
        memberDao = MemberDao.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/create-member.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String memberName = request.getParameter("memberName");
        String password = request.getParameter("password");

        Member member = new Member(memberName, password);
        memberDao.create(member);

        response.sendRedirect("/members/list");
    }
}
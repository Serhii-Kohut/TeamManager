package com.mypersonal.first;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/members/update")
public class UpdateMemberServlet extends HttpServlet {
    private MemberDao memberDao;
    private Member member;

    @Override
    public void init() {
        memberDao = MemberDao.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        member = memberDao.read(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("member", member);
        request.getRequestDispatcher("/WEB-INF/update-member.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        member.setMemberName(request.getParameter("memberName"));
        member.setPassword(request.getParameter("password"));

        memberDao.update(member.getId(), member);

        response.sendRedirect("/members/list");
    }
}
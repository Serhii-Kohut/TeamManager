package com.mypersonal.first;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/members/read")
public class ReadMemberServlet extends HttpServlet {
    private MemberDao memberDao;

    @Override
    public void init() {
        memberDao = MemberDao.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Member member = memberDao.read(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("member", member);
        request.getRequestDispatcher("/WEB-INF/read-member.jsp").forward(request, response);
    }

}
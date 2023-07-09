package com.mypersonal.first;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/members/list")
public class MembersListServlet extends HttpServlet {
    private MemberDao memberDao;

    @Override
    public void init() {
        memberDao = MemberDao.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/members-list.jsp");
        request.setAttribute("members", memberDao.getAllMembers());
        requestDispatcher.forward(request, response);
    }
}
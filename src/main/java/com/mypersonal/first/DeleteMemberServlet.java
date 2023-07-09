package com.mypersonal.first;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/members/delete")
public class DeleteMemberServlet extends HttpServlet {
    private MemberDao memberDao;

    @Override
    public void init() {
        memberDao = MemberDao.getInstance();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        memberDao.delete(Integer.parseInt(request.getParameter("id")));

        response.sendRedirect("/members/list");
    }
}
package com.mypersonal.first;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/members/create")
public class CreateMemberServlet extends HttpServlet {
    private MemberDao memberDao;

    @Override
    public void init() {
        memberDao = MemberDao.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
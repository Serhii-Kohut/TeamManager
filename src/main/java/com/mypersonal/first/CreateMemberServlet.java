package com.mypersonal.first;

import javax.servlet.*;
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.print("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Create new ClubMember</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<form action=\"/members/create\" method=\"post\">\n" +
                "  <table>\n" +
                "    <tr>\n" +
                "      <td>\n" +
                "        <label for=\"memberName\">MemberName: </label>\n" +
                "      </td>\n" +
                "      <td>\n" +
                "        <input type=\"text\" id=\"memberName\" name=\"memberName\">\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "      <td>\n" +
                "        <label for=\"password\">Password: </label>\n" +
                "      </td>\n" +
                "      <td>\n" +
                "        <input type=\"text\" id=\"password\" name=\"password\">\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "      <td>\n" +
                "        <input type=\"submit\" value=\"Create\">\n" +
                "      </td>\n" +
                "      <td>\n" +
                "        <input type=\"reset\" value=\"Clear\">\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </table>\n" +
                "</form>\n" +
                "\n" +
                "</body>\n" +
                "</html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        String memberName = request.getParameter("memberName");
        String password = request.getParameter("password");

        Member member = new Member(memberName, password);
        memberDao.create(member);
    }
}
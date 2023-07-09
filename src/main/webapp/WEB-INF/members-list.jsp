<%@ page import="com.mypersonal.first.Member" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show all members</title
    <link rel="stylesheet" type="text/css" href="/css/styles.css">

</head>
<body>

<%@include file="header.html"%>
<br>
<br>
<table border="1">
    <tr>
        <th>ID</th>
        <th>MemberName</th>
        <th>Password</th>
        <th colspan="3">Operations</th>
    </tr>

    <%
        for (Member member : (List<Member>) request.getAttribute("members")){
        %>
    <tr>
        <td><%=member.getId()%></td>
        <td><%=member.getMemberName()%></td>
        <td><%=member.password%></td>
        <td>
            <a href="read?id=<%=member.getId()%>">Read</a>
        </td>
        <td>
            <a href="update?id=<%=member.getId()%>">Update</a>
        </td>
        <td>
            <a href="delete?id=<%=member.getId()%>">Delete</a>
        </td>
    </tr>
    <%
        }
    %>

</table>
</body>
</html>

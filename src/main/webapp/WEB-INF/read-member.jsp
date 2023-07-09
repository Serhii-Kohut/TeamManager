<%@ page import="com.mypersonal.first.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show info about Member</title>
</head>
<body>
<%
  Member member = (Member) request.getAttribute("member");
%>

<p>ID: <%=member.getId()%></p>
<p>Member name: <%=member.getMemberName()%></p>
<p>Password: <%=member.getPassword()%></p>
</body>
</html>

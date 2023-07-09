<%@ page import="com.mypersonal.first.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show info about Member</title>
    <link rel="stylesheet" type="text/css" href="/css/styles.css">
</head>
<body>

<%@include file="header.html" %>
<br>
<br>

<%
    Member member = (Member) request.getAttribute("member");
%>

<p>ID: <%=member.getId()%>
</p>
<p>Member name: <%=member.getMemberName()%>
</p>
<p>Password: <%=member.getPassword()%>
</p>
</body>
</html>

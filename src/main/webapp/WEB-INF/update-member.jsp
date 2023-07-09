<%@ page import="com.mypersonal.first.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Update existing Member</title>
  <link rel="stylesheet" type="text/css" href="/css/styles.css">
</head>
<body>
<form action="/members/update" method="post">

  <%@include file="header.html"%>
  <br>
  <br>
  <%
    Member member = (Member) request.getAttribute("member");
  %>

  <table>
    <tr>
      <td><label for="id">ID: </label></td>
      <td><input type="text" id="id" name="id" value="<%=member.getId()%>" disabled></td>
    </tr>
    <tr>
      <td>
        <label for="memberName">MemberName: </label>
      </td>
      <td>
        <input type="text" id="memberName" name="memberName" value="<%=member.getMemberName()%>">
      </td>
    </tr>
    <tr>
      <td>
        <label for="password">Password: </label>
      </td>
      <td>
        <input type="password" id="password" name="password" value="<%=member.getPassword()%>">
      </td>
    </tr>
    <tr>
      <td>
        <input type="submit" value="Update">
      </td>
      <td>
        <input type="reset" value="Clear">
      </td>
    </tr>
  </table>
</form>
</body>
</html>

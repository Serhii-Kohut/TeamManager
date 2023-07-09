<%--
  Created by IntelliJ IDEA.
  User: SerhiiKo
  Date: 09.07.2023
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new member</title>
</head>
<body>
<form action="/members/create" method="post">
  <table>
    <tr>
      <td>
        <label for="memberName">MemberName: </label>
      </td>
      <td>
        <input type="text" id="memberName" name="memberName">
      </td>
    </tr>
    <tr>
      <td>
        <label for="password">Password: </label>
      </td>
      <td>
        <input type="password" id="password" name="password">
      </td>
    </tr>
    <tr>
      <td>
        <input type="submit" value="Create">
      </td>
      <td>
        <input type="reset" value="Clear">
      </td>
    </tr>
  </table>
</form>
</body>
</html>

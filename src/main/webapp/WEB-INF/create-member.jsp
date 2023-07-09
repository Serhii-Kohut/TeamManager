<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new member</title>
  <link rel="stylesheet" type="text/css" href="/css/styles.css">
</head>
<body>

<%@include file="header.html"%>
<br>
<br>
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

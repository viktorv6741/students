<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="theme.css" %>

<link rel="stylesheet" type="text/css" href="theme.css">
<html>
<head>
  <title>Students</title>
</head>

<body style="margin:0">

<div class="left_block">
  <form method="POST">
    Name<br>
    <input type="text" name="studentName"/><br>
    Surname<br>
    <input type="text" name="studentSurName"/><br>
    Age<br>
    <input type="text" name="studentAge"/><br>
    Course<br>
    <input type="text" name="studentCourse"/><br>
    Phone number<br>
    <input type="text" name="studentPhoneNumber"/><br>
    Email<br>
    <input type="text" name="studentEmail"/><br>
    <input type="submit" value="add"/>
  </form>
</div
><div class="right_block">
  <form method="POST">
    <table border="2" ; align="center">
      <c:forEach items="${subjects}" var="subject">
        <tr>
          <td>
            <c:out value="${subject}"/>
          </td>
        </tr>
      </c:forEach>
    </table>
  </form>
</div
><div class="bottom_block">
  <table border="2" ; align="center">
    <c:forEach items="${students}" var="student">
      <tr>
        <td>
          <c:out value="${student}"/>
        </td>
      </tr>
    </c:forEach>
  </table>
</div>
</body>
</html>


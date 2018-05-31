<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Home Page</title>
  </head>
  <body>
  <table content="tg">
    <tr>
      <th width="20">ID</th>
      <th width="100">Name</th>
      <th width="160">Email</th>
      <th width="20">Age</th>
      <th width="40">Delete</th>

    </tr>
    <c:forEach items="${listPerson}" var="person">
      <tr>
        <td><a href="/look/${person.id}">${person.id}</a></td>
        <td>${person.name}</td>
        <td>${person.email}</td>
        <td>${person.age}</td>
        <td><a href="/delete/${person.id}">Delete</a> </td>
      </tr>
    </c:forEach>
  </table>
    <br/>
    <p>Create Person: <a href="/add">create</a> </p>
  </body>
</html>

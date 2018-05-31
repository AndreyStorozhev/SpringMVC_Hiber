<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Person</title>
</head>
<body>
<h1>Person Details</h1>

<table>
    <tr>
        <th width="20">ID</th>
        <th width="100">Name</th>
        <th width="160">Email</th>
        <th width="20">Age</th>
    </tr>
    <tr>
        <td>${person.id}</td>
        <td>${person.name}</td>
        <td>${person.email}</td>
        <td>${person.age}</td>
    </tr>
</table>
    <br/>
    <a href="/home">Back to home</a>
</body>
</html>

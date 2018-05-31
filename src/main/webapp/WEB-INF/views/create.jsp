<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Person</title>
</head>
<body>
<form name="person" action="/add" method="post">
    <p>Name</p>
    <input title="Name" type="text" name="name">
    <p>Email</p>
    <input title="Email" type="text" name="email">
    <p>Age</p>
    <input title="Age" type="text" name="age">
    <input type="submit" value="Ok">
</form>
</body>
</html>

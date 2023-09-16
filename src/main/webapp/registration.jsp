
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form method ="post" action = "/registration">
<label for ="name">Name</label>
<input type ="text" id="name" name = "username">
<br><br>
<label for ="lastName">Last name</label>
<input type ="text" id="lastName" name = "lastName">
<br><br>
<label for ="email">Email</label>
<input type ="text" id="email" name = "email">
<br><br>
<label for ="password">Password</label>
<input type ="text" id="password" name = "password">
<br><br>
    <button type="submit">OK</button>
</form>
</body>
</html>

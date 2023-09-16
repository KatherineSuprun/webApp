<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration form</title>
</head>
<body>
<from action="hello" method="POST">
    Name: <input name= "username"/>
    <br><br>
    Last name: <input name= "lastname"/>
    <br><br>
    Age: <input age= "age"/>
    <br><br>
    City: <select name = "city">
    <option>Kyiv</option>
    <option>Kharkiv</option>
    <option>Odessa</option>
    <option>Kropyvnytskyi</option>
    <option>Chernigiv</option>
    <option>Lviv</option>
</select>
    <br><br>
    <input type = "checkbox" name = "orders" value = "Orders" checked/> Orders
    <br><br>
    <button type="submit">OK</button>

</from>
</body>
</html>
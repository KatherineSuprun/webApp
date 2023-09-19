<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale = 1.0">
    <title>Registration form</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: lightpink;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 60vh;
        }

        form {
            background-color: antiquewhite;
            padding: 60px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            text-align: center;
        }

        h1 {
            font-size: 24px;
            margin-bottom: 20px;
        }

        button[type= "submit"]:hover {
            background-color: bisque;
        }
    </style>
</head>
<body>
<form method ="post" action = "/index">
<h1>Welcome!</h1>
<br><br>
<a href="/registration"> Registration form </a>
<br><br>
<a href="/orders"> Your orders </a>
</form>
</body>
</html>
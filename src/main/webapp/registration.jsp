<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale = 1.0">
    <title>Registration</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: lightpink;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        form {
            background-color: antiquewhite;
            padding: 20px;
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
<form method="post" action="/registration">
    <label for="name">Name</label>
    <input type="text" id="name" name="username">
    <br><br>
    <label for="lastName">Last name</label>
    <input type="text" id="lastName" name="lastName">
    <br><br>
    <label for="email">Email</label>
    <input type="text" id="email" name="email">
    <br><br>
    <label for="password">Password</label>
    <input type="text" id="password" name="password">
    <br><br>
    <button type="submit">OK</button>
</form>
</body>
</html>

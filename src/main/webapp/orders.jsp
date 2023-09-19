<%@ page import="dto.Order" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name = "viewport" content="width=device-width, initial-scale = 1.0">
    <title>Orders</title>
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
     box-shadow: 0 0 10px rgba(0,0,0,0.2);
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

    <form method ="post" action = "/orders">
        <h1>Please, choose the products</h1>
        <br><br>
        <label for ="lipstick">Lipstick</label>
        <input type ="number" quantity ="1" min="1" max="100" id="lipstick" name = "lipstick">
        <br><br>
        <label for ="shampoo">Shampoo</label>
        <input type ="number" quantity ="1" min="1" max="100" id="shampoo" name = "shampoo">
        <br><br>
        <label for ="gel">Gel</label>
        <input type ="number" quantity ="1" min="1" max="100" id="gel" name = "gel">
        <br><br>
        <label for ="soap">Soap</label>
        <input type ="number" quantity ="1" min="1" max="100" id="soap" name = "soap">
        <br><br>
        <label for ="mascara">Mascara</label>
        <input type ="number" quantity ="1" min="1" max="100" id="mascara" name = "mascara">
        <br><br>
        <button type="submit">OK</button>
</form>
</body>
</html>

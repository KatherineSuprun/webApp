<%@ page import="dto.Order" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Orders</title>
</head>
<body>
<form method="post" action ="createOrders" >
    <h1>Please, choose products</h1>
    <p>
        <label> Lipstick
        <input type="number" quantity ="1" min="1" max="100"/>
        </label>
    </p>
    <p>
        <label> Shampoo
        <input type="number" quantity ="1" min="1" max="100"/>
        </label>
    </p>
    <p>
        <label> Gel
        <input type="number" quantity ="1" min="1" max="100"/>
        </label>
    </p>
    <p>
        <label> Soap
        <input type="number" quantity ="1" min="1" max="100"/>
        </label>
    </p>
    <p>
        <label> Mascara
        <input type="number" quantity ="1" min="1" max="100"/>
        </label>
    </p>
    <button type="submit">OK</button>
    <%
        Order order = (Order) request.getAttribute("order");
        for(int i = 0; i < order.getProducts().length; i ++){
            String product = order.getProducts()[i];
            String quantity = order.getQuantities()[i];
    %>
    <tr>
        <td><%= product %></td>
        <td><%= quantity %></td>
    </tr>
    <% } %>
</form>
</body>
</html>

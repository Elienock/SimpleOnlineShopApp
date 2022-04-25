<%-- 
    Document   : itemfound
    Created on : 25 Apr 2022, 1:33:30 PM
    Author     : lubay
--%>

<%@page import="za.ac.tut.entities.Item"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Item Found Page</title>
    </head>
    <body>
        <h1>Item found</h1>
        <%
        Item item =(Item) request.getAttribute("item");
        Long itemId =item.getId();
        String desc = item.getDescription();
        Integer qty = item.getQty();
        Double unitPrice = item.getUnitPrice();
        %>
        <p>
            The item was found. Below are the details of the item.
        </p>
        <table>
                <tr>
                    <td><b>Item id:</b></td>
                    <td><%=itemId%></td>
                </tr>
                <tr>
                    <td><b>Description:</b></td>
                    <td><%=desc%></td>
                </tr>
                <tr>
                    <td><b>Quantity:</b></td>
                    <td><%=qty%></td>
                </tr>
                <tr>
                    <td><b>Unit price:</b></td>
                    <td><%=unitPrice%></td>
                </tr>
            </table>
                <p>
                    Please click here <a href="menu.jsp">here</a> to go back to menu page
                </p>
        
    </body>
</html>

<%-- 
    Document   : itemremoved_outcome
    Created on : 25 Apr 2022, 1:59:21 PM
    Author     : lubay
--%>

<%@page import="za.ac.tut.entities.Item"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Item removed Page</title>
    </head>
    <body>
        <h1>Item removed</h1>
         <%
        Item item =(Item) request.getAttribute("item");
        Long itemId =item.getId();
        
        %>
        
        <p>
            Item <%=itemId%> has been successfully removed from the stock. <br>
            Please click <a href="menu.jsp">here</a> to go back to the menu page.
        </p>
    </body>
</html>

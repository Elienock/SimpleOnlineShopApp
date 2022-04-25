/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.business.ItemFacadeLocal;
import za.ac.tut.entities.Item;

/**
 *
 * @author lubay
 */
public class RemoveItemServlet extends HttpServlet {

    @EJB
    private ItemFacadeLocal itemFacade;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       //Declare Variables
        String location = "itemremoved_outcome.jsp";
        
       //get the id
       Long itemId = Long.parseLong(request.getParameter("itemId"));
       
       
       //invoke the method to find an item
       Item item = itemFacade.findItem(itemId);
       
       //check
       if(item == null){
           //the item was not found
          location="itemnotfound.jsp";
       }else{
           itemFacade.removeItem(item);
           request.setAttribute("item", item);
       }
       
       RequestDispatcher disp = request.getRequestDispatcher(location);
       disp.forward(request, response);
    }
    }



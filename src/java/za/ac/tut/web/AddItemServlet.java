/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
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
public class AddItemServlet extends HttpServlet {

    @EJB
    private ItemFacadeLocal itemFacade;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        Long itemId =Long.parseLong(request.getParameter("itemId"));
        String desc = request.getParameter("desc");
        Integer qty = Integer.parseInt(request.getParameter("qty"));
        Double unitPrice = Double.parseDouble(request.getParameter("unitPrice"));
        
        //item
        Item item = generateItem(itemId,desc,qty,unitPrice);
        
        //add the item to the database
        itemFacade.addItem(item);
        
        //go to the JSP file
        RequestDispatcher  disp = request.getRequestDispatcher("addItem_outcome.jsp");
        disp.forward(request, response);
    }

    private Item generateItem(Long itemId, String desc, Integer qty, Double unitPrice) {
     //declare variables
     Item item;
     Date creationDate;
     
     //instatiate
     item = new Item();
     creationDate = new Date();
     
     //set the items
     item.setId(itemId);
     item.setDescription(desc);
     item.setQty(qty);
     item.setUnitPrice(unitPrice);
     item.setCreationDate(creationDate);
     
     //return an item
     return item;
    }

}

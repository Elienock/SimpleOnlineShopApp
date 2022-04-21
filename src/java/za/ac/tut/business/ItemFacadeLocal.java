/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Item;

/**
 *
 * @author lubay
 */
@Local
public interface ItemFacadeLocal {
    void addItem(Item item);
/*
    void create(Item item); //persist the item

    void edit(Item item); //edit the item

    void remove(Item item); // remove the item

    Item find(Object id); // search item

    List<Item> findAll(); // get all the item that are in the table

    List<Item> findRange(int[] range); // find all the item in a range

    int count(); // get the number of item in the table
*/
    
}

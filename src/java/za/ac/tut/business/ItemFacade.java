/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entities.Item;

/**
 *
 * @author lubay
 */
@Stateless
public class ItemFacade extends AbstractFacade<Item> implements ItemFacadeLocal {

    @PersistenceContext(unitName = "OnlineShopWebAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ItemFacade() {
        super(Item.class);
    }

    @Override
    public void addItem(Item item) {
     //add an item to the database
     create(item);
    }

    @Override
    public Item findItem(Long itemId) {
     return find(itemId);
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package za.mmjmicrosystems.amazonmini.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.mmjmicrosystems.amazonmini.data.OrderedProduct;

/**
 *
 * @author Joseph Mokenela
 */
@Stateless
public class OrderedProductFacade extends AbstractFacade<OrderedProduct> {
    @PersistenceContext(unitName = "AmazonMiniPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public OrderedProductFacade() {
        super(OrderedProduct.class);
    }

}
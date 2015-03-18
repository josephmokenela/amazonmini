/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package za.mmjmicrosystems.amazonmini.data;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Joseph Mokenela
 */
@Embeddable
public class OrderedProductPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "customer_order_id")
    private int customerOrderId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;

    public OrderedProductPK() {
    }

    public OrderedProductPK(int customerOrderId, int productId) {
        this.customerOrderId = customerOrderId;
        this.productId = productId;
    }

    public int getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(int customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) customerOrderId;
        hash += (int) productId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof OrderedProductPK)) {
            return false;
        }
        OrderedProductPK other = (OrderedProductPK) object;
        if (this.customerOrderId != other.customerOrderId) {
            return false;
        }
        if (this.productId != other.productId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.OrderedProductPK[customerOrderId=" + customerOrderId + ", productId=" + productId + "]";
    }

}
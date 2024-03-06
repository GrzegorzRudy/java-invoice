package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
    private ArrayList<Product> products;

    protected Invoice(){
    this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProduct(Product product, Integer quantity) {
        for(int i=0;i<quantity;i++){
            products.add(product);
        }
    }

    public BigDecimal getSubtotal() {
        BigDecimal sum= new BigDecimal("0");
        for(Product next: products){
           sum = sum.add(new BigDecimal("10"));
        }
        if(products.isEmpty())return BigDecimal.ZERO;
        return sum;


    }

    public BigDecimal getTax() {
        return BigDecimal.ZERO;
    }

    public BigDecimal getTotal() {
        return BigDecimal.ZERO;
    }
}

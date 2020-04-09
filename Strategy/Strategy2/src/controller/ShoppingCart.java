package controller;

import model.Product;

import java.awt.*;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Elimane on Apr, 2020, at 07:21
 */
//ITS THE CONTEXT ALLOWING TO EXECUTE EACH ALGORITHM ACCORDING TO THE CALLED CLASS
public class ShoppingCart {

    ArrayList<Product> productList;

    public ShoppingCart()
    {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product)
    {
        productList.add(product);
    }

    public void removeProduct(Product product)
    {
        productList.remove(product);
    }

    public int calculateTotal()
    {
        int sum = 0;

        for(Product product : productList)
        {
            sum += product.getPrice();
        }

        return sum;
    }

    public void pay(Payment paymentStrategy){
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
       // System.out.println(amount);
    }

}

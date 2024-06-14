package org.example.shop;

import org.example.auth.Account;

import java.util.HashMap;
import java.util.Map;

public class Cart{

    private final int cartId;
    private final Account buyerAccount;
    private final Map<Integer, Integer> products;
    private final Map<Integer, Product> productMap;


    public Cart(int cartId, Account buyerAccountId) {
        this.cartId = cartId;
        this.buyerAccount = buyerAccountId;
        this.products = new HashMap<>();
        this.productMap = new HashMap<>();
    }


    public void add(Product product, int quantity) {
        int productId = product.id();
        int currentQuantity = products.getOrDefault(productId, 0);
        products.put(productId, currentQuantity + quantity);
        productMap.put(productId, product);
    }


    public double price() {
        double totalPrice = 0.0;
        for (Map.Entry<Integer, Integer> entry : products.entrySet()) {
            int productId = entry.getKey();
            int quantity = entry.getValue();
            Product product = productMap.get(productId);
            if (product != null) {
                totalPrice += product.price() * quantity;
            }
        }
        return totalPrice;
    }

}
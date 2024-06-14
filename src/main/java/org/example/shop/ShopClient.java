package org.example.shop;
import org.example.auth.Account;

import java.util.ArrayList;
import java.util.List;

public class ShopClient extends Account{

    private List<Cart> carts;

    public ShopClient(int id, String username) {
        super(id, username);
    }
    public List<Cart> getCarts() {
        return this.carts;
    }
    public void addCart(Cart cart) {
        this.carts.add(cart);
    }
}

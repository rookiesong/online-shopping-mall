package net.suncaper.demo.service;

import net.suncaper.demo.domain.Cart;
import net.suncaper.demo.domain.CartProduct;

import java.util.List;

public interface CartService {
    List<Cart> findCart(String name);

    void addCart(String userMailAddress,int number,String productId);

    Cart findCart(String userMailAddress,String productId);

    Cart findCartByCartId(String cartId);


    List<CartProduct> returnCartProduct(String userMailAddress);

    void deleteCart(String userMailaddress, String productId);

    void editCart(String userMailaddress, int numProduct, String productId);
}

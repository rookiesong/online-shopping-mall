package net.suncaper.demo.service;

import net.suncaper.demo.domain.Cart;
import net.suncaper.demo.domain.CartExample;
import net.suncaper.demo.domain.CartProduct;
import net.suncaper.demo.domain.Product;
import net.suncaper.demo.mapper.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartMapper cartMapper;
    @Autowired
    private ProductService productService;
    @Override
    public List<Cart> findCart(String userMailAddress) {
        CartExample example = new CartExample();
        example.createCriteria().andUserMailaddressEqualTo(userMailAddress);
        return cartMapper.selectByExample(example);
    }

    @Override
    public void addCart(String userMailAddress, int number, String productId) {
        Cart cart = findCart(userMailAddress,productId);
        if(cart==null){
            cart = new Cart((userMailAddress+"&"+productId),number,userMailAddress,productId);
            cartMapper.insert(cart);
        }
        else{
            cart.setNumProduct(cart.getNumProduct()+number);
            cartMapper.updateByPrimaryKey(cart);
        }
    }

    @Override
    public Cart findCart(String userMailAddress, String productId) {
        List<Cart> carts = findCart(userMailAddress);
        for (Cart cart:carts) {
            if(cart.getProductId().equals(productId))
                return cart;
        }
        return null;
    }

    @Override
    public Cart findCartByCartId(String cartId) {
        return cartMapper.selectByPrimaryKey(cartId);
    }

    @Override
    public List<CartProduct> returnCartProduct(String userMailAddress) {
        List<Cart> carts = findCart(userMailAddress);
        List<CartProduct> cartProducts = new ArrayList<>();
            for (Cart cart:carts
             ){
                Product product = productService.findProductById(cart.getProductId());
                CartProduct cartProduct = new CartProduct(cart.getCartId(),cart.getNumProduct(),cart.getUserMailaddress(),cart.getProductId(),product.getProductName(),product.getProducer(),product.getProducingArea(),product.getStock(),product.getType(),product.getPrice());
                cartProducts.add(cartProduct);
            }
        return cartProducts;
    }

    @Override
    public List<CartProduct> addOrderCartProduct(String[] cartIds) {
        //添加订单时需要的CartProduct
        List<CartProduct> cartProducts = new ArrayList<>();
        for (String cartId:cartIds
                ){
            Cart cart = cartMapper.selectByPrimaryKey(cartId);
            Product product = productService.findProductById(cart.getProductId());
            CartProduct cartProduct = new CartProduct(cart.getCartId(),cart.getNumProduct(),cart.getUserMailaddress(),cart.getProductId(),product.getProductName(),product.getProducer(),product.getProducingArea(),product.getStock(),product.getType(),product.getPrice());
            cartProducts.add(cartProduct);
        }
        return cartProducts;    }

    @Override
    public void deleteCart(String userMailaddress, String productId) {
        cartMapper.deleteByPrimaryKey(userMailaddress+"&"+productId);
    }

    @Override
    public void deleteCart(String cartId) {
        cartMapper.deleteByPrimaryKey(cartId);
    }

    @Override
    public void editCart(String userMailaddress, int numProduct, String productId) {
        Cart cart = findCart(userMailaddress,productId);
        cart.setNumProduct(numProduct);
        cartMapper.updateByPrimaryKey(cart);
    }


}

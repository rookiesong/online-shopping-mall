package net.suncaper.demo.service;

import net.suncaper.demo.domain.Cart;
import net.suncaper.demo.domain.Orders;
import net.suncaper.demo.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private CartService cartService;
    @Autowired
    private ProductService productService;

    @Override
    public String addOrder(String[] cartIds, String userMailaddress) {
        Timestamp build_day = new Timestamp(System.currentTimeMillis());
        String ordersId = build_day.toString()+"&"+userMailaddress;
        for (String cartId:cartIds
                ) {
            Cart cart=cartService.findCartByCartId(cartId);
            Integer price = productService.findProductById(cart.getProductId()).getPrice();
            Orders orders = new Orders(ordersId,null,cart.getProductId(),userMailaddress,cart.getNumProduct(),price,null,"正常");
            ordersMapper.insert(orders);
        }
        return "ok";
    }

    @Override
    public String deleteOrder(String ordersId) {
        ordersMapper.deleteByPrimaryKey(ordersId);
        return "ok";
    }

    @Override
    public String editOrder(String ordersId,String newStatus) {
        Orders orders = findOrder(ordersId);
        orders.setStatus(newStatus);
        ordersMapper.updateByPrimaryKey(orders);
        return "ok";
    }

    @Override
    public Orders findOrder(String ordersId) {
        return ordersMapper.selectByPrimaryKey(ordersId);
    }

    @Override
    public List<Orders> showOrder(String userMailAddress) {

        return null;
    }
}

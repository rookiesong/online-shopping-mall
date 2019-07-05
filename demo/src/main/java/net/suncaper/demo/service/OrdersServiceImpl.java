package net.suncaper.demo.service;

import net.suncaper.demo.domain.Cart;
import net.suncaper.demo.domain.DeliveryAddress;
import net.suncaper.demo.domain.Orders;
import net.suncaper.demo.domain.OrdersExample;
import net.suncaper.demo.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private CartService cartService;
    @Autowired
    private ProductService productService;
    @Autowired
    private DeliveryAddressService deliveryAddressService;

    @Override
    public List<Orders> addOrder(String[] cartIds, String userMailaddress,int id) {
        List<Orders> ordersList = new ArrayList<>();
        for (String cartId:cartIds
                ) {
            Timestamp build_day = new Timestamp(System.currentTimeMillis());
            String ordersId = build_day.toString()+"&"+userMailaddress;
            Cart cart=cartService.findCartByCartId(cartId);
            Integer price = productService.findProductById(cart.getProductId()).getPrice();
            String productName = productService.findProductById(cart.getProductId()).getProductName();
            DeliveryAddress deliveryAddress = deliveryAddressService.findExactOne(id);
            String address = deliveryAddress.getAddress();
            String userPhone = deliveryAddress.getUserPhone();
            String name = deliveryAddress.getName();
            Orders orders = new Orders(ordersId,null,cart.getProductId(),userMailaddress,cart.getNumProduct(),price,"unpaied",productName,address,userPhone,name);
            ordersMapper.insertSelective(orders);
            ordersList.add(orders);
            cartService.deleteCart(cartId);
        }
        return ordersList;
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
        OrdersExample example = new OrdersExample();
        example.createCriteria().andUserMailaddressEqualTo(userMailAddress);
        return ordersMapper.selectByExample(example);
    }

    @Override
    public int countPrice(List<Orders> ordersList) {
        int sum = 0;
        for (Orders orders:ordersList
             ) {
            sum += orders.getNumber()*orders.getPrice();
        }
        return sum;
    }
}

package net.suncaper.demo.service;

import net.suncaper.demo.domain.Orders;

import java.util.List;

public interface OrdersService {
    public String addOrder(String[] cartIds,String userMailAddress);

    public String deleteOrder(String ordersId);

    public String editOrder(String ordersId,String newStatus);

    public Orders findOrder(String ordersId);

    public List<Orders> showOrder(String userMailAddress);

}

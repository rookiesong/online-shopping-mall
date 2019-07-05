package net.suncaper.demo.service;

import net.suncaper.demo.domain.DeliveryAddress;

import java.util.List;

public interface DeliveryAddressService {

    List<DeliveryAddress> findDeliveryAddress(String userMailAddress);

    String deleteDeliveryAddress(int id);

    String addDeliveryAddress(String name,String userMailAddress,String address,String user_phone);

    DeliveryAddress findExactOne(int id);

}

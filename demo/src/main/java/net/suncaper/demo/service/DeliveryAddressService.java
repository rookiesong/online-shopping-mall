package net.suncaper.demo.service;

import net.suncaper.demo.domain.DeliveryAddress;

import java.util.List;

public interface DeliveryAddressService {

    List<DeliveryAddress> findDeliveryAddress(String userMailAddress);

    String deleteDeliveryAddress(String name,String userMailAddress,String address,int user_phone);

    String addDeliveryAddress(String name,String userMailAddress,String address,int user_phone);

    String findDeliveryAddress(String userMailAddress,String address);


}

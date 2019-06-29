package net.suncaper.demo.service;

import net.suncaper.demo.domain.DeliveryAddress;

import java.util.List;

public interface DeliveryAddressService {

    List<DeliveryAddress> findDeliveryAddress(String userMailAddress);

    String deleteDeliveryAddress(String userMailAddress,String address);

    String addDeliveryAddress(String userMailAddress,String address);

    String findDeliveryAddress(String userMailAddress,String address);


}

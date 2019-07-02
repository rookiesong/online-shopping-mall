package net.suncaper.demo.service;

import net.suncaper.demo.domain.DeliveryAddress;
import net.suncaper.demo.domain.DeliveryAddressExample;
import net.suncaper.demo.mapper.DeliveryAddressMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryAddressServiceImpl implements DeliveryAddressService{
    private DeliveryAddressMapper deliveryAddressMapper;
    @Override
    public List<DeliveryAddress> findDeliveryAddress(String userMailAddress) {
        DeliveryAddressExample example = new DeliveryAddressExample();
        example.createCriteria().andUserMailaddressEqualTo(userMailAddress);
        return deliveryAddressMapper.selectByExample(example);
    }

    @Override
    public String deleteDeliveryAddress(String name,String userMailAddress,String address,int user_phone) {
        DeliveryAddressExample example = new DeliveryAddressExample();
        example.or().andUserMailaddressEqualTo(userMailAddress).andAddressEqualTo(address).andNameEqualTo(name).andUserPhoneEqualTo((long)user_phone);
        deliveryAddressMapper.deleteByExample(example);
        return "ok";
    }

    @Override
    public String addDeliveryAddress(String name,String userMailAddress, String address,int user_phone) {
        DeliveryAddress deliveryAddress = new DeliveryAddress(address,(long)user_phone,name,userMailAddress);
        try{
            deliveryAddressMapper.insert(deliveryAddress);
            return "ok";
        }catch (Exception exception){
            return "no";
        }
    }

    @Override
    public String findDeliveryAddress(String userMailAddress, String address) {
        DeliveryAddressExample example = new DeliveryAddressExample();
        example.or().andUserMailaddressEqualTo(userMailAddress).andAddressEqualTo(address);
        List<DeliveryAddress> deliveryAddresses= deliveryAddressMapper.selectByExample(example);
        if(deliveryAddresses ==null)
            return "no";
        else
            return "ok";
    }
}

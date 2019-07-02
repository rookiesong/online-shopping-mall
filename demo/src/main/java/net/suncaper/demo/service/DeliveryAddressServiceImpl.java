package net.suncaper.demo.service;

import net.suncaper.demo.domain.DeliveryAddress;
import net.suncaper.demo.domain.DeliveryAddressExample;
import net.suncaper.demo.mapper.DeliveryAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryAddressServiceImpl implements DeliveryAddressService{
    @Autowired
    private DeliveryAddressMapper deliveryAddressMapper;
    @Override
    public List<DeliveryAddress> findDeliveryAddress(String userMailAddress) {
        DeliveryAddressExample example = new DeliveryAddressExample();
        example.createCriteria().andUserMailaddressEqualTo("%"+userMailAddress+"%");
        List<DeliveryAddress> deliveryAddresses =deliveryAddressMapper.selectByExample(example);
        return deliveryAddresses;
    }

    @Override
    public String deleteDeliveryAddress(int id) {
        deliveryAddressMapper.deleteByPrimaryKey(id);
        return "ok";
    }

    @Override
    public String addDeliveryAddress(String name,String userMailAddress, String address,String user_phone) {
        DeliveryAddress deliveryAddress = new DeliveryAddress(null,address,(String)user_phone,name,userMailAddress);
        try{
            deliveryAddressMapper.insert(deliveryAddress);
            return "ok";
        }catch (Exception exception){
            return "no";
        }
    }


}

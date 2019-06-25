package net.suncaper.demo.service;

import net.suncaper.demo.domain.customer;
import net.suncaper.demo.domain.customerExample;
import net.suncaper.demo.mapper.customerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private customerMapper customerMapper;
    @Override
    public List<customer> findUser(String name) {

        customerExample example = new customerExample();
        if(name != null && !name.equals("")) {
            example.createCriteria().andNameLike("%" + name + "%");
        }

        return customerMapper.selectByExample(example);    }



    @Override
    public void saveCustomer(customer customer) {
        if(customer.getId() == null || customer.getId().equals("")) {
            customerMapper.insert(customer);
        } else {
            customerMapper.updateByPrimaryKey(customer);
        }
    }

    @Override
    public void deleteUserById(String id) {
        customerExample customerExample = new customerExample();
        customerExample.createCriteria().andIdEqualTo(id);
        customerMapper.deleteByExample(customerExample);
    }

    @Cacheable("customer")
    public customer findUserByID(String id){
        return customerMapper.selectByPrimaryKey(id);
    }


}

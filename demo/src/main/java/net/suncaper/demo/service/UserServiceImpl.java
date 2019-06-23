package net.suncaper.demo.service;

import net.suncaper.demo.domain.customer;
import net.suncaper.demo.domain.customerExample;
import net.suncaper.demo.mapper.customerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private customerMapper customerMapper;
    @Override
    public List<customer> findUser() {

        return customerMapper.selectByExample(new customerExample());
    }

    @Override
    public void saveCustomer(customer customer) {
        customerMapper.insert(customer);
    }
}

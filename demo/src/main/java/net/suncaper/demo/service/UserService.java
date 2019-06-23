package net.suncaper.demo.service;

import net.suncaper.demo.domain.customer;

import java.util.List;

public interface UserService {
    List<customer> findUser();
    void saveCustomer (customer customer);


    void deleteUserById(String id);
}

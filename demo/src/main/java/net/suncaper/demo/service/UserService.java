package net.suncaper.demo.service;

import net.suncaper.demo.domain.customer;

import java.util.List;

public interface UserService {
    void saveCustomer (customer customer);


    void deleteUserById(String id);
    public customer findUserByID(String id);

    List<customer>  findUser(String name);
}

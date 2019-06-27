package net.suncaper.demo.service;

import net.suncaper.demo.domain.User;

import java.util.List;

public interface UserService {

    List<User> findUser(String name);

    void saveUser(User user);

    void deleteUserById(String id);

    User findUserByUserMailAddress(String userMailAddress);

    String loginService(String id,String code);

    Boolean isExist(String userMailAddress);

    void editUser(User user);

}

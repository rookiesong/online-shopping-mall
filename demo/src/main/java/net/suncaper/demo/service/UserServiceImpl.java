package net.suncaper.demo.service;

import net.suncaper.demo.domain.User;
import net.suncaper.demo.domain.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.suncaper.demo.mapper.UserMapper;

import java.sql.Timestamp;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUser(String name) {
        UserExample example = new UserExample();
        if(name != null && !name.equals("")) {
            example.createCriteria().andUserMailaddressLike("%" + name + "%");
        }

        return userMapper.selectByExample(example);
    }

    @Override
    public void saveUser(User user) {
        Timestamp build_day = new Timestamp(System.currentTimeMillis());
        user.setBuildDay(build_day);
        if(user.getUserMailaddress() != null &&  (!user.getUserMailaddress().equals(""))) {
            userMapper.insertSelective(user);
        } else {
            userMapper.updateByPrimaryKey(user);
        }
    }

    @Override
    public void deleteUserById(String userMailAddress) {
        userMapper.deleteByPrimaryKey(userMailAddress);
    }


    @Override
    public User findUserByUserMailAddress(String userMailAddress) {
        return userMapper.selectByPrimaryKey(userMailAddress);
    }

    @Override
    public String loginService(String id, String code) {
        return null;
    }

    @Override
    public Boolean isExist(String userMailAddress) {
        if(userMapper.selectByPrimaryKey(userMailAddress)==null)
            return false;
        else
            return true;
    }


}

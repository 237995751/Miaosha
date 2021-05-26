package com.imooc.miaosha.service;

import com.imooc.miaosha.dao.UserDao;
import com.imooc.miaosha.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author shkstart
 * @date 2021/5/7 - 10:35
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;//this is a interface

    public User getById(int id){
        User user = userDao.getById(id);
        return user;
    }

    @Transactional
    public boolean tx() {
        User u2 = new User();
        u2.setId(3);
        u2.setName("rxl3");
        userDao.insert(u2);

        User u1 = new User();
        u1.setId(1);
        u1.setName("rxl1");
        userDao.insert(u1);

        return true;
    }


}

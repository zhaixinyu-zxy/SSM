package com.baizhi.service;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
@Transactional
@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    private UserDAO userDAO;



    @Override
    public void modifysave(User user) {
        user.setId(UUID.randomUUID().toString());
            userDAO.save(user);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public User selectOne(User user) {
        User user1 = userDAO.selectOne(user);
        return user1;
    }

    @Override
    public User modifyupdate(User user) {
            userDAO.update(user);
            return user;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<User> selectAll() {
        List<User> users = userDAO.selectAll();

        return users;
    }

    @Override

    public void modifydeletByID(String id) {
        userDAO.deletByID(id);

    }
}

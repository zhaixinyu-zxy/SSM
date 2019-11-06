package com.baizhi.service;

import com.baizhi.dao.ManagerDAO;
import com.baizhi.entity.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ManagerServiceImpl implements ManagerService{
    @Autowired
    private ManagerDAO managerDAO;


    @Override
    public void modfiyinsert(Manager manager) {
        managerDAO.insert(manager);

    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public void loginManager(Manager manager) {
        Manager u = managerDAO.select(manager.getName());

            if (u == null) throw new RuntimeException("用户名错误");
            String password1 = manager.getPassword();//在获取一次加密过后的密码
            if (!password1.equals(u.getPassword())) throw new RuntimeException("密码错误");

    }
}

package com.baizhi.test;


import com.baizhi.dao.ManagerDAO;
import com.baizhi.dao.UserDAO;
import com.baizhi.entity.Manager;
import com.baizhi.entity.User;
import com.baizhi.service.ManagerService;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
//开启Spring的注解版测试
@RunWith(SpringJUnit4ClassRunner.class)
//作用:读取spring的配置文件自动创建Spring工厂
@ContextConfiguration("classpath:applicationContext.xml")
public class test {
    @Autowired //自动注入实现类对象
    private UserService userService;
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private ManagerDAO managerDAO;
    @Autowired
    private ManagerService managerService;
    @Test
    public void test1() {

        Manager manager = new Manager("小小", "张晓", "123456", "女");
        managerDAO.insert(manager);
      // studentDAO.delete("3");

    }

    @Test
    public void test2() {

        Manager manager = new Manager("小张", "张三", "123456", "男");
        managerService.modfiyinsert(manager);


    }
    @Test
    public void test3() {

        Manager manager = new Manager();

        Manager abc = managerDAO.select("abc");
        System.out.println(abc);


    }
    @Test
    public void test4() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO = (UserDAO) ac.getBean("userDAO");
        User user=new User("2","小白",1234.00,5);

        userDAO.save(user);


    }
    @Test
    public void test5() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userDAO= (UserService) ac.getBean("userServiceImpl");

        List<User> users = userDAO.selectAll();
        System.out.println(users);


    }
    @Test
    public void test6() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userDAO= (UserService) ac.getBean("userServiceImpl");
            User u=new User();
            u.setAge(15);
            u.setSalary(123.0);
            u.setUsername("小黑");
            u.setId("2");
        userDAO.modifyupdate(u);


    }

}

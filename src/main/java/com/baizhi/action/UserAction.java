package com.baizhi.action;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller //自动创建Action对象
@Scope(value = "prototype") //每次创建新的Action对象
public class UserAction extends ActionSupport {
    //接收数据

    private String id;
    private User user;
    private List<User> users;
    public String getId() { return id;}
    public void setId(String id) { this.id = id;}
    public List<User> getUsers() {return users; }
    public void setUsers(List<User> users) { this.users = users; }
    @Autowired
    private UserService userService;

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user;}
    public  String  register(){
        userService.modifysave(user);
        return "insertSuccess";
    }

    public  String  showAll(){
        users = userService.selectAll();
        return  "showAllSuccess";
    }

    public  String  deleteByID(){
        userService.modifydeletByID(id);
        return  "deleteSuccess";
    }
    public String update(){
        User user1 = userService.modifyupdate(user);
        System.out.println(user1);
        return "updateSuccess";
    }
    public String selectOne(){
         user = userService.selectOne(user);
        return "selectOneSuccess";
    }
}

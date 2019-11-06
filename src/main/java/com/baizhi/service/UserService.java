package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

public interface UserService {
    //插入
    public  void  modifysave(User user);
    //查询单个数据
    public User selectOne(User user);
    //修改
    public  User modifyupdate(User user);
    //查询所有
    public List<User> selectAll();
    //通过ID删除
    public void  modifydeletByID(String id);
}

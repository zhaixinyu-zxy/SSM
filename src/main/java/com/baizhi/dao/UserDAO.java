package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDAO {

    //插入
    public  void  save(User user);
    //查询单个数据
    public User selectOne(User user);
    //修改
    public  void update(User user);
    //查询所有
    public List<User> selectAll();
    //通过ID删除
    public void  deletByID(String id);
}

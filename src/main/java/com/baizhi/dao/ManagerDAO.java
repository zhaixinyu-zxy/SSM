package com.baizhi.dao;

import com.baizhi.entity.Manager;

public interface ManagerDAO {
    public void insert(Manager manager);
    public Manager select(String name);

}

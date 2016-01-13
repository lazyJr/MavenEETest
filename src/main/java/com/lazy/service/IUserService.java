package com.lazy.service;

import com.lazy.pojo.User;

/**
 * Created by Administrator on 2016/1/12 0012.
 */
public interface IUserService {
    public User getUserById(int userId);
    public void deleteById(int id);
    public void insert(int id,String name,String password);
}


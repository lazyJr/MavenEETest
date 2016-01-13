package com.lazy.service.serviceImpl;


import com.lazy.dao.IUserDao;
import com.lazy.pojo.User;
import com.lazy.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userService")
public class UserServiceImpl implements IUserService {
  @Resource
  private IUserDao userDao;

  public User getUserById(int userId) {

    return this.userDao.selectByPrimaryKey(userId);
  }
  public void deleteById(int id){
     this.userDao.deleteByPrimaryKey(1);
  }

  public void insert(int id, String name, String password) {
    User user = new User();
    user.setId(2);
    user.setUserName("adaf");
    user.setPassword("asdfa");
    user.setAge(12);
    this.userDao.insert(user);
  }
}
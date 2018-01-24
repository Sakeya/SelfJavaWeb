package com.laffey.dao;

import com.laffey.model.User;

import java.util.List;

/**
 * Created by laffey on 2018/1/24.
 */
public interface IUserDao {
    void save(User user);

    boolean update(User user);

    boolean delete(int id);

    User findById(int id);

    List<User> findAll();
}

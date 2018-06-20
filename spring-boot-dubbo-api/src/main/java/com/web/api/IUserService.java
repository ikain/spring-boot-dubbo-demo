package com.web.api;

import com.web.entity.UserEntity;

import java.util.List;

/**
 * Created by FengKai on 2018/6/19.
 */
public interface IUserService {

    List<UserEntity> findUsers(String name, Integer sex);

    void saveUser(UserEntity user);

    void updateUser(UserEntity user);

    UserEntity getUserById(String id);

    void deleteUser(String id);
}

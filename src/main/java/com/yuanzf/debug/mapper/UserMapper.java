package com.yuanzf.debug.mapper;

import com.yuanzf.debug.model.UserModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<UserModel> getUserByName(String userName);

    List<UserModel> getAllUserList();

    int countList();

    void insertUser(UserModel model);

    void updateUser(UserModel use);

    UserModel findUserById(@Param("id") String id);
}

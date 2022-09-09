package com.kuang.mapper;

import com.kuang.pojo.User;
import com.kuang.pojo.User;

import java.util.List;

/**
 * @author HC
 * @version 1.0
 */
public interface UserMapper {
    public  List<User> selectUser();



//    添加一个事务
public int addUser(User user);

//删除一个事务
    public int deleteUser(int id);
}

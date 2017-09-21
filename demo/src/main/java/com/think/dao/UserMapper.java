package com.think.dao;
import com.think.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/9/18.
 */
@Repository
public interface UserMapper {
    public int insert(User user);
    public User selectByUserName(String userName);
}

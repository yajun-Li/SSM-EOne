package cn.Liyajun.Dao;

import cn.Liyajun.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author jun
 * @date 2021/1/14-21:54
 */
@Mapper
//    @Repository("userDao")
public interface UserDao {
    public int login(User user);
    public List<User> getAllUser();
    public int addUser(User user);
}

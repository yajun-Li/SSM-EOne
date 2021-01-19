package cn.Liyajun.Service.Impl;

import cn.Liyajun.Dao.UserDao;
import cn.Liyajun.Service.UserService;
import cn.Liyajun.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author jun
 * @date 2021/1/14-21:28
 */

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao UserDao;
    public boolean login(User user){
        if (UserDao.login(user)==1){
            return true;
        }
        return false;
    }
    @Override
    public void getAllUser(){

    }

    @Override
    public int addUser(User user) {
        int i = UserDao.addUser(user);
        return i;
    }
}

package cn.Liyajun.Service;

import cn.Liyajun.pojo.User;

/**
 * @author jun
 * @date 2021/1/15-12:56
 */
public interface UserService {
    public boolean login(User user);
    public void getAllUser();
    public int addUser(User user);
}

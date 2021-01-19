package cn.Liyajun.Controller;

import cn.Liyajun.Service.UserService;
import cn.Liyajun.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;

/**
 * @author jun
 * @date 2021/1/14-21:27
 */
@Controller
public class UserController {
    @Autowired
    UserService userServiceImpl;
    @RequestMapping("login")
    public String login(User user){
        if (userServiceImpl.login(user)){
            return "success";
        }
        return "redirect:/index.jsp";
    }
    @RequestMapping("addUser")
    public String addUser(User user){
        int i = userServiceImpl.addUser(user);
        if (i==1){
            return "redirect:/index.jsp";
        }
        return null;
    }
}

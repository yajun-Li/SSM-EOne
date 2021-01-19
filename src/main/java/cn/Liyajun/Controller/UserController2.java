package cn.Liyajun.Controller;

import cn.Liyajun.Service.UserService;
import cn.Liyajun.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.incrementer.HanaSequenceMaxValueIncrementer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jun
 * @date 2021/1/15-22:40
 */
@Controller
public class UserController2 {
    @Autowired
    UserService userServiceImpl;
    @RequestMapping("login2")
    @ResponseBody
    public Map<String,Object> login2(User user){
        System.out.println(userServiceImpl.login(user));
        HashMap<String, Object> map = new HashMap<>();
        if (userServiceImpl.login(user)){
            System.out.println(user);
            map.put("name",user.getName());
            map.put("page","success");
        }else {
            map.put("page","error");
        }
        return map;
    }
    @RequestMapping("addUser2")
    @ResponseBody
    public Map<String,Object> addUser(User user){
        int i = userServiceImpl.addUser(user);
        HashMap<String, Object> hashMap = new HashMap<>();
        if (i==1){
            hashMap.put("mark",1);
        }else {
            hashMap.put("mark",0);
        }
        return hashMap;
    }
}

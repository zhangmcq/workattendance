package com.coder520.user.contoller;

import com.coder520.user.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class userController {
    @RequestMapping("/index")
    public String user(){
        User user = new User();
        user.setMobile("112222");
        user.setUsername("laowang");
        return "user";
    }

}

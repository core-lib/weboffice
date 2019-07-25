package io.weboffice.web.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 *
 * @author Payne 646742615@qq.com
 * 2019/7/25 13:16
 */
@RestController
public class UserController {

    /**
     * 登陆接口
     *
     * @param username 用户名
     * @param password 密码
     * @return 登陆结果
     */
    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {

        return "OK";
    }

}

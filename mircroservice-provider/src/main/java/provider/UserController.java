package provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //注入service
    @Autowired UserService userService;

    /*
     * 用户信息查询的接口
     */
    @GetMapping(value = "/getUserInfo/{id}")
    public User queryUserInfo(@PathVariable("id") Long id) {
        return userService.queryUserInfo(id);
    }

}
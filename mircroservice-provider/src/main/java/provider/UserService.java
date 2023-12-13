package provider;

import org.springframework.stereotype.Service;
import java.util.HashMap;
@Service
public class UserService {
 
    private static HashMap<Long, User> userMap = new HashMap<Long, User>();

    static {
        //添加数据
        userMap.put(1l, new User(1l,"张三"));
        userMap.put(2l, new User(2l,"李四"));
    }

     
    public User queryUserInfo(Long id) {
        return userMap.get(id);
    }
}

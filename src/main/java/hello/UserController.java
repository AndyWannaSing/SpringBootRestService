package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Andy
 * @time: 2019/3/16 17:33
 * @since
 */
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/user")
    public User getUser(@RequestParam(value="phone", defaultValue="1111") String phone) {
        return userDao.findOneUser(phone);
    }
}

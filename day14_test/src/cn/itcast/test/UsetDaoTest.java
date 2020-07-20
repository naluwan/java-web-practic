package cn.itcast.test;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import org.junit.Test;

public class UsetDaoTest {

    @Test
    public void testLogin(){
        User loginguser = new User();
        loginguser.setUsername("naluwan");
        loginguser.setPassword("1230");

        UserDao dao = new UserDao();
        User user = dao.login(loginguser);

        System.out.println(user);
    }
}

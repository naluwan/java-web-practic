package cn.itcast.dao;

//操作數據庫中User表的類

import cn.itcast.domain.User;
import cn.itcast.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {

    //聲明JDBCTemplate對象共用
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    /**
     * 登入方法
     * @param loginUser 只有用戶名和密碼
     * @return user包含用戶全部數據
     */
    public User login(User loginUser){
        //1.編寫sql
        String sql = "select * from user where username = ? and password = ?";
        //2.調用query方法
        User user = template.queryForObject(sql,
                new BeanPropertyRowMapper<User>(User.class),loginUser.getUsername(),loginUser.getPassword());

        return user;
    }
}

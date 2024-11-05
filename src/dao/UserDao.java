package dao;

import model.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import utils.DataSourceUtils;


public class UserDao {
    public void addUser(User user) throws Exception {
        QueryRunner r = new QueryRunner(DataSourceUtils.getDataSource());
        String sql ="insert into user(username,email,password,name,phone,isadmin,isvalidate) values(?,?,?,?,?,?,?)";
        r.update(sql,user.getUsername(),user.getEmail(),user.getAddress(),user.getName(),user.getPassword(),user.getPhone(),user.isAdmin(),user.isValidate());

    }

    public boolean isUsernameExist(String username) throws Exception {
        QueryRunner r = new QueryRunner(DataSourceUtils.getDataSource());
        String sql ="select count(*) from user where username=?";
        User u = r.query(sql, new BeanHandler<User>(User.class), username);
        if(u==null){
            return false;
        }
        else {
            return true;
        }
    }

    public boolean isEmailExist(String email) throws Exception {
        QueryRunner r = new QueryRunner(DataSourceUtils.getDataSource());
        String sql ="select count(*) from user where email=?";
        User u = r.query(sql, new BeanHandler<User>(User.class), email);
        if(u==null){
            return false;
        }
        else {
            return true;
        }
    }

}

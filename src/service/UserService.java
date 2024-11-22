package service;

import dao.UserDao;
import model.User;

import java.sql.SQLException;

public class UserService {

    private UserDao uDao = new UserDao();

    public boolean register(User user) {

        try {
            if(uDao.isUsernameExist(user.getUsername())){
                return false;
            }
            if(uDao.isEmailExist(user.getEmail())){
                return false;
            }
            uDao.addUser(user);
            return true;
            // ! catch(SQLException e)
        }catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return false;
    }

    public User login(String ue, String password) {
        User user = null;
        try {
            user = uDao.selectByUsernamePassword(ue, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (user != null) {
            return user;
        }
        try{
            user=uDao.selectByEmailPassword(ue,password);
        }catch (SQLException e){
            e.printStackTrace();
        }
        if(user!=null){
            return null;
        }


        return null;

    }






}


package dao;

import model.*;

public class app {
    public static void main(String[] args) {
        Login login = new Login("john","123456");
        User user = UserDao.checkLogin(login);
        for (User u:UserDao.users) {
            if (u.getAccount().equals(login.getAccount())){
                System.out.println("ok");
            }
        }
        //System.out.println(user.getAccount());
    }
}

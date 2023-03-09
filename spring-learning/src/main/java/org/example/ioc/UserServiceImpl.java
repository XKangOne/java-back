package org.example.ioc;

/***
 * @description:
 * @author: yk
 * @date:
 * @param:
 * @return:
 **/
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    private String str;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "str='" + str + '\'' +
                '}';
    }

    @Override
    public void say() {
        this.userDao.say();
        System.out.println("userService say hello world!");
    }
}

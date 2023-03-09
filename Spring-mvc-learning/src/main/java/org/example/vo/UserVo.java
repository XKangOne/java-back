package org.example.vo;
import org.example.entity.LoginUser;


import java.util.List;

/***
 * @description:
 * @author: yk
 * @date:
 * @param:
 * @return:
 **/
public class UserVo {
    private List<LoginUser> users;

    public List<LoginUser> getUsers() {
        return users;
    }

    public void setUsers(List<LoginUser> users) {
        this.users = users;
    }
}

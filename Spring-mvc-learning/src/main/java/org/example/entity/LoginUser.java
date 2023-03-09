package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * @description:
 * @author: yk
 * @date:
 * @param:
 * @return:
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginUser {
    private Integer id;
    private String username;
    private String password;
}

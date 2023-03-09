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
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardItem {
    private String name;
    private String cover;
    private String des;

}

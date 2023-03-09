package org.example.ioc;

import org.example.ioc.entity.Cat;
import org.example.ioc.entity.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @description:
 * @author: yk
 * @date:
 * @param:
 * @return:
 **/
public class SetterDlTest {
    public static void main(String[] args) {
        String xmlPath = "/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
//        UserService userService = (UserService) ac.getBean("userService");
//        userService.say();
//        System.out.println(userService.toString());

        Dog dog = (Dog)ac.getBean("dog");
        System.out.println(dog);
        Cat cat = (Cat)ac.getBean("cat");
        System.out.println(cat);
    }
}

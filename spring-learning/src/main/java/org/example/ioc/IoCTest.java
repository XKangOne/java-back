package org.example.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @description:
 * @author: yk
 **/
public class IoCTest {
    public static void main(String[] args) {
        //1.创建文件路径
        String xmlPath = "/applicationContext.xml";
        //2.创建Spring核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        //3.读取配置好的bean
        UserDao userDao = (UserDao) ac.getBean("userDao");
        userDao.say();
    }
}

package org.example.ioc;

import org.example.ioc.entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @description:
 * @author: yk
 * @date:
 * @param:
 * @return:
 **/
public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        SpringApplication.animalBean(context);
//        SpringApplication.bookBean(context);
//          SpringApplication.clothesBean(context);
          SpringApplication.schoolBagBean(context);
    }

    private static void schoolBagBean(ApplicationContext context) {
        SchoolBag schoolBag = context.getBean("schoolBag", SchoolBag.class);
        System.out.println(schoolBag.getColor());
        System.out.println(schoolBag.getPencilCase());
    }

//    private static void clothesBean(ApplicationContext context) {
//        Person boy = context.getBean("boy", Person.class);
//        Person girl = context.getBean("girl", Person.class);
//        boy.dress();
//        girl.dress();
//    }

    //    private static void animalBean(ApplicationContext context) {
//        Cat cat = context.getBean("cat", Cat.class);
//        Dog dog = context.getBean("dog", Dog.class);
//        System.out.println(cat);
//        System.out.println(dog);
//    }
//    private static void bookBean(ApplicationContext context) {
//        Book book1 = context.getBean("book1", Book.class);
//        Book book2 = context.getBean("book2", Book.class);
//        System.out.println(book1);
//        System.out.println(book2);
//    }
}

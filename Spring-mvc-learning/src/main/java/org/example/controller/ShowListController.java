package org.example.controller;

import org.example.entity.CardItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;
import java.util.List;
/***
 * @description:
 * @author: yk
 **/
public class ShowListController {
    @GetMapping("list")
    public ModelAndView getList(){
        CardItem cardItem1 = new CardItem("Microservices", "1.jpg", "Quickly deliver production‑grade features with independently evolvable microservices.");
        CardItem cardItem2 = new CardItem("Reactive", "2.jpg", "Spring's asynchronous, nonblocking architecture means you can get more from your computing resources.");
        CardItem cardItem3 = new CardItem("Cloud", "3.jpg", "Your code, any cloud—we’ve got you covered. Connect and scale your services, whatever your platform.");
        CardItem cardItem4 = new CardItem("Web apps", "4.jpg", "Frameworks for fast, secure, and responsive web applications connected to any data store.");
        CardItem cardItem5 = new CardItem("Serverless", "5.jpg", "The ultimate flexibility. Scale up on demand and scale to zero when there’s no demand.");
        CardItem cardItem6 = new CardItem("Event Driven", "6.jpg", "Integrate with your enterprise. React to business events. Act on your streaming data in realtime.");
        CardItem cardItem7 = new CardItem("Batch", "7.jpg", "Automated tasks. Offline processing of data at a time to suit you.");
        List<CardItem> cardItems = new ArrayList<>();
        cardItems.add(cardItem1);
        cardItems.add(cardItem2);
        cardItems.add(cardItem3);
        cardItems.add(cardItem4);
        cardItems.add(cardItem5);
        cardItems.add(cardItem6);
        cardItems.add(cardItem7);
        //创建list视图
        ModelAndView modelAndView = new ModelAndView("list");
        //把cardItemList放在list视图中
        modelAndView.addObject("list",cardItems);

        return modelAndView;
    }
}

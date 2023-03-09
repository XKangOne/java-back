package org.example.ioc.entity;

/***
 * @description:
 * @author: yk
 **/
public class Clothes {
    private String style;
    private String color;

    public Clothes(String style, String color) {
        this.style = style;
        this.color = color;
    }

    public Clothes() {
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String dress(){
        return "爱穿"+color+style;
    }
}

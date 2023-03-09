package org.example.ioc.entity;

/***
 * @description:
 * @author: yk
 * @date:
 * @param:
 * @return:
 **/
public class Person {
    private String name;
    private Clothes clothes;

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, Clothes clothes) {
        this.name = name;
        this.clothes = clothes;
    }

    public Person() {
    }

    public void dress(){
        System.out.println(name+"爱穿"+clothes.getColor()+clothes.getStyle());
    }
}

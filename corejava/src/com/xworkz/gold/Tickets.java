package com.xworkz.gold;

public class Tickets {
    String name;
    int price;
    public Tickets(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void display(){
        System.out.println("name of ticket:" +name);
        System.out.println("price:" +price);
    }
}

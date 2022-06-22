package com.company.OOP;

public class Bear {
    private int weight;
    private int height;
    private int age;
    private String name;
    //class constructor
    public Bear(int weight, int height, int age, String name){
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.name = name;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

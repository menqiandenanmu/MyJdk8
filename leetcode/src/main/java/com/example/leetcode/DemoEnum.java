package com.example.leetcode;

public enum DemoEnum {
    INSTANCE ;
    private int age=19;

    public DemoEnum setAge(int age){
        this.age=age;
        return INSTANCE;
    }
    public DemoEnum getInstance(){
        return INSTANCE;
    }

    public int getAge(){
       return this.age;
    }
}

package com.driver;
import java.lang.String;

public class Main {
    public static void main(String[] args){

        RWOnly obj = new RWOnly("helloww");
        ////////obj.name = "hello";
        /////////System.out.println(obj.name); //name has private access in com.driver.RWOnly
        obj.setName("Abhishek");
        String ans = obj.getName();

    }
}
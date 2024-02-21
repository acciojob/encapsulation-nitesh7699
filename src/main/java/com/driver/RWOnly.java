package com.driver;

public class RWOnly {
    
    private String name;

    public RWOnly(String name){
        this.name = name;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}

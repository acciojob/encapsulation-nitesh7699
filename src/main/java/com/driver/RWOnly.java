package com.driver;
import java.lang.*;

public class RWOnly {
    
    private String name="Nitesh";

    public RWOnly(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

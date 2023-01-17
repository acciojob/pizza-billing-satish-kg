package com.driver;

public class DeluxePizza extends Pizza {
    public DeluxePizza(boolean isVeg) {
        super(isVeg);
        // your code goes here



        if(isVeg){
            this.setCost(this.getCost()+150);
        }
        else{
            this.setCost(this.getCost()+200);
        }
        this.setBill("Base Price Of The Pizza: "+getCost()+"\n");
    }
}

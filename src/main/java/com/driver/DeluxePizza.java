package com.driver;

public class DeluxePizza extends Pizza {
    public DeluxePizza(boolean isVeg) {
        super(isVeg);
//        if(isVeg) setPrice(getPrice()+150);
//        else  setPrice(getPrice()+200);
        // your code goes here
//        if(isVeg){
//            this.setCost(this.getCost()+150);
//        }
//        else{
//            this.setCost(this.getCost()+200);
//        }
//        this.setDeluxe(true);
        addExtraCheese();
        setPrice(getPrice()+80);
        addExtraToppings();
        if(isVeg) setPrice(getPrice()+70);
        else setPrice(getPrice()+120);

    }
}

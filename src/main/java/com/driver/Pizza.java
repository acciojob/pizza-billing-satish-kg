package com.driver;

public class Pizza {

    private int price = 300;
    private Boolean isVeg;
    private String bill;

    private int cost = 0;
    private boolean takeawayFlag = false;
    private boolean extraCheeseFlag = false;
    private boolean extraTopplingFlag = false;
    private boolean paperBagOrderedFirst = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            cost+=300;
            bill+="Base Price Of The Pizza: "+cost+"\n";
        }
        else{
            cost+=400;
            bill+="Base Price Of The Pizza: "+cost+"\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheeseFlag == false){
            extraCheeseFlag = true;
            cost += 80;
            if(extraTopplingFlag){
                bill+="Extra Cheese Added: 80\n";
                if(isVeg) bill+="Extra Toppings Added: 70\n";
                else bill+="Extra Toppings Added: 120\n";
            }
            else{
                bill+="Extra Cheese Added: 80\n";
            }
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraTopplingFlag == false){
            extraTopplingFlag = true;
            if(extraCheeseFlag){
                if(isVeg == true){
                    cost += 70;
                    bill+="Extra Toppings Added: 70\n";
                }else{
                    cost += 120;
                    bill+="Extra Toppings Added: 120\n";
                }
            }
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(takeawayFlag == false){
            if(extraCheeseFlag == true || extraTopplingFlag == true){
                takeawayFlag = true;
                cost += 20;
                bill+="Paperbag Added: 20\n";
            }else{
                takeawayFlag = true;
                paperBagOrderedFirst = true;
            }
        }
    }

    public String getBill(){
        // your code goes here
        if(paperBagOrderedFirst == false){
            return this.bill+" "+cost;
        }else{
            bill+="Paperbag Added: 20\n";
            return this.bill+" "+cost;
        }
    }
}

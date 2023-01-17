package com.driver;

public class Pizza {

    private int price = 300;
    private Boolean isVeg;

    public void setBill(String bill) {
        this.bill = bill;
    }

    private String bill;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    private int cost = 0;

    private boolean takeawayFlag = false;

    public boolean isExtraCheeseFlag() {
        return extraCheeseFlag;
    }

    public boolean isExtraToppingsFlag() {
        return extraToppingsFlag;
    }

    private boolean extraCheeseFlag = false;
    private boolean extraToppingsFlag = false;
    private boolean paperBagOrderedFirst = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            cost+=300;
            bill="Base Price Of The Pizza: "+cost+"\n";
        }
        else{
            cost+=400;
            bill="Base Price Of The Pizza: "+cost+"\n";
        }
    }

    public int getPrice(){
        if(isVeg){
            return this.price;
        }
        else{
            return 400;
        }
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheeseFlag == false){
            extraCheeseFlag = true;
            cost += 80;
            if(extraToppingsFlag){
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
        if(extraToppingsFlag == false){
            extraToppingsFlag = true;
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
            if(extraCheeseFlag == true || extraToppingsFlag == true){
                takeawayFlag = true;
                cost += 20;
                bill+="Paperbag Added: 20\n";
            }else{
                takeawayFlag = true;
                paperBagOrderedFirst = true;
                cost += 20;
//                bill+="Paperbag Added: 20\n";
            }
        }
    }

    public String getBill(){
        // your code goes here
        if(paperBagOrderedFirst == false){
            bill+="Total Cost: "+cost+"\n";
            return this.bill;
        }else{
            bill+="Paperbag Added: 20\n";
            bill+="Total Cost: "+cost+"\n";
            return this.bill;
        }
    }
}

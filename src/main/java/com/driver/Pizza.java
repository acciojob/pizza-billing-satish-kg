package com.driver;

public class Pizza {

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;
    private Boolean isVeg;

    public void setBill(String bill) {
        this.bill = bill;
    }

    private String bill = "";

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

    private boolean isDeluxe = false;

    public boolean isBillGenerated() {
        return isBillGenerated;
    }

    public void setBillGenerated(boolean billGenerated) {
        isBillGenerated = billGenerated;
    }

    private boolean isBillGenerated = false;
    private boolean extraCheeseFlag = false;
    private boolean extraToppingsFlag = false;
    private boolean paperBagOrderedFirst = false;

    private int cheese;
    private int toppings;
    private boolean isTakeAwayAdded;


//    public Pizza(Boolean isVeg){
//        this.isVeg = isVeg;
//        // your code goes here
//        if(isVeg){
//            cost+=300;
//            bill="Base Price Of The Pizza: "+cost+"\n";
//        }
//        else{
//            cost+=400;
//            bill="Base Price Of The Pizza: "+cost+"\n";
//        }
//    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.bill += "Base Price Of The Pizza: "+this.price+"\n";
            this.toppings = 70;
        }
        else{
            this.price = 400;
            this.bill += "Base Price Of The Pizza: "+this.price+"\n";
            this.toppings = 120;
        }
        this.cheese = 80;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseFlag()){
            this.price = this.price + cheese;
            this.extraCheeseFlag = true;
        }
//        if(extraCheeseFlag == false){
//            extraCheeseFlag = true;
//            cost += 80;
//            if(extraToppingsFlag){
//                bill+="Extra Cheese Added: 80\n";
//                if(isVeg) bill+="Extra Toppings Added: 70\n";
//                else bill+="Extra Toppings Added: 120\n";
//            }
//            else{
//                bill+="Extra Cheese Added: 80\n";
//            }
//        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsFlag()){
            this.price = this.price + toppings;
            extraToppingsFlag = true;
        }
//        if(extraToppingsFlag == false){
//            extraToppingsFlag = true;
//            if(extraCheeseFlag){
//                if(isVeg == true){
//                    cost += 70;
//                    bill+="Extra Toppings Added: 70\n";
//                }else{
//                    cost += 120;
//                    bill+="Extra Toppings Added: 120\n";
//                }
//            }else{
//                if(isVeg == true){
//                    cost += 70;
//                    bill+="Extra Toppings Added: 70\n";
//                }else{
//                    cost += 120;
//                    bill+="Extra Toppings Added: 120\n";
//                }
//            }
//        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            this.price += 20;
            isTakeAwayAdded = true;
        }
//        if(takeawayFlag == false){
//            if(extraCheeseFlag == true || extraToppingsFlag == true){
//                takeawayFlag = true;
//                cost += 20;
//                bill+="Paperbag Added: 20\n";
//            }else{
//                takeawayFlag = true;
//                paperBagOrderedFirst = true;
//                cost += 20;
////                bill+="Paperbag Added: 20\n";
//            }
//        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){

            if(isExtraCheeseFlag())
                this.bill += "Extra Cheese Added: "+this.cheese+"\n";
            if(isExtraToppingsFlag())
                this.bill += "Extra Toppings Added: "+this.toppings+"\n";
            if(isTakeAwayAdded)
                this.bill += "Paperbag Added: "+"20"+"\n";

            this.bill += "Total Price: "+this.price+"\n";
            isBillGenerated = true;
        }
        return this.bill;
//        if(!isBillGenerated){
//            if(paperBagOrderedFirst == false){
//                bill+="Total Price: "+cost+"\n";
////                return this.bill;
//            }else{
//                bill+="Paperbag Added: 20\n";
//                bill+="Total Price: "+cost+"\n";
////                return this.bill;
//            }
//            return this.bill;
//        }
    }

}

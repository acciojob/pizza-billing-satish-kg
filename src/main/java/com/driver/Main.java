package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
//    System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addExtraToppings();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(true);
    p.addTakeaway();
    p.addExtraCheese();
    p.addExtraToppings();
    p.addExtraCheese();

    System.out.println(p.getBill());

    Pizza p1 = new Pizza(true);
    p1.addTakeaway();
//    p1.addExtraCheese();
    p1.addExtraToppings();
//    p1.addExtraCheese();

    System.out.println(p1.getBill());
  }
}
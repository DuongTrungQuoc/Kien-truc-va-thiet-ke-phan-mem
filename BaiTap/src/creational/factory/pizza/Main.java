package creational.factory.pizza;

import creational.factory.pizza.vietnam_pizza.PizzaBoVN;
import creational.factory.pizza.vietnam_pizza.VietNamPizzaStore;

public class Main {
  public static void main(String[] args) {
    PizzaStore store = new VietNamPizzaStore();
    Pizza p = store.orderPizza(PizzaType.BO);
    System.out.println(p.toString());


  }
}

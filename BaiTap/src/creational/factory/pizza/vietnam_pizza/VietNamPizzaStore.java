package creational.factory.pizza.vietnam_pizza;

import creational.factory.pizza.Pizza;
import creational.factory.pizza.PizzaStore;
import creational.factory.pizza.PizzaType;

public class VietNamPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(PizzaType type) {
    switch (type){
      case BO -> {
        return new PizzaBoVN();
      }
    }
    return null;
  }


}

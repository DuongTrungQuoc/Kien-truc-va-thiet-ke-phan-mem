package creational.factory.pizza.vietnam_pizza;

import creational.factory.pizza.Pizza;

public class PizzaBoVN extends Pizza {
  @Override
  public void prepare() {
    System.out.println("1 con bò béo múp");
  }

  @Override
  public void bake() {
    System.out.println("nướng rơm");
  }

  @Override
  public void cut() {
    System.out.println("cắt thành 10 miếng");
  }

  @Override
  public void box() {
    System.out.println("bỏ vô hộp làm bằng vàng 24k");
  }
}

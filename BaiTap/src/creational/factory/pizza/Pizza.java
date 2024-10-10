package creational.factory.pizza;

public abstract class Pizza {
  protected StringBuilder pizza = new StringBuilder();
  public abstract void prepare();
  public abstract void bake();
  public abstract void cut();
  public abstract void box();

  @Override
  public String toString() {
    return pizza.toString();
  }
}

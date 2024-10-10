package creational.factory.pizza;

public class PizzaM extends Pizza{
  @Override
  public void prepare() {
    System.out.println("2 muỗng mắm, 100gr bột;");
  }

  @Override
  public void bake() {
    System.out.println("nướng 10 phút");
  }

  @Override
  public void cut() {
    System.out.println("cắt thành 8 hình tam giác");
  }

  @Override
  public void box() {
    System.out.println("Quấn trong lá chuối");
  }
}

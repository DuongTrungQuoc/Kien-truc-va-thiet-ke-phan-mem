package behavioral.stratery.duck;

public class VitQuay extends Duck{
  @Override
  public void display() {
    System.out.println("Vịt quay Bắc Kinh");
    this.performFly();
    this.performQuack();
    this.swim();
  }

}

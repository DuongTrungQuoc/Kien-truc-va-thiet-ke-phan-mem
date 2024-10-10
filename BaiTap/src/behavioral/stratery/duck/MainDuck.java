package behavioral.stratery.duck;

public class MainDuck {
  public static void main(String[] args) {
    Duck vitQuay = new VitQuay();
    vitQuay.setFlyBehavior(new BayTrenThanHong());
    vitQuay.setQuackBehavior(new VitQuayKeu());
    vitQuay.display();


  }
}

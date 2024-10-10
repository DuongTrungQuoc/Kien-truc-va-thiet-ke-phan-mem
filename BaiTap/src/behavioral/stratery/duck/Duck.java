package behavioral.stratery.duck;

public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public abstract void display();

  public void performQuack(){
    System.out.println(quackBehavior.quack());
  }
  public void performFly(){
    System.out.println(flyBehavior.fly());
  }
  public void swim(){
    System.out.println("~~~swim~~~");
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}

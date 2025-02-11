package LearnJavaOOP.BT10_Circle;

public class Circle {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea(){
    return radius*3.14*radius;
  }

  public double getCircumference(){
    return 3.14*2*radius;
  }
}

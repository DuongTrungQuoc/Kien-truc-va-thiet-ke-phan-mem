package creational.prototype;

public class Product extends Prototype{
  String ten;
  int gia;

  public Product(String ten, int gia) {
    this.ten = ten;
    this.gia = gia;
  }

  @Override
  public Object copy() {
    return super.copy();
  }

  @Override
  public Object clone() {
    return super.clone();
  }
}


package creational.prototype;

import java.util.List;

public class Order extends Prototype{
  String id, tenKH;
  List<Product> products;

  @Override
  public Object copy() {
    return super.copy();
  }

  @Override
  public Object clone() {
    return super.clone();
  }
}

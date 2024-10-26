package B1_DecoratorPattern;

abstract class BieuThucDecorator extends BieuThuc {
  protected BieuThuc bieuThuc;

  @Override
  public float giaTri() {
    return 0;
  }

  @Override
  public String bieuThuc() {
    return "";
  }

  public BieuThucDecorator(BieuThuc bieuThuc) {
    this.bieuThuc = bieuThuc;
  }
}

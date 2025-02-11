package OnThi.TemplateMethod;

public class Coffee extends Beverage{
  @Override
  protected void phaChe() {
    System.out.println("Pha ca phe.");
  }

  @Override
  protected void themNguyenLieu() {
    System.out.println("Them duong va sua");
  }
}

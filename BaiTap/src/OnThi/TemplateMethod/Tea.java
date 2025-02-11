package OnThi.TemplateMethod;

public class Tea extends Beverage{
  @Override
  protected void phaChe() {
    System.out.println("Ngam tra.");
  }

  @Override
  protected void themNguyenLieu() {
    System.out.println("Them chanh.");
  }
}

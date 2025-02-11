package OnThi.TemplateMethod;

public abstract class Beverage {
  public void lamDoUong(){
    dunNuoc();
    phaChe();
    rotRaCoc();
    themNguyenLieu();
  }

  private void dunNuoc(){
    System.out.println("Dun soi nuoc.");
  }
  private void rotRaCoc(){
    System.out.println("Rot vao coc.");
  }

  protected abstract void phaChe();
  protected abstract void themNguyenLieu();
}

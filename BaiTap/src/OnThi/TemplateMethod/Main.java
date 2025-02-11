package OnThi.TemplateMethod;

public class Main {
  public static void main(String[] args) {
    Beverage tea = new Tea();
    tea.lamDoUong();

    Beverage caphe = new Coffee();
    caphe.lamDoUong();
  }
}

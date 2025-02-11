package Pizza_Factory;

// Abstract Product: Pizza
abstract class Pizza {
  public abstract String getName();

  public void prepare() {
    System.out.println("Preparing " + getName());
  }

  public void bake() {
    System.out.println("Baking " + getName());
  }

  public void cut() {
    System.out.println("Cutting " + getName());
  }

  public void box() {
    System.out.println("Boxing " + getName());
  }
}

// Concrete Products: Các loại Pizza cụ thể
class CheesePizza extends Pizza {
  @Override
  public String getName() {
    return "Cheese Pizza";
  }
}

class PepperoniPizza extends Pizza {
  @Override
  public String getName() {
    return "Pepperoni Pizza";
  }
}

class VeggiePizza extends Pizza {
  @Override
  public String getName() {
    return "Veggie Pizza";
  }
}

// Creator: PizzaFactory có Factory Method để tạo và đặt Pizza
class PizzaFactory {
  public Pizza createPizza(String type) {
    switch (type) {
      case "cheese":
        return new CheesePizza();
      case "pepperoni":
        return new PepperoniPizza();
      case "veggie":
        return new VeggiePizza();
      default:
        throw new IllegalArgumentException("Unknown pizza type: " + type);
    }
  }

  // Phương thức orderPizza thực hiện tất cả các bước chuẩn bị pizza
  public Pizza orderPizza(String type) {
    Pizza pizza = createPizza(type);
    if (pizza != null) {
      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.box();
    }
    return pizza;
  }
}

// Main class: Sử dụng PizzaFactory để đặt Pizza
public class Main {
  public static void main(String[] args) {
    PizzaFactory factory = new PizzaFactory();

    // Đặt pizza mà không cần gọi từng bước
    System.out.println("Order Cheese Pizza:");
    factory.orderPizza("cheese");

    System.out.println("\nOrder Pepperoni Pizza:");
    factory.orderPizza("pepperoni");

    System.out.println("\nOrder Veggie Pizza:");
    factory.orderPizza("veggie");
  }
}


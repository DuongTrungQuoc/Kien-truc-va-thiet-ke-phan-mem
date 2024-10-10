package creational.builder.computer;

public class Main {
  public static void main(String[] args) {
    Computer c = new Computer.Builder()
        .builderCPU("Intel Arrow")
        .builderRAM("64GB RAM Samsung")
        .builderStorage("2TB SSD")
        .builderScreen("LG 24 inch 4K")
        .build();
  }
}

package creational.singleton.vidu;

public class MySingleton {
  private static MySingleton instance;
  int count = 0;

  private MySingleton(){

  }
  public static MySingleton getInstance(){
    if (instance==null)
      instance = new MySingleton();
    return instance;
  }
  public void countPrint(){
    System.out.println(++count);
  }
}

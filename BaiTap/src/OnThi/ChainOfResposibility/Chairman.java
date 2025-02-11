package OnThi.ChainOfResposibility;

public class Chairman extends AbstractHandler {
  @Override
  public void handleRequest(double amount, String project) {
    System.out.println("Chairman approved loan for project: " + project + " with amount: $" + amount);
  }
}

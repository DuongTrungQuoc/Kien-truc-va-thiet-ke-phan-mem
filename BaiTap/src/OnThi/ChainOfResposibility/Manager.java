package OnThi.ChainOfResposibility;

public class Manager extends AbstractHandler {
  @Override
  public void handleRequest(double amount, String project) {
    if (amount <= 20000) {
      System.out.println("Manager approved loan for project: " + project + " with amount: $" + amount);
    } else if (nextHandler != null) {
      nextHandler.handleRequest(amount, project);
    }
  }
}
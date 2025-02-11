package OnThi.ChainOfResposibility;

public class DeputyManager extends AbstractHandler {
  @Override
  public void handleRequest(double amount, String project) {
    if (amount <= 5000) {
      System.out.println("Deputy Manager approved loan for project: " + project + " with amount: $" + amount);
    } else if (nextHandler != null) {
      nextHandler.handleRequest(amount, project);
    }
  }
}

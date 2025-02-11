package OnThi.ChainOfResposibility;

public class Director extends AbstractHandler {
  @Override
  public void handleRequest(double amount, String project) {
    if (amount <= 50000) {
      System.out.println("Director approved loan for project: " + project + " with amount: $" + amount);
    } else if (nextHandler != null) {
      nextHandler.handleRequest(amount, project);
    }
  }
}

package OnThi.ChainOfResposibility;

public abstract class AbstractHandler implements Handler {
  protected Handler nextHandler;

  @Override
  public void setNext(Handler handler) {
    this.nextHandler = handler;
  }

  @Override
  public void handleRequest(double amount, String project) {
    if (nextHandler != null) {
      nextHandler.handleRequest(amount, project);
    }
  }
}

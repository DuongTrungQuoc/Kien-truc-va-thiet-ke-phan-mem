package OnThi.ChainOfResposibility;

public class LoanApproval {
  public static void main(String[] args) {
    Handler deputyManager = new DeputyManager();
    Handler manager = new Manager();
    Handler director = new Director();
    Handler chairman = new Chairman();

    // Setting up the chain
    deputyManager.setNext(manager);
    manager.setNext(director);
    director.setNext(chairman);

    // Test cases
    System.out.println("Requesting loan for $3,000:");
    deputyManager.handleRequest(3000, "Startup Project");

    System.out.println("\nRequesting loan for $15,000:");
    deputyManager.handleRequest(15000, "Construction Project");

    System.out.println("\nRequesting loan for $40,000:");
    deputyManager.handleRequest(40000, "Expansion Project");

    System.out.println("\nRequesting loan for $100,000:");
    deputyManager.handleRequest(100000, "National Project");
  }
}

package Mediator.ChatMediator;

abstract class ChatUser {
  private String id;
  private String name;
  protected IChatMediator mediator;

  public ChatUser(String id, String name, IChatMediator mediator) {
    this.id = id;
    this.name = name;
    this.mediator = mediator;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void register() {
    mediator.register(this);
  }

  public void unregister() {
    mediator.unregister(this);
  }

  public void sendMessage(String message, String toId) {
    mediator.sendMessage(message, this, toId);
  }

  public void sendBroadcast(String message) {
    mediator.sendBroadcast(message, this);
  }

  public abstract void receive(String message, ChatUser from);
}

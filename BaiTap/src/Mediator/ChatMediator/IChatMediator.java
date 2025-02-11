package Mediator.ChatMediator;

public interface IChatMediator {
  void register(ChatUser user);
  void unregister(ChatUser user);
  void sendMessage(String message, ChatUser from, String toId);
  void sendBroadcast(String message, ChatUser from);
}

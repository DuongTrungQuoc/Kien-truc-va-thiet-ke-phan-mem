package Mediator.ChatMediator;

import java.util.HashMap;

public class ChatMediator implements IChatMediator { private HashMap<String, ChatUser> userMaps = new HashMap<>();

  @Override
  public void register(ChatUser user) {
    userMaps.put(user.getId(), user);
    System.out.println(user.getName() + " registered.");
  }

  @Override
  public void unregister(ChatUser user) {
    userMaps.remove(user.getId());
    System.out.println(user.getName() + " unregistered.");
  }

  @Override
  public void sendMessage(String message, ChatUser from, String toId) {
    ChatUser toUser = userMaps.get(toId);
    if (toUser != null) {
      toUser.receive(message, from);
    } else {
      System.out.println("User with ID " + toId + " not found.");
    }
  }

  @Override
  public void sendBroadcast(String message, ChatUser from) {
    for (ChatUser user : userMaps.values()) {
      if (!user.getId().equals(from.getId())) {
        user.receive(message, from);
      }
    }
  }
}

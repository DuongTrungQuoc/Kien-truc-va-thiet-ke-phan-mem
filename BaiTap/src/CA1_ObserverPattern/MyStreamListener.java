package CA1_ObserverPattern;

public interface MyStreamListener<T>{
  void listen(T t);

}

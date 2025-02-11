package OnThi.ChainOfResposibility;

public interface Handler {
  void setNext(Handler handler);       // Thiết lập Handler tiếp theo trong chuỗi
  void handleRequest(double amount, String project);  // Xử lý yêu cầu
}

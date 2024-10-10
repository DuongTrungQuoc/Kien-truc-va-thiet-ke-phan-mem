package BaiTapA4_VoteSingleton;

public class MainVote {
  public static void main(String[] args) {
    User user1 = new User("Alice");
    User user2 = new User("Bob");
    User user3 = new User("Alice"); // Cùng tên Alice để kiểm tra

    // Người dùng 1 bầu chọn cho Trump
    user1.vote(Candidate.TRUMP);

    // Người dùng 2 bầu chọn cho Biden
    user2.vote(Candidate.BIDEN);

    // Người dùng 3 (trùng tên Alice) cố gắng bầu chọn lần nữa
    user3.vote(Candidate.TRUMP);

    // Lấy kết quả bầu cử
    Election.getInstance().result();
  }
}

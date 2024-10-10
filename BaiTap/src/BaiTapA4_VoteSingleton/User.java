package BaiTapA4_VoteSingleton;

public class User {
  // Tên của người dùng
  private String name;

  // Constructor để khởi tạo tên người dùng
  public User(String name) {
    this.name = name;
  }
  public void vote(Candidate candidate){
    Election election = Election.getInstance();
    election.vote(candidate,this.name);
  }
}

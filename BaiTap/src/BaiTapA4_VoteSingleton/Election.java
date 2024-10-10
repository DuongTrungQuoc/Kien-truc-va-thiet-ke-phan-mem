package BaiTapA4_VoteSingleton;

import java.util.ArrayList;
import java.util.List;

public class Election {
  private static Election instance = null;
  private int trump = 0;
  private int biden = 0;
  private List<String> users;

  private Election() {
    users = new ArrayList<>();
  }

  public static Election getInstance(){
    if(instance == null)
    {
      instance = new Election();
    }
    return instance;
  }

  public void vote(Candidate candidate, String userName){
    if(users.contains(userName)){
      System.out.println(userName + " đã bầu chọn rồi!");
      return;
    }
    users.add(userName);
    switch (candidate) {
      case TRUMP -> trump++;
      case BIDEN -> biden++;
    }
  }

  public void result()
  {
    System.out.println("Số phiếu bầu chọn cho Trump là: "+trump);
    System.out.println("Số phiếu bầu chọn cho Biden là: "+biden);
    System.out.println("Danh sách người đã bầu chọn là: "+users);

  }


}

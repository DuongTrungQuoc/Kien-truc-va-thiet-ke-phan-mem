package B2_Decorator;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    String input = "Ngủ một mình thì buồn.";

    ITokenize tachTu = new TachTu(input);
    ITokenize loaiBoTuDung = new LoaiBoTuDung(tachTu);
    ITokenize loaiBoDauCau = new LoaiBoDauCau(loaiBoTuDung);

    List<String> tokens = loaiBoDauCau.tokenize();
    System.out.println("Kết quả sau khi loại bỏ từ dừng và dấu câu: " + tokens);
  }
}

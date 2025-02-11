package OnThi.ChainOfResposibilityBT.CB2;

public interface INguoiChoVay {
  public void keTiep(INguoiChoVay nguoiChoVay); // chuyển cho người tiếp theo
  public void choVay(double soTien); // xử lí khoản vay

}

package OnThi.ChainOfResposibilityBT.CB2;

public class Client {
  public static void main(String[] args) {
    NguoiChoVay phoPhong = new PhoPhong();
    NguoiChoVay truongPhong = new TruongPhong();
    NguoiChoVay giamDoc = new GiamDoc();
    NguoiChoVay chuTich = new ChuTich();

    // Thiet lap Chuoi
    phoPhong.keTiep(truongPhong);
    truongPhong.keTiep(giamDoc);
    giamDoc.keTiep(chuTich);

    //Vay tien

    phoPhong.choVay(400);
  }
}

package OnThi.ChainOfResposibilityBT.CB5;

public class Main {
  public static void main(String[] args) {
    XepLoai xuatSac = new XuatSac();
    XepLoai gioi = new Gioi();
    XepLoai kha = new Kha();
    XepLoai trungBinh = new TrungBinh();


    // tao chuoi

    xuatSac.keTiep(gioi);
    gioi.keTiep(kha);
    kha.keTiep(trungBinh);

    // Xep loai hs

    xuatSac.xepLoai(2 );
  }
}

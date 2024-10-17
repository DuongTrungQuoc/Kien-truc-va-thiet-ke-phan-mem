package B3_CompositePattern;

public class Main {
  public static void main(String[] args) {
    // Khởi tạo thư mục gốc
    Folder root = new Folder("Data (D:)", "2024-10-17");

    // Khởi tạo thư mục TaiLieu và các thư mục con
    Folder tailieu = new Folder("TaiLieu", "2024-10-17");

    Folder designPattern = new Folder("Design Pattern", "2024-10-17");
    designPattern.add(new File("CreationalPattern.pptx", "2024-10-17"));
    designPattern.add(new File("StructuralPattern.pptx", "2024-10-17"));

    Folder lapTrinhJava = new Folder("Lap Trinh Java", "2024-10-17");
    lapTrinhJava.add(new File("LapTrinhJavaCoBan.docx", "2024-10-17"));
    lapTrinhJava.add(new File("LapTrinhJavaNangCao.pdf", "2024-10-17"));
    lapTrinhJava.add(new File("NgonNguLapTrinhC.pdf", "2024-10-17"));

    Folder lapTrinhThietBiDiDong = new Folder("LapTrinhThietBiDiDong", "2024-10-17");
    lapTrinhThietBiDiDong.add(new File("CoBan.pptx", "2024-10-17"));
    lapTrinhThietBiDiDong.add(new File("NangCao.pptx", "2024-10-17"));

    // Xây dựng cây thư mục
    tailieu.add(designPattern);
    tailieu.add(lapTrinhJava);
    tailieu.add(lapTrinhThietBiDiDong);
    root.add(tailieu);

    // Hiển thị cấu trúc cây thư mục
    System.out.println(root.getTreeFolder(""));
  }
}

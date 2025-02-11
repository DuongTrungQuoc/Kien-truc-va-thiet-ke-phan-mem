package Composite_CayThuMuc;

import java.util.ArrayList;
import java.util.List;

// Interface Component: Định nghĩa các phương thức chung cho File và Folder
interface FileSystemItem {
  String getStringTreeFolder(String indent);
  String getPath();
}

// Class Leaf: Đại diện cho tập tin, không chứa phần tử con
class File implements FileSystemItem {
  private String name;
  private String creationDate;
  private String parentPath;

  public File(String name, String creationDate, String parentPath) {
    this.name = name;
    this.creationDate = creationDate;
    this.parentPath = parentPath;
  }

  @Override
  public String getStringTreeFolder(String indent) {
    return indent + name;
  }

  @Override
  public String getPath() {
    return parentPath + "/" + name;
  }
}

// Class Composite: Đại diện cho thư mục, có thể chứa tập tin hoặc thư mục khác
class Folder implements FileSystemItem {
  private String name;
  private String creationDate;
  private List<FileSystemItem> items = new ArrayList<>();
  private String parentPath;

  public Folder(String name, String creationDate, String parentPath) {
    this.name = name;
    this.creationDate = creationDate;
    this.parentPath = parentPath;
  }

  public void addItem(FileSystemItem item) {
    items.add(item);
  }

  public void removeItem(FileSystemItem item) {
    items.remove(item);
  }

  @Override
  public String getStringTreeFolder(String indent) {
    StringBuilder sb = new StringBuilder();
    sb.append(indent).append(name).append("\n");
    String newIndent = indent + "     ";
    for (FileSystemItem item : items) {
      sb.append(item.getStringTreeFolder(newIndent)).append("\n");
    }
    return sb.toString();
  }

  @Override
  public String getPath() {
    return parentPath + "/" + name;
  }
}

// Main class: Sử dụng cấu trúc thư mục
public class CayThuMuc {
  public static void main(String[] args) {
    // Tạo cấu trúc thư mục và tập tin
    Folder root = new Folder("Data (D:)", "2024-10-29", "");

    Folder taiLieu = new Folder("TaiLieu", "2024-10-29", root.getPath());
    Folder designPattern = new Folder("Design Pattern", "2024-10-29", taiLieu.getPath());
    designPattern.addItem(new File("CreationalPattern.pptx", "2024-10-29", designPattern.getPath()));
    designPattern.addItem(new File("StructuralPattern.pptx", "2024-10-29", designPattern.getPath()));

    Folder lapTrinhJava = new Folder("Lap Trinh Java", "2024-10-29", taiLieu.getPath());
    lapTrinhJava.addItem(new File("LapTrinhJavaCoBan.docx", "2024-10-29", lapTrinhJava.getPath()));
    lapTrinhJava.addItem(new File("LapTrinhJavaNangCao.pdf", "2024-10-29", lapTrinhJava.getPath()));

    taiLieu.addItem(designPattern);
    taiLieu.addItem(lapTrinhJava);
    taiLieu.addItem(new File("NgonNguLapTrinhC.pdf", "2024-10-29", taiLieu.getPath()));

    Folder lapTrinhThietBiDiDong = new Folder("LapTrinhThietBiDiDong", "2024-10-29", taiLieu.getPath());
    lapTrinhThietBiDiDong.addItem(new File("CoBan.pptx", "2024-10-29", lapTrinhThietBiDiDong.getPath()));
    lapTrinhThietBiDiDong.addItem(new File("NangCao.pptx", "2024-10-29", lapTrinhThietBiDiDong.getPath()));

    taiLieu.addItem(lapTrinhThietBiDiDong);
    root.addItem(taiLieu);

    // Hiển thị cây thư mục với định dạng mong muốn
    System.out.println(root.getStringTreeFolder(""));
  }
}

package B3_CompositePattern;

abstract class AbstractFile {
  protected String name;
  protected String createDate;

  public AbstractFile(String name, String createDate) {
    this.name = name;
    this.createDate = createDate;
  }
  public void add(AbstractFile file) {
    throw new UnsupportedOperationException("Không thể thêm vào đối tượng này");
  }

  public void remove(AbstractFile file) {
    throw new UnsupportedOperationException("Không thể xóa đối tượng này");
  }

  public abstract String getPath();

  public abstract String getTreeFolder(String prefix);
}

package B3_CompositePattern;

abstract class AbstractFile {
  protected String name;
  protected String createDate;

  public AbstractFile(String name, String createDate) {
    this.name = name;
    this.createDate = createDate;
  }
  public void add(AbstractFile file) {}

  public void remove(AbstractFile file) {}

  public abstract String getPath();

  public abstract String getTreeFolder(String prefix);
}

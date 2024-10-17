package B3_CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
  private List<AbstractFile> files = new ArrayList<>();

  public Folder(String name, String createDate) {
    super(name, createDate);
  }

  @Override
  public void add(AbstractFile file) {
    files.add(file);
  }

  @Override
  public void remove(AbstractFile file) {
    files.remove(file);
  }

  @Override
  public String getPath() {
    return name;
  }

  @Override
  public String getTreeFolder(String prefix) {
    StringBuilder sb = new StringBuilder();
    sb.append(prefix).append(name).append("\n");
    for (AbstractFile file : files) {
      sb.append(file.getTreeFolder(prefix + "  "));
    }
    return sb.toString();
  }
}

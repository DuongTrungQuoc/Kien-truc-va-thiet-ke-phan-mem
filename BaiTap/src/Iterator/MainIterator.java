package Iterator;

import java.util.Iterator;

public class MainIterator {
  public static void duyetMonHoc(Iterator<MonHoc> iterator){
    while (iterator.hasNext()){
      MonHoc monHoc =iterator.next();
      System.out.println();
    }
  }
  public static void main(String[] args) {

  }
}

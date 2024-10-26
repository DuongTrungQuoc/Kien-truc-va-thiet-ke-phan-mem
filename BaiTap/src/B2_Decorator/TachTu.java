package B2_Decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TachTu implements ITokenize{
  private String s;

  public TachTu(String s) {
    this.s = s;
  }

  @Override
  public List<String> tokenize() {
    return new ArrayList<>(Arrays.asList(s.split("\\s+")));
  }
}

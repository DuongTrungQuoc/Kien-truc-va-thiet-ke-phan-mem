package B2_Decorator;

import java.util.Arrays;
import java.util.List;

public class LoaiBoTuDung extends TokenDecorator{
  private static final List<String> stopWords = Arrays.asList("và", "hoặc", "thì", "mà", "là");

  public LoaiBoTuDung(ITokenize tokens) {
    super(tokens);
  }

  @Override
  public List<String> tokenize() {
    List<String> result = super.tokenize();
    result.removeIf(stopWords::contains);
    return result;
  }
}

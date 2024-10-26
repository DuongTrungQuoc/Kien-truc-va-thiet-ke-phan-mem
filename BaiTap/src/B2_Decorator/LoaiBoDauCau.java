package B2_Decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoaiBoDauCau extends TokenDecorator{
  public LoaiBoDauCau(ITokenize tokens) {
    super(tokens);
  }

  @Override
  public List<String> tokenize() {
    List<String> result = super.tokenize();
    result.replaceAll(word -> word.replaceAll("[,.;]", ""));
    result.removeIf(String::isEmpty);
    return result;
  }
}

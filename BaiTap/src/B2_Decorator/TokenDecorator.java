package B2_Decorator;

import java.util.List;

public class TokenDecorator implements ITokenize{
  protected ITokenize tokens;

  public TokenDecorator(ITokenize tokens) {
    this.tokens = tokens;
  }

  @Override
  public List<String> tokenize() {
    return tokens.tokenize();
  }
}

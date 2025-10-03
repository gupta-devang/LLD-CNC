package decorator.toppings;

import decorator.BasePizza;

public class ExtraCheese  extends TopingDecorator{

  public ExtraCheese(BasePizza basePizza) {
    super(basePizza);
  }

  @Override
  public int cost() {
    return getBasePizza().cost() + 50;
  }
}

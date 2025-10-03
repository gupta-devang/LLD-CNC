package decorator.toppings;

import decorator.BasePizza;

public abstract class TopingDecorator extends BasePizza {
  private BasePizza basePizza;

  public TopingDecorator(BasePizza basePizza) {
    this.basePizza = basePizza;
  }

  public BasePizza getBasePizza() {
    return basePizza;
  }
}

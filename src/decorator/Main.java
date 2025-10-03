package decorator;

import decorator.toppings.ExtraCheese;

public class Main {
  public static void main(String[] args) {
    BasePizza basePizza = new ExtraCheese(new FarmhousePizza());
    System.out.println(basePizza.cost());

  }
}

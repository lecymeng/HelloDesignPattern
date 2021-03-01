package design.pattern.creator.abstractFactory.skin.product;

public class SummerButton implements Button {
  @Override
  public void displayButton() {
    System.out.println("display  Summer Button");
  }
}

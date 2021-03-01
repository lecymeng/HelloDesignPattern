package design.pattern.structure.decorator.sample;

/**
 * Created by Weicools on 2017/3/18.
 * <p>
 * desc:
 */
public class CheapCloth extends PersonCloth {
  public CheapCloth(Person person) {
    super(person);
  }

  private void dressShirt() {
    System.out.println("穿件短袖");
  }

  private void dressShort() {
    System.out.println("穿条短裤");
  }

  @Override
  public void dressed() {
    super.dressed();
    dressShirt();
    dressShort();
  }
}

package design.pattern.structure.decorator.sample;

/**
 * Created by Weicools on 2017/3/18.
 * <p>
 * desc:
 */
public class ExpensiveCloth extends PersonCloth {
    public ExpensiveCloth(Person person) {
        super(person);
    }

    private void dressJean() {
        System.out.println("穿条牛仔裤");
    }

    private void dressLeather() {
        System.out.println("穿件皮衣");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressJean();
        dressLeather();
    }
}

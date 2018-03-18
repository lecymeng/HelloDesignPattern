package design.pattern.structure.decorator.sample;

/**
 * Created by Weicools on 2017/3/18.
 * <p>
 * desc:
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Boy();

        PersonCloth cheapCloth = new CheapCloth(person);
        cheapCloth.dressed();

        System.out.println("*************");

        PersonCloth expensiveCloth = new ExpensiveCloth(person);
        expensiveCloth.dressed();
    }
}

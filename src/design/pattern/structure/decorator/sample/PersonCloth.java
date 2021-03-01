package design.pattern.structure.decorator.sample;

/**
 * Created by Weicools on 2017/3/18.
 * <p>
 * desc:
 */
public abstract class PersonCloth extends Person {
  protected Person mPerson;

  public PersonCloth(Person person) {
    mPerson = person;
  }

  @Override
  public void dressed() {
    //调用Person的dressed()方法
    mPerson.dressed();
  }
}

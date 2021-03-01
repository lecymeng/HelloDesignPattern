package design.pattern.creator.prototype.weekly.docExample;

public interface OfficialDocument extends Cloneable {
  public OfficialDocument clone();
  public void display();
}

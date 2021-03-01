package design.pattern.creator.prototype.weekly.docExample;

public class SoftwareRSDoc implements OfficialDocument {
  @Override
  public OfficialDocument clone() {
    OfficialDocument srs = null;
    try {
      srs = (OfficialDocument) super.clone();
    } catch (CloneNotSupportedException e) {
      System.out.println("不支持复制！" + e.getMessage());
    }
    return srs;
  }

  @Override
  public void display() {
    System.out.println("软件需求规格说明书");
  }
}

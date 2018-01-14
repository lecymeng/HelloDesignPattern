package design.pattern.creator.prototype.weekly.docExample;

public class FeasibilityDoc implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！" + e.getMessage());
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("可行性分析报告");
    }
}

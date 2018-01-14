package design.pattern.creator.prototype.weekly.docExample;

public class DocClient {
    public static void main(String[] args) {
        // 获取原型管理器对象
        PrototypeManager pm =  PrototypeManager.getInstance();

        OfficialDocument doc1  = pm.getOfficialDoc("far");
        doc1.display();
        OfficialDocument doc2  = pm.getOfficialDoc("far");
        doc2.display();
        System.out.println(doc1  == doc2);

        System.out.println("---------------");

        OfficialDocument doc3  = pm.getOfficialDoc("srs");
        doc3.display();
        OfficialDocument doc4  = pm.getOfficialDoc("srs");
        doc4.display();
        System.out.println(doc3  == doc4);
    }
}

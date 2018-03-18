package design.pattern.structure.composite.sample;

/**
 * Created by Weicools on 2017/3/18.
 * <p>
 * desc: 测试
 */
public class Client {
    public static void main(String[] args) {
        //构造一个目录表示SD卡根目录
        Dir sdCard = new Folder("Storage");

        //SD卡下有一个文件"设计模式.pdf"
        sdCard.addDir(new File("设计模式.pdf"));

        //SD卡下有3个子文件夹"ADM", "Android", "Books"
        Dir adm = new Folder("ADM");
        adm.addDir(new File("google.html"));
        sdCard.addDir(adm);

        Dir an = new Folder("Android");
        an.addDir(new File("cache.txt"));
        sdCard.addDir(an);

        Dir books = new Folder("Books");
        books.addDir(new File("跳槽指南.md"));
        sdCard.addDir(books);

        sdCard.print();
    }
}

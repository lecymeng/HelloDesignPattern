package design.pattern.creator.prototype.weekly.shallow;

public class Attachment {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void downloadFile() {
        System.out.println("附件名称：" + name);
    }
}

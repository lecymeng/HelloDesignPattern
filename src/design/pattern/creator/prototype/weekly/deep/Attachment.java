package design.pattern.creator.prototype.weekly.deep;

import java.io.Serializable;

public class Attachment implements Serializable {
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

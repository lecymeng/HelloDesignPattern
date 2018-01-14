package design.pattern.creator.prototype.weekly.deep;

import java.io.*;

public class WeeklyLog implements Serializable {
    private String name;
    private String date;
    private String content;
    private Attachment attachment;

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    /**
     * Use Serializable impl clone
     * @return WeeklyLog
     */
    public WeeklyLog deepClone() throws IOException, ClassNotFoundException, OptionalDataException {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bai);
        return (WeeklyLog) ois.readObject();
    }
}

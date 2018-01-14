package design.pattern.creator.prototype.weekly.shallow;

public class PrototypeClient {
    public static void main(String[] args) {
        WeeklyLog oldLog = new WeeklyLog();  //创建原型对象
        oldLog.setName("张无忌");
        oldLog.setDate("第12周");
        oldLog.setContent("这周工作很忙，每天加班！");
        Attachment  attachment = new Attachment(); //创建附件对象
        attachment.setName("接入说明文档");
        oldLog.setAttachment(attachment);

        System.out.println("****周报****");
        System.out.println("周次：" +  oldLog.getDate());
        System.out.println("姓名：" +  oldLog.getName());
        System.out.println("内容：" +  oldLog.getContent());
        System.out.println("--------------------------------");

        WeeklyLog  newLog = null;
        try {
            newLog = (WeeklyLog) oldLog.clone();
            newLog.setDate("第13周");
            System.out.println("****周报****");
            System.out.println("周次：" + newLog.getDate());
            System.out.println("姓名：" + newLog.getName());
            System.out.println("内容：" + newLog.getContent());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        if (newLog != null) {
            System.out.println(oldLog == newLog);
            System.out.println(oldLog.getDate().equals(newLog.getDate()));
            System.out.println(oldLog.getName().equals(newLog.getName()));
            System.out.println(oldLog.getContent().equals(newLog.getContent()));
            System.out.println("附件是否相同？ " +  (oldLog.getAttachment() == newLog.getAttachment()));
        }
    }
}

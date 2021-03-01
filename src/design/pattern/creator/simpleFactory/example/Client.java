package design.pattern.creator.simpleFactory.example;

public class Client {
  public static void main(String[] args) {
    App QQ = AppFactory.getInstance("QQ");

    QQ.run();
  }
}

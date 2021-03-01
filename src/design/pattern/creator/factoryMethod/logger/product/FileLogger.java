package design.pattern.creator.factoryMethod.logger.product;

public class FileLogger implements Logger {
  @Override
  public void writeLog() {
    System.out.println("mode: FileLogger");
  }
}

package design.pattern.creator.factoryMethod.logger;

import design.pattern.creator.factoryMethod.logger.factory.FileLoggerFactory;
import design.pattern.creator.factoryMethod.logger.factory.LoggerFactory;

public class FactoryMethodClient {
  public static void main(String[] args) {
    LoggerFactory factory = new FileLoggerFactory();  //可引入配置文件实现
    factory.writeLogs();
  }
}

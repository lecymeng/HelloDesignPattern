package design.pattern.creator.factoryMethod.logger.factory;

import design.pattern.creator.factoryMethod.logger.product.FileLogger;
import design.pattern.creator.factoryMethod.logger.product.Logger;

public class FileLoggerFactory extends LoggerFactory {
  @Override
  public Logger getLogger() {
    return new FileLogger();
  }
}

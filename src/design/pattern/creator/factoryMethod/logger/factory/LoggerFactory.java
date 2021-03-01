package design.pattern.creator.factoryMethod.logger.factory;

import design.pattern.creator.factoryMethod.logger.product.Logger;

public abstract class LoggerFactory {
  public void writeLogs() {
    Logger logger = this.getLogger();
    logger.writeLog();
  }

  public abstract Logger getLogger();
}

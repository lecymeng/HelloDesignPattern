package design.pattern.creator.factoryMethod.logger.factory;

import design.pattern.creator.factoryMethod.logger.product.DatabaseLogger;
import design.pattern.creator.factoryMethod.logger.product.Logger;

public class DatabaseLoggerFactory extends LoggerFactory {
    @Override
    public Logger getLogger() {
        return new DatabaseLogger();
    }
}

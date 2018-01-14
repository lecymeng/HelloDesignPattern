package design.pattern.creator.factoryMethod.logger.product;

public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("mode: DatabaseLogger");
    }
}

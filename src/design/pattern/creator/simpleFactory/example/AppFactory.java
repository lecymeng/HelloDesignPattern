package design.pattern.creator.simpleFactory.example;

public class AppFactory {
    public static App getInstance(String appName) {
        App app = null;
        switch (appName) {
            case "Bilibili":
                app = new Bilibili();
                break;
            case "QQ":
                app = new QQ();
                break;
            case "Quark":
                app = new Quark();
                break;
            default:
                break;
        }

        return app;
    }
}

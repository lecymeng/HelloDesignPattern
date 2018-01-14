package design.pattern.creator.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        System.out.println(LazySingleton.getInstance() == LazySingleton.getInstance());
        System.out.println(HungrySingleton.getInstance() == HungrySingleton.getInstance());
        System.out.println(SyncHungrySingleton.getInstance() == SyncHungrySingleton.getInstance());
        System.out.println(StaticSingleton.getInstance() == StaticSingleton.getInstance());
        System.out.println(IoDHSingleton.getInstance() == IoDHSingleton.getInstance());
        System.out.println(EnumSingleton.INSTANCE == EnumSingleton.INSTANCE);
        System.out.println(DoubleCheckSingleton.getInstance() == DoubleCheckSingleton.getInstance());
    }
}

package Singleton_Pattern;

public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Enum Singleton is doing something!");
    }
}
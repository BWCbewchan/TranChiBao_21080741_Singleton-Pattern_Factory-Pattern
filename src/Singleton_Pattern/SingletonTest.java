package Singleton_Pattern;

public class SingletonTest {
    public static void main(String[] args) {
        // Eager Initialized Singleton
        EagerInitializedSingleton eagerInstance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton eagerInstance2 = EagerInitializedSingleton.getInstance();
        System.out.println("Eager Initialized Singleton: " + (eagerInstance1 == eagerInstance2));

        // Static Block Singleton
        StaticBlockSingleton staticBlockInstance1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton staticBlockInstance2 = StaticBlockSingleton.getInstance();
        System.out.println("Static Block Singleton: " + (staticBlockInstance1 == staticBlockInstance2));

        // Lazy Initialized Singleton
        LazyInitializedSingleton lazyInstance1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton lazyInstance2 = LazyInitializedSingleton.getInstance();
        System.out.println("Lazy Initialized Singleton: " + (lazyInstance1 == lazyInstance2));

        // Thread Safe Singleton
        ThreadSafeSingleton threadSafeInstance1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeInstance2 = ThreadSafeSingleton.getInstance();
        System.out.println("Thread Safe Singleton: " + (threadSafeInstance1 == threadSafeInstance2));

        // Bill Pugh Singleton
        BillPughSingleton billPughInstance1 = BillPughSingleton.getInstance();
        BillPughSingleton billPughInstance2 = BillPughSingleton.getInstance();
        System.out.println("Bill Pugh Singleton: " + (billPughInstance1 == billPughInstance2));

        // Enum Singleton
        EnumSingleton enumInstance1 = EnumSingleton.INSTANCE;
        EnumSingleton enumInstance2 = EnumSingleton.INSTANCE;
        System.out.println("Enum Singleton: " + (enumInstance1 == enumInstance2));
        enumInstance1.doSomething();
    }
}
package org.example.singleton;

// The most basic form of Singleton Pattern. Here, the instance is generated
// in lazy manner. But this is not thread-safe, as 2 threads simultaneously
// can call the getInstance() method together, hence creating more than 1 object.
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

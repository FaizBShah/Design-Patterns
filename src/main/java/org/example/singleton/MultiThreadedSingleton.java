package org.example.singleton;

// This is MultiThreadedSingleton class, and this is thread-safe.
// We have used the synchronized block to make sure only 1 thread
// at a time could access the object creation block at a time. And since
// this is lazily instantiated, its also memory-efficient. But this is not
// safe from Serialization and Reflection.
public class MultiThreadedSingleton {

    private static MultiThreadedSingleton instance = null;

    public MultiThreadedSingleton() {
    }

    public static MultiThreadedSingleton getInstance() {
        if (instance != null) {
            return instance;
        }

        synchronized (MultiThreadedSingleton.class) {
            if (instance == null) {
                instance = new MultiThreadedSingleton();
            }
        }

        return instance;
    }
}

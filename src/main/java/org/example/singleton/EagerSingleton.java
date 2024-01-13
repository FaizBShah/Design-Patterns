package org.example.singleton;

// This is EagerSingleton, where the instance is already created, even
// before the getInstance() method is called. Hence, this is thread-safe.
// But the disadvantage of this way is that even if the class is not used,
// the object will be still be created, and hence it will be a waste of memory
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}

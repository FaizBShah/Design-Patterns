package org.example.singleton;

import java.io.Serial;
import java.io.Serializable;

// This is SerializableSingleton class. This is both thread-safe
// and serializable-safe. This also initializes lazily, hence
// memory-efficient. But this is not reflection-safe.
public class SerializableSingleton implements Serializable {

    private static SerializableSingleton instance = null;

    private SerializableSingleton() {
    }

    public static SerializableSingleton getInstance() {
        if (instance != null) {
            return instance;
        }

        synchronized (SerializableSingleton.class) {
            if (instance == null) {
                instance = new SerializableSingleton();
            }
        }

        return instance;
    }

    // This method will make the code serializable-safe, by
    // returning the same instance when this method is called
    // during deserialization by JVM
    @Serial
    protected Object readResolve() {
        return instance;
    }
}

package org.example.singleton;

// Behold!! The perfect Singleton Class!! I know this might
// look like a joke, but trust me this implementation is
// thread-safe, serialization-safe and reflection-safe
public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Do Something");
    }
}

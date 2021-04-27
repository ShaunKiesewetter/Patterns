package net.wedocode.creational.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class MySingleton {

    private static MySingleton myInstance;

    private static Lock lock = new ReentrantLock();

    private MySingleton(){
        // Make ths constructor hidden by modifying its default access specification.
    }

    public String getDescription(){
        return "There can only be one!";
    }

    public static MySingleton getMyInstance() {

        lock.lock(); // Not documented as part of the pattern but I like to do this just to be sure we cannot have a race condition in a threaded environment.

        if (myInstance == null) {
            myInstance = new MySingleton();
        }

        lock.unlock();

        return myInstance;
    }

}

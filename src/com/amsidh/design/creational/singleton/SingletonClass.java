package com.amsidh.design.creational.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/*
Singleton Pattern says that just"define a class that has only one instance and provides a global point of access to it".
In other words, a class must ensure that only single instance should be created and single
 object can be used by all other classes.
There are two forms of singleton design pattern
    Early Instantiation: creation of instance at load time.
    Lazy Instantiation: creation of instance when required.
 */

public final class SingletonClass implements Serializable, Cloneable {
    public static final SingletonClass SINGLETON_CLASS = getInstance();

    private SingletonClass() {
        System.out.println("SingletonClass constructor called!!");
    }

    private static SingletonClass getInstance() {
        if (SINGLETON_CLASS == null) {
            synchronized (SingletonClass.class) {
                return new SingletonClass();
            }
        }
        return SINGLETON_CLASS;
    }


    public void display() {
        System.out.println("SingletonClass =" + this.hashCode());
    }

    //readresolve returns INSTANCE after deserialization
    private SingletonClass readResolve() throws ObjectStreamException {
        return SingletonClass.SINGLETON_CLASS;
    }

    //clone returns INSTANCE after cloning
    @Override
    protected SingletonClass clone() {
        return SingletonClass.SINGLETON_CLASS;
    }
}

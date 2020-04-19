package com.amsidh.design.creational.singleton;

import java.io.*;

public class SingletonSerializationExample {
  public static void main(String[] args) throws IOException {
    SingletonClass obj = SingletonClass.SINGLETON_CLASS;
    System.out.println("Before writing the Object to Serialization =" + obj.hashCode());
    obj.display();
    File file = new File("singleton.tmp");
    file.createNewFile();

    ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file));
    writer.writeObject(obj);
    writer.flush();
    writer.close();
    System.out.println("===========================");

    for (int i = 0; i < 10; i++) {
      readSingletonSerializedClass(file);
    }

  }

  private static void readSingletonSerializedClass(File file) {
    try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
      SingletonClass obj2 = (SingletonClass) inputStream.readObject();
      System.out.println("After reading the serialized object =" + obj2.hashCode());
      obj2.display();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}

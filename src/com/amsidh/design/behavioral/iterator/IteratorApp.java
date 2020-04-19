package com.amsidh.design.behavioral.iterator;

/*
According to GoF, Iterator Pattern is used
 "to access the elements of an aggregate object sequentially without exposing its underlying implementation".
 The Iterator pattern is also known as Cursor.
 */
public class IteratorApp {
    public static void main(String[] args) {
        MyNameCollection myNameCollection = new MyNameCollection();
        MyIterator myIterator = myNameCollection.getIterator();
        while (myIterator.hasNext()) {
            Object object = myIterator.next();
            System.out.println(object.toString());
        }
    }
}


interface MyIterator {
    boolean hasNext();

    Object next();
}

interface Container {
    MyIterator getIterator();
}

class MyNameCollection implements Container {
    private static String[] names = new String[]{"Adithi", "Amsidh", "Aditya", "Anjali", "Babasha", "Itabai"};

    @Override
    public MyIterator getIterator() {
        return new MyIteratorImpl();
    }

    class MyIteratorImpl implements MyIterator {
        int i;

        @Override
        public boolean hasNext() {
            if (i < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[i++];
            }
            return null;
        }
    }

}
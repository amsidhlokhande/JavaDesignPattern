package com.amsidh.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
/*
According to GoF definition, observer pattern defines a one-to-many dependency between objects so
that when one object changes state, all its dependents are notified and updated automatically.
It is also referred to as the publish-subscribe pattern.
 */
public class ObserverPatternApp {
    public static void main(String[] args) {

        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();
        Observer observer3 = new Observer3();

        Subscribe subscribe = new MessagePublisher();
        subscribe.register(observer1);
        subscribe.register(observer2);
        Message message = new Message("Message updated");
        subscribe.notifyUpdate(message);  //Updating to Observer1 and Observer2
        subscribe.deRegister(observer2);
        subscribe.register(observer3);
        Message message1 = new Message("Once again update message");
        subscribe.notifyUpdate(message1);  //Updating to Observer1 and Observer3

    }
}


class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}

interface Observer {
    void update(Message m);
}

class Observer1 implements Observer {

    @Override
    public void update(Message m) {
        System.out.println("Observer1 :: " + m.getMessage());
    }
}

class Observer2 implements Observer {

    @Override
    public void update(Message m) {
        System.out.println("Observer2 :: " + m.getMessage());
    }
}

class Observer3 implements Observer {

    @Override
    public void update(Message m) {
        System.out.println("Observer2 :: " + m.getMessage());
    }
}


interface Subscribe {
    void register(Observer observer);

    void deRegister(Observer observer);

    void notifyUpdate(Message message);
}

class MessagePublisher implements Subscribe {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deRegister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyUpdate(Message message) {
        observers.forEach(observer -> observer.update(message));
    }
}
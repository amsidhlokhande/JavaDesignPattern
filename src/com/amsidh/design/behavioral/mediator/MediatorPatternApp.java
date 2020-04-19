package com.amsidh.design.behavioral.mediator;
/*
A Mediator Pattern says that "to define an object that encapsulates how a set of objects interact".

Mediator pattern is used to reduce communication complexity between multiple objects or classes.
This pattern provides a mediator class which normally handles all the communications between different classes
and supports easy maintainability of the code by loose coupling.

Benefits:
    It decouples the number of classes.
    It simplifies object protocols.
    It centralizes the control.
    The individual components become simpler and much easier to deal with because they don't need to pass messages to one another.
    The components don't need to contain logic to deal with their intercommunication and therefore, they are more generic.
Usage:
    It is commonly used in message-based systems likewise chat applications.
    When the set of objects communicate in complex but in well-defined ways.

 */
public class MediatorPatternApp {
    public static void main(String[] args) {
        ApanaChatRoomImpl apanaChatRoomImpl = new ApanaChatRoomImpl();

        User1 user1 = new User1(apanaChatRoomImpl);
        User2 user2 = new User2(apanaChatRoomImpl);

        user1.setName("Amsidh");
        user1.sendMessage("Hello This is Amsidh");

        user2.setName("Anjali");
        user2.sendMessage("Hello This is Anjali");


    }
}

interface ApanaChatRoom {
    void showMessage(String message, Participant p);
}

class ApanaChatRoomImpl implements ApanaChatRoom {

    @Override
    public void showMessage(String message, Participant p) {
        System.out.println(p.getName() + " Message: " + message);
    }
}

interface Participant {
    void setName(String name);

    String getName();

    void sendMessage(String message);
}

class User1 implements Participant {
    ApanaChatRoom apanaChatRoom;
    String name;

    public User1(ApanaChatRoom apanaChatRoom) {
        this.apanaChatRoom = apanaChatRoom;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sendMessage(String message) {
        this.apanaChatRoom.showMessage(message, this);
    }
}

class User2 implements Participant {
    ApanaChatRoom apanaChatRoom;
    String name;

    public User2(ApanaChatRoom apanaChatRoom) {
        this.apanaChatRoom = apanaChatRoom;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sendMessage(String message) {
        this.apanaChatRoom.showMessage(message, this);
    }
}
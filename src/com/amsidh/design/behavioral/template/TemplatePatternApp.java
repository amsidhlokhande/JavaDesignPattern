package com.amsidh.design.behavioral.template;

/*
A Template Pattern says that "just define the skeleton of a function in an operation, deferring some steps to its subclasses".
Benefits:

    It is very common technique for reusing the code.This is only the main benefit of it.

Usage:

    It is used when the common behavior among sub-classes should be moved to a single common class by avoiding the duplication.

 */
public class TemplatePatternApp {
    public static void main(String[] args) {
        Game chess = new Chess();
        chess.start();
        chess.play();
        chess.stop();

        Soccer soccer = new Soccer();
        soccer.start();
        soccer.play();
        soccer.stop();
    }
}

interface Game {
    void start();

    void stop();

    void play();
}

class Chess implements Game {

    @Override
    public void start() {
        System.out.println("Start Chess");
    }

    @Override
    public void stop() {
        System.out.println("Stop Chess");
    }

    @Override
    public void play() {
        System.out.println("Play Chess");
    }
}

class Soccer implements Game {

    @Override
    public void start() {
        System.out.println("Start Soccer");
    }

    @Override
    public void stop() {
        System.out.println("Stop Soccer");
    }

    @Override
    public void play() {
        System.out.println("Play Soccer");
    }
}
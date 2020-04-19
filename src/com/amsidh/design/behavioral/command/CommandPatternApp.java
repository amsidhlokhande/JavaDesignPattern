package com.amsidh.design.behavioral.command;

public class CommandPatternApp {
    public static void main(String[] args) {
        Document document = new Document();

        OpenDocument openDocument = new OpenDocument(document);
        openDocument.execute();

        SaveDocument saveDocument = new SaveDocument(document);
        saveDocument.execute();
    }
}

class Document {
    public void open() {
        System.out.println("Document Opened");
    }

    public void save() {
        System.out.println("Document Saved");
    }
}

interface Action {
    void execute();
}

class OpenDocument implements Action {
    private Document document;

    public OpenDocument(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        this.document.open();
    }
}

class SaveDocument implements Action {
    private Document document;

    public SaveDocument(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        this.document.save();
    }
}
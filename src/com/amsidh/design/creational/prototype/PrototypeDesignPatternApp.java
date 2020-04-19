package com.amsidh.design.creational.prototype;

import java.util.ArrayList;
import java.util.List;
/*
* Prototype Pattern says that cloning of an existing object instead of creating new one and
* can also be customized as per the requirement.
This pattern should be followed, if the cost of creating a new object is expensive and resource intensive.
* */
public class PrototypeDesignPatternApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bookShop1 = new BookShop();
        bookShop1.setShopName("Programming Books");
        bookShop1.getBooks().add(new Book(1, "Java Programming1", "Amsidh Lokhande1"));
        bookShop1.getBooks().add(new Book(2, "Java Programming2", "Amsidh Lokhande2"));
        bookShop1.getBooks().add(new Book(3, "Java Programming3", "Amsidh Lokhande3"));

        BookShop bookShop2 = (BookShop) bookShop1.clone();
        //In case of shallow cloning if you change the state of object then the cloning object will also get affect/changed.
        //In order to avoid this we need to do the deep copy of object. Please see the clone method implementation
        bookShop2.setShopName("AWS Programming Shop");
        bookShop1.getBooks().add(new Book(4, "Java Programming4", "Amsidh Lokhande4"));
        System.out.println("Book Shop Name " + bookShop1.getShopName());
        bookShop1.getBooks().forEach(System.out::println);

        System.out.println("\n\nBook Shop Name " + bookShop2.getShopName());
        bookShop2.getBooks().forEach(System.out::println);
    }
}

class BookShop implements Cloneable {
    private String shopName;
    private List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    // protected Object clone() throws CloneNotSupportedException {
    protected BookShop clone() /*throws CloneNotSupportedException*/ {
        /*return super.clone();*/
        //Deep cloning. Nested Mutable attributes must be cloned using getter setter
        BookShop bookShop = new BookShop();
        bookShop.setShopName(this.getShopName());
        this.getBooks().forEach(book -> bookShop.getBooks().add(book));
        return bookShop;
    }
}

class Book {
    private Integer bookId;
    private String bookName;
    private String authorName;

    public Book() {
    }

    public Book(Integer bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}

//package com.company;

public class Book extends Product {

    private String author;
    private int pages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    //Get the superclass info from its toString() and add more info for subclass
    @Override
    public String toString() {
        return super.toString()+
                "Author:                " + author + "\n" +
                "Pages:        " + pages + "\n";
    }

}


package com.perscholas.libraryusers;

public class LUser {
    protected int age = -1;
    protected String bookType;
    protected boolean validAccount = false;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}

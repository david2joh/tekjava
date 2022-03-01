package com.perscholas.libraryusers;

public class KidUser extends LUser implements LibraryUserI {

    public final static int KID_AGE_LIMIT = 12;
    public final static Book_Type KID_BOOK_TYPE = Book_Type.KIDS;
    public final static int LENDING_PERIOD = 10;

    KidUser(int age) {
        super();
        this.age = age;
    }

    @Override
    public void registerAccount() {
        if (this.age > 0 && this.age < KID_AGE_LIMIT) {
            System.out.println("You have successfully registered under a Kids Account");
            validAccount = true;
        }
        else { System.out.println("Sorry , Age must be less than "+ KID_AGE_LIMIT + " to register as a kid"); }
    }

    @Override
    public void requestBook(String bType) {
        if (validAccount) {
            if (bType.equalsIgnoreCase(KID_BOOK_TYPE.getBookType())) {
                //It's a kid book
                System.out.println("Book Issued successfully, please return the book within " + LENDING_PERIOD + " days");
            } else {
                System.out.println("Oops , you are allowed to take only " + KID_BOOK_TYPE.getBookType() + " books");
            }
        }
        else { System.out.println("Invalid Kid Account"); }
    }
}
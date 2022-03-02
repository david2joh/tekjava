package com.perscholas.libraryusers;

public class AdultUser  extends LUser implements LibraryUserI {

    public final static int ADULT_AGE_FLOOR = 12;
    public final static Book_Type ADULT_BOOK_TYPE = Book_Type.ADULT;  // on Expansion make this a List<Book_Type>
    public final static int LENDING_PERIOD = 7;


    AdultUser(int age) {
//   Would be better if use a factory pattern or throw an exception if trying to create this
//   object with argument checking
//        if(age <= ADULT_AGE_FLOOR )
//        {
//
//            throw new IllegalArgumentException("Age is not allowed");
//        }
//

        super();
        this.age = age;
    }

    @Override
    public void registerAccount() {
        if (this.age >= ADULT_AGE_FLOOR) {
            System.out.println("You have successfully registered under an Adult Account");
            validAccount = true;
        }
        else {
            System.out.println("Sorry , Age must be greater than " + ADULT_AGE_FLOOR + " to register as a kid");
        }
    }

    @Override
    public void requestBook(String bType) {
        if (validAccount) {
            if (bType.equalsIgnoreCase(ADULT_BOOK_TYPE.getBookType())) {
                //It's a Adult book
                System.out.println("Book Issued successfully, please return the book within " + LENDING_PERIOD + " days");
            } else {
                System.out.println("Oops , you are allowed to take only " + ADULT_BOOK_TYPE.getBookType() + " books");
            }
        }
        else { System.out.println("Invalid Adult Account"); }
    }
}

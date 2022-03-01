package com.perscholas.libraryusers;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        System.out.println("--- Kids ---");
        KidUser k1 = new KidUser(10);
        KidUser k2 = new KidUser(18);
        k1.registerAccount();
        k2.registerAccount();
        k1.requestBook("Kids");
        k1.requestBook("Fiction");
        k2.requestBook("Fiction");
        System.out.println("--- Adults ---");
        AdultUser a1 = new AdultUser(5);
        AdultUser a2 = new AdultUser(23);
        a1.registerAccount();
        a2.registerAccount();
        a2.requestBook("Kids");
        a2.requestBook("Fiction");
        a1.requestBook("Kids");

    }
}

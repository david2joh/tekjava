package com.perscholas.libraryusers;

public interface LibraryUserI {
    enum Book_Type { KIDS("Kids") , ADULT("Fiction");
    private String bookType = "";

        public String getBookType() {
            return bookType;
        }

        Book_Type(String bookType) {
            this.bookType = bookType;
        }
    } //ADD EnumMap access for a full blown implementation

     void registerAccount();
     void requestBook(String bType);
}

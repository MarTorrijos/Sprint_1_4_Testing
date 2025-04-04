package org.Level_1.ejercici_1.data;

import org.Level_1.ejercici_1.model.Book;

import static org.Level_1.ejercici_1.model.Library.getBookList;

public class BookInstances {

    public static void loadBooks() {
        getBookList().add(new Book("El imperio final"));
        getBookList().add(new Book("La guerra de la amapola"));
    }

}

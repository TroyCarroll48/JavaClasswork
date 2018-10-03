package Java;

import java.util.Calendar;

public class MainBoAu {
    public static void main(String[] args) {

        Author author = new Author("S. E. Hinton", 'M', "S.E@yahoo.com");

        Book book1 = new Book("The Outsiders ", author );

        System.out.println(book1.getAuthor().getName());

        book1.findAuthor();


    }
}
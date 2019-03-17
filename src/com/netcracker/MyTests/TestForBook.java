package com.netcracker.MyTests;

import com.netcracker.MyTasks.Author;
import com.netcracker.MyTasks.Book;

import java.util.Arrays;

public class TestForBook {

    public static void main(String[] args) {
        //Task 4 (Book class)
        beginTitle(4);
            Author[] auth1 = new Author[2];
            auth1[0] = new Author("Ilya Ilf", "ilf@gmail.com", 'm');
            auth1[1] = new Author("Evgeniy Petrov", "petr@mail.ru", 'm');
            Book book1 = new Book("The 12 chairs", auth1, 500);
            Book book2 = new Book("The Twelve Chairs", auth1, 500, 10);
            System.out.println(book1);
            System.out.println(book2);
            Author[] auth2 = null;
            Book book3 = new Book("Masha and Medved", auth2, 200, 1);
            System.out.println(book3);
            Book book4 = new Book(book3.getName(), book2.getAuthors(), book3.getPrice(), book3.getQty());
            System.out.println(book4);
            book4.setPrice(100);
            book4.setQty(23);
            System.out.println("After changes:");
            System.out.println(book4 + "; " + book4.getAuthorNames());

            System.out.println("\n Equals and HashCode:");
            Author[] auth10 = new Author[2];
            auth10[0] = new Author("Sidorov", "sidorov@gmail.com", 'm');
            auth10[1] = new Author("Bogatova", "bogatova@mail.ru", 'f');
            Author[] auth11 = auth10;
            Author[] auth12 = new Author[2];
            auth12[0] = new Author("Sidorov", "sidorov@gmail.com", 'm');
            auth12[1] = new Author("Bogatova", "bogatova@mail.ru", 'f');
            Author[] auth13 = new Author[2];
            auth13[0] = new Author("Ivanov", "sidorov@gmail.com", 'm');
            auth13[1] = new Author("Bogatova", "bogatova@mail.ru", 'f');
            Book book10 = new Book("Book-123", auth10, 100, 5);
            Book book11 = book10;
            Book book12 = new Book("Book-123", auth10, 100, 5);
            Book book13 = new Book("Book-123", auth10, 101, 5);
            Book book14 = new Book("Book-123", auth11, 100, 5);
            Book book15 = new Book("Book-123", auth12, 100, 5);
            Book book16 = new Book("Book-123", auth13, 100, 5);
            System.out.println("book10(auth10): " + book10 + ", hashcode=" + book10.hashCode() + "(" + auth10[0].hashCode() + ", " + auth10[1].hashCode() + ")");
            System.out.println("book11(auth10): " + book11 + ", hashcode=" + book11.hashCode() + "(" + auth10[0].hashCode() + ", " + auth10[1].hashCode() + ")");
            System.out.println("book12(auth10): " + book12 + ", hashcode=" + book12.hashCode() + "(" + auth10[0].hashCode() + ", " + auth10[1].hashCode() + ")");
            System.out.println("book13(auth10): " + book13 + ", hashcode=" + book13.hashCode() + "(" + auth10[0].hashCode() + ", " + auth10[1].hashCode() + ")");
            System.out.println("book14(auth11): " + book14 + ", hashcode=" + book14.hashCode() + "(" + auth11[0].hashCode() + ", " + auth11[1].hashCode() + ")");
            System.out.println("book15(auth12): " + book15 + ", hashcode=" + book15.hashCode() + "(" + auth12[0].hashCode() + ", " + auth12[1].hashCode() + ")");
            System.out.println("book16(auth13): " + book16 + ", hashcode=" + book16.hashCode() + "(" + auth13[0].hashCode() + ", " + auth13[1].hashCode() + ")");
            System.out.println("\nauth10_hashCode vs auth11_hashCode: " + auth10[0].hashCode() + ", " + auth10[1].hashCode() + " vs " + auth11[0].hashCode() + ", " + auth11[1].hashCode());
            System.out.println("hashCode for arrays: " + Arrays.hashCode(auth10) + " vs " + Arrays.hashCode(auth11));
            System.out.println("auth10 equals auth11?: " + auth10[0].equals(auth11[0]) + ", " + auth10[1].equals(auth11[1]) + "; result for arrays = " + Arrays.equals(auth10, auth11));
            System.out.println("auth10 == auth11?: " + (auth10[0] == auth11[0]) + ", " + (auth10[1] == auth11[1]) + "; result for arrays = " + (auth10 == auth11));
            System.out.println("\nauth10_hashCode vs auth12_hashCode: " + auth10[0].hashCode() + ", " + auth10[1].hashCode()  + " vs " + auth12[0].hashCode() + ", " + auth12[1].hashCode());
            System.out.println("hashCode for arrays: " + Arrays.hashCode(auth10) + " vs " + Arrays.hashCode(auth12));
            System.out.println("auth10 equals auth12?: " + auth10[0].equals(auth12[0]) + ", " + auth10[1].equals(auth12[1]) + "; result for arrays = " + Arrays.equals(auth10, auth12));
            System.out.println("auth10 == auth12?: " + (auth10[0] == auth12[0]) + ", " + (auth10[1] == auth12[1]) + "; result for arrays = " + (auth10 == auth12));
            System.out.println("\nauth10_hashCode vs auth13_hashCode: " + auth10[0].hashCode() + ", " + auth10[1].hashCode() + " vs " + auth13[0].hashCode() + ", " + auth13[1].hashCode());
            System.out.println("hashCode for arrays: " + Arrays.hashCode(auth10) + " vs " + Arrays.hashCode(auth13));
            System.out.println("auth10 equals auth13?: " + auth10[0].equals(auth13[0]) + ", " + auth10[1].equals(auth13[1]) + "; result for arrays = " + Arrays.equals(auth10, auth13));
            System.out.println("auth10 == auth13?: " + (auth10[0] == auth13[0]) + ", " + (auth10[1] == auth13[1]) + "; result for arrays = " + (auth10 == auth13));
            System.out.println("\nbook10[auth10]_hashCode vs book11[auth10]_hashCode: " + book10.hashCode() + " vs " + book11.hashCode());
            System.out.println("book10[auth10] equals book11[auth10]?: " + book10.equals(book11));
            System.out.println("book10[auth10] == book11[auth10]?: " + (book10 == book11));
            System.out.println("\nbook10[auth10]_hashCode vs book12[auth10]_hashCode: " + book10.hashCode() + " vs " + book12.hashCode());
            System.out.println("book10[auth10] equals book12[auth10]?: " + book10.equals(book12));
            System.out.println("book10[auth10] == book12[auth10]?: " + (book10 == book12));
            System.out.println("\nbook10[auth10]_hashCode vs book13[auth10]_hashCode: " + book10.hashCode() + " vs " + book13.hashCode());
            System.out.println("book10[auth10] equals book13[auth10]?: " + book10.equals(book13));
            System.out.println("book10[auth10] == book13[auth10]?: " + (book10 == book13));
            System.out.println("\nbook10[auth10]_hashCode vs book14[auth11]_hashCode: " + book10.hashCode() + " vs " + book14.hashCode());
            System.out.println("book10[auth10] equals book14[auth11]?: " + book10.equals(book14));
            System.out.println("book10[auth10] == book14[auth11]?: " + (book10 == book14));
            System.out.println("\nbook10[auth10]_hashCode vs book15[auth12]_hashCode: " + book10.hashCode() + " vs " + book15.hashCode());
            System.out.println("book10[auth10] equals book15[auth12]?: " + book10.equals(book15));
            System.out.println("book10[auth10] == book15[auth12]?: " + (book10 == book15));
            System.out.println("\nbook10[auth10]_hashCode vs book16[auth13]_hashCode: " + book10.hashCode() + " vs " + book16.hashCode());
            System.out.println("book10[auth10] equals book16[auth13]?: " + book10.equals(book16));
            System.out.println("book10[auth10] == book16[auth13]?: " + (book10 == book16));
        endTitle();
    }

    //For some sort of design
    private static void beginTitle(int num) {
        System.out.println("******************* Task " + num + " *******************");
    }
    private static void endTitle() {
        System.out.println("**********************************************" + "\n");
    }

}
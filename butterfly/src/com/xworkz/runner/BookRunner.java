package com.xworkz.runner;


import com.xworkz.external.Novel;
import com.xworkz.internal.Book;

public class BookRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Book book = new Novel();
            book.open();
            book.readPage(45);
            book.bookmarkPage(45);
            book.getTitle();
            book.getAuthor();

            book.close();

            System.out.println("\n=== Using Class Reference ===");
            Novel novel = new Novel();
            novel.open();
            novel.readPage(101);
            novel.bookmarkPage(101);
            novel.getTitle();
            novel.getAuthor();

            novel.close();
        }
    }

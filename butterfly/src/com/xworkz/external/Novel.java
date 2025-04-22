package com.xworkz.external;

import com.xworkz.internal.Book;

public class Novel implements Book {

        @Override
        public void open() {
            System.out.println("Opening the novel...");
        }

        @Override
        public void close() {
            System.out.println("Closing the novel.");
        }

        @Override
        public void readPage(int pageNumber) {
            System.out.println("Reading page " + pageNumber + " of the novel.");
        }

        @Override
        public void bookmarkPage(int pageNumber) {
            System.out.println("Bookmarked page " + pageNumber + " in the novel.");
        }

        @Override
        public void getTitle() {
            System.out.println("Title: The Silent Echo");
        }

        @Override
        public void getAuthor() {
            System.out.println("Author: Jane Writer");
        }

        }



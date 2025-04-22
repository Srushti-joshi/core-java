package com.xworkz.internal;


    public interface Book {
        void open();

        void close();

        void readPage(int pageNumber);

        void bookmarkPage(int pageNumber);

        void getTitle();

        void getAuthor();
    }


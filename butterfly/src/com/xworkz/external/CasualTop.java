package com.xworkz.external;

import com.xworkz.internal.Top;

    public class CasualTop implements Top {

        @Override
        public void wear() {
            System.out.println("Wearing the casual top");
        }

        @Override
        public void wash() {
            System.out.println("Washing the casual top");
        }

        @Override
        public void fold() {
            System.out.println("Folding the casual top neatly");
        }

        @Override
        public void iron() {
            System.out.println("Ironing the casual top to remove wrinkles");
        }

        @Override
        public void getSize() {
            System.out.println("Size of the casual top: Medium");
        }
    }


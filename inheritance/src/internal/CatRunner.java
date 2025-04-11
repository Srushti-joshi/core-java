package internal;


import external.PersianCat;

public class CatRunner {
        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.makeSound();

            Cat persianCat = new PersianCat();
            persianCat.makeSound();

            PersianCat pc = new PersianCat();
            pc.makeSound();
            pc.fluffyFur();
        }
    
}

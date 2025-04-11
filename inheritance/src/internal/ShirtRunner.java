package internal;

import external.FormalShirt;

public class ShirtRunner {
        public static void main(String[] args) {
            Shirt shirt = new Shirt();
            shirt.wear();

            Shirt formalShirt = new FormalShirt();
            formalShirt.wear();

            FormalShirt fs = new FormalShirt();
            fs.wear();
            fs.iron();
        }
    }



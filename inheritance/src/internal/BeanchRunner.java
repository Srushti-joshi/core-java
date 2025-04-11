package internal;

import external.WoodenBeanch;

public class BeanchRunner {
        public static void main(String[] args) {
            Beanch bench = new Beanch();
            bench.sit();

            Beanch woodenBench = new WoodenBeanch();
            woodenBench.sit();

            WoodenBeanch wb = new WoodenBeanch();
            wb.sit();
            wb.polish();
        }
}

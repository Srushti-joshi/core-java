package internal;

public class Ipl {
    public static void main(String[] args) {

        String input = "rcb will win";
        input = input.replace("win", "niw");
        String output = input + " eht match";
        String in = "rcb will win the match against csk";
        String[] words = in.split(" ");
        for (String word : words) {
            System.out.print(word.length() + "  ");
            String inpu = "toady is my day, i will do best";
            inpu = inpu.toLowerCase();
            int vowels = 0, consonants = 0;
            for (int i = 0; i < inpu.length(); i++) {
                char ch = inpu.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    if ("a".indexOf(ch) != -1) {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }
            System.out.println("Vowels (constants): " + vowels);
            System.out.println("Consonants (variables): " + consonants);
                    String a = "srushti";
                    String b = "joshi";
                    a = a + b;
                    b = a.substring(0, a.length() - b.length());
                    a = a.substring(b.length());
                    System.out.println("After swap:");
                    System.out.println("a = " + a);
                    System.out.println("b = " + b);
                    String inputs ="hello how "

                }
            }
 }


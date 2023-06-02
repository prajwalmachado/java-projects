package passwordGen;

import java.util.Scanner;

public class Main {
    public static final Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        Generator generator = new Generator(kb);
        generator.mainLoop();
        kb.close();
    }
}

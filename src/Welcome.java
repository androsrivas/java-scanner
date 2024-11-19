import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dime cómo quieres que te llame: ");
        String name = input.next();

        System.out.println("Hola! Bienvenide " + name + " al mundo de Java!");

        input.close();
    }
}

import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
        //Crea el scanner
        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        //Recoge el dato
        //Añade una nueva línea.
        //¿Te acordaste del nextLine trap?
        //Recuerda cerrar el scanner

        Scanner input = new Scanner(System.in);

        System.out.println("Hola, ¿cómo te llamas?");
        String name = input.nextLine();
        System.out.println("Encantade de conocerte " + name);

        System.out.println("¿desde dónde programas?");
        String location = input.nextLine();
        System.out.println("Qué hermosa ciudad es " + location);

        System.out.println("¿y cuántos años tienes?");
        int age = input.nextByte();
        input.nextLine();

        if (age < 27) {
            System.out.println("Qué joven eres!");
        } else if (age < 40) {
            System.out.println("Debes ser una persona muy experimentada");
        } else {
            System.out.println("Rezumas sabiduría");
        }

        System.out.println("por último, ¿cuál es tu lenguaje de programación favorito?");
        String programmingLanguage = input.nextLine();
        System.out.println(programmingLanguage + " es un buen lenguaje de programación. Buena elección.");

        input.close();
    }
}

import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro

        //Los datos que debes pedir al usuario son:
        //1. Nombre
        //2. Apellido
        //3. Nombre de usuario
        //4. Contraseña

        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta

        Scanner input = new Scanner(System.in);

        System.out.print("Hola. Para registrarte, debes proporcionar la siguiente información:" + "\n" + "Nombre: ");
        String name = input.next();

        System.out.print("Apellido: ");
        String surname = input.next();

        System.out.print("Nombre de usuario: ");
        String username = input.next();

        System.out.print("Contraseña: ");
        String password = input.next();

        System.out.println("Hola, " + name + " " + surname + ". Tu nombre de usuario es " + username + " y tu contraseña es " + password + ". Gracias por registrarte.");
    }
}
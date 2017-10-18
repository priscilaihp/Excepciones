// import java.util.InputMismatchException;
// import java.util.Scanner;

// Incluye los de arriba y todos.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class EjemploExcepciones
{
    public static void main(String[] args) throws FileNotFoundException
    {
        try
        {
            // Para el manejo de un archivo.
            // Para los errores sale un comentario en azul en el error y presionas alt+Intro.
            // Para crear un archivo.txt das click derecho a excepciones -> new -> File y le pones el nombre, en este caso entrada.txt
            File archivo = new File("entrada.txt");
            Scanner teclado =  new Scanner(archivo);
            // Scanner teclado = new Scanner(System.in);
            System.out.print("Dame el primer número: ");
            // Toma el siguiente numero entero.
            int num1 = teclado.nextInt();
            System.out.print("Dame el segundo número: ");
            int num2 = teclado.nextInt();
            System.out.print("La división es: " + num1 / num2);
            // Correr el programa y probarlo con diferentes valores.
            // ¿Qué ocurre cuando num2 es 0? ¿Como se llama la excepción? ArithmeticException
            // Buscar la excepción en la documentación de Java. Das click derecho en la excepción y lo buscas en Google.
            // y revisar de quien es subclase la excepción. RuntimeException
            // Cuando ingresas letras, la excepción es InputMismatchException.
        }
        // Hacemos excepciones y mostramos mensajes.
        catch(ArithmeticException excepcionAritmetica)
        {
            System.out.println("División por cero");
        }
        catch(InputMismatchException excepcionEntrada)
        {
            System.out.println("Entrada incorrecta");
        }
        // Atrapas la excepción.
        catch(FileNotFoundException e)
        {
            System.out.println("No existe el archivo");
        }
    }
}

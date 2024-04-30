import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenidos a la inmersión en Java!");
        //  System.out.println("Película Matrix");

        // Declaración de Variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del fin del milenio
                """;
        double mediaEvaluacionUsuario = 0.0;
        Scanner teclado = new Scanner(System.in); // Leer entrada del usuario
        teclado.useLocale(Locale.ENGLISH); // Establecer el separador decimal como el punto
        DecimalFormat df = new DecimalFormat("#.00"); //Formatear a 2 decimales

        // Detalles de la Película
        System.out.println("Detalles de la Película:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Incluida en el Plan Básico: " + (incluidoEnElPlanBasico ? "Sí" : "No"));

        double mediaEvaluacion = (4.5 + 4.8 + 3 ) / 3;
        System.out.println("Media de la evaluación de Matrix: " + df.format(mediaEvaluacion));
        
        // Condicionales

        if(fechaDeLanzamiento >= 2024){
            System.out.println("Película popular en el momento");
        } else {
            System.out.println("Película retro que vale la pena ver");
        }

        // Bucles
        // For
        /*
            for (int i = 0; i < 3; i++) {

                System.out.println("Ingresa la evaluación que le darías a " + nombre + ": ");

                double notaMatrix = obtenerEvaluacion(teclado);
                mediaEvaluacionUsuario += notaMatrix;
            }
        */

        // While

        char continuar = 's'; // Variable para controlar si el usuario desea continuar
        int contadorEvaluaciones = 0; // Contador para el número de evaluaciones ingresadas

        while (continuar == 's' || continuar == 'S') {
            System.out.println("Ingresa la evaluación que le darías a " + nombre + ": ");

            double notaMatrix = obtenerEvaluacion(teclado);
            mediaEvaluacionUsuario += notaMatrix;
            contadorEvaluaciones++; //incrementa +1

            System.out.println("¿Deseas ingresar otra evaluación? (s/n): ");
            continuar = teclado.next().charAt(0); // Leer la respuesta del usuario
        }

        teclado.close(); // Cerrar el Scanner después de usarlo
        System.out.println("La media de la película " + nombre + " es "+ df.format(mediaEvaluacionUsuario / contadorEvaluaciones));
    }

    public static double obtenerEvaluacion(Scanner teclado) {
        while (!teclado.hasNextDouble()) { // Manejar caracteres no numéricos
            System.out.println("Entrada inválida. Por favor ingresa un número válido.");
            teclado.next(); // Descartar la entrada no válida
        }
        return teclado.nextDouble();
    }
}
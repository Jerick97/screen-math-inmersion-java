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
        System.out.println("Película: " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3 ) / 3;
        System.out.println("Media de la evaluación de Matrix: " + mediaEvaluacion);
        
        // Condicionales

        if(fechaDeLanzamiento >= 2024){
            System.out.println("Película popular en el momento");
        } else {
            System.out.println("Película retro que vale la pena ver");
        }

        // Bucles
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.ENGLISH); // Establecer el separador decimal como el punto
        DecimalFormat df = new DecimalFormat("#.00"); //Formatear a 2 decimales

        for (int i = 0; i < 3; i++) {
            // Leer entrada del usuario
            System.out.println("Ingresa la evaluación que le darías a " + nombre + ": ");

            while (!teclado.hasNextDouble()) { // Manejar caracteres no numéricos
                System.out.println("Entrada inválida. Por favor ingresa un número válido.");
                teclado.next(); // Descartar la entrada no válida
            }

            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario += notaMatrix;
        }
        teclado.close(); // Cerrar el Scanner después de usarlo
        System.out.println("La media de la película " + nombre + "es "+ df.format(mediaEvaluacionUsuario / 3));
    }
}
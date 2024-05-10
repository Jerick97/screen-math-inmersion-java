import calculos.CalculadoraDeTiempo;
import modelo.Pelicula;
import modelo.Serie;

import java.util.Scanner;

public class Principal {
    private Pelicula peliculaUsuario = new Pelicula();
    private Serie serieUsuario = new Serie();
    private CalculadoraDeTiempo calculadoraDeTiempo = new CalculadoraDeTiempo();
    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while(opcion != 9){
          String menu = """
                 Bienvenido(a) a Screenmatch
                 
                 1) Registrar nueva película
                 2) Registrar nueva serie
                 3) Calculadora de tiempo
                 9) Salir
                 
                  """;
            System.out.println(menu);
            opcion = validarEntero(teclado);
            teclado.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la película");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la película");
                    int fechaDeLanzamiento = validarEntero(teclado);
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos de la película");
                    int duracionEnMinutos = validarEntero(teclado);
                    teclado.nextLine();

                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.muestraFichaTecnica();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la serie");
                    String nombreSerie = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la serie");
                    int fechaDeLanzamientoSerie = validarEntero(teclado);
                    teclado.nextLine();
                    System.out.println("Por favor ingresa el numero de temporadas para esta serie");
                    int temporadas = validarEntero(teclado);
                    teclado.nextLine();
                    System.out.println("Por favor ingresa la cantidad de episodios por cada temporada");
                    int episodiosPorTemporada = validarEntero(teclado);
                    teclado.nextLine();
                    System.out.println("Por favor ingresa la duración en minutos de cada episodio");
                    int minutosPorEpisodio = validarEntero(teclado);
                    teclado.nextLine();

                    serieUsuario.setNombre(nombreSerie);
                    serieUsuario.setFechaDeLanzamiento(fechaDeLanzamientoSerie);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.setEpisodiosPorTemporadas(episodiosPorTemporada);
                    serieUsuario.setDuracionEnMinutosPorEpisodios(minutosPorEpisodio);
                    serieUsuario.muestraFichaTecnica();
                    break;
                case 3:
                    System.out.println("Tiempo que necesitas para hacer un maratón con tus títulos favoritos "
                            + calculadoraDeTiempo.getTiempoTotal() + " minutos");
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    public static int validarEntero(Scanner teclado) {
        while (!teclado.hasNextInt()) { // Manejar caracteres no numéricos
            System.out.println("Entrada inválida. Por favor ingresa un número entero válido.");
            teclado.next(); // Descartar la entrada no válida
        }
        return teclado.nextInt();
    }
}

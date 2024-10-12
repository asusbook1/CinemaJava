package cinemajava;
import java.util.Scanner;

public class CinemaJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matriz an = new Matriz();
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("          PELICULA");
        System.out.println("╠═════════════════════════════════╣");
        System.out.println("    Nombre: Matrix");
        System.out.println("    Duración: 120 min");
        System.out.println("    Director: Wachowski");
        System.out.println("    Edad Minima: 15");
        System.out.println("╚═════════════════════════════════╝");
        System.out.println(" ");
        while (true) {
            System.out.print("Quieres comprar un boleto? ");
            if (!scanner.next().equals("Si")) {
                break;
            }
            System.out.println(" ");
            System.out.println("╠ Tus Datos ╣");
            System.out.print("NOMBRE: ");
            String nombre = scanner.next();
            System.out.print("EDAD: ");
            int edad = scanner.nextInt();
            System.out.print("DINERO: ");
            double dinero = scanner.nextDouble();

            Personas persona = new Personas(nombre, edad, dinero);
            int[] asiento = an.MostrarAsientos(persona);
            System.out.println(" ");
            an.MostrarDatos();
            
            if (asiento == null) {
                if (persona.GetEdad() < 15) {
                    System.out.println("No tienes edad sufuciente para ver la "
                            + "pelicula.");
                }
                if (persona.GetDinero() < 10000) {
                    System.out.println("No te alcanza el dinero para comprar"
                            + " el boleto.");
                }
            } else {
                char filaLetra = (char) ('A' + asiento[0]);
                System.out.println("Puesto asignado: " + persona.GetNombre() 
                        + ". Fila " + filaLetra + ", Columna " 
                        + (8 - asiento[1]));   
            } 
        }
    }
}

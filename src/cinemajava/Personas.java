package cinemajava;

public class Personas {
    private final String nombre;
    private final int edad;
    private final double dinero;

    public Personas(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String GetNombre() {
        return nombre;
    }

    public int GetEdad() {
        return edad;
    }

    public double GetDinero() {
        return dinero;
    }
}

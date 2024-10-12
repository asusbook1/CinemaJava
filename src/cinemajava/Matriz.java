package cinemajava;

public class Matriz {
    String[][] asientos = new String[8][9];
    
    public Matriz() {
        AF();
    }
    
    private void AF() {
        for (int i = 0; i < 8; i = i + 1) {
            for (int j = 0; j < 9; j = j + 1) {
                asientos[i][j] = " ";
            }
        }
    }
    
    public int[] MostrarAsientos(Personas persona) {
        if (persona.GetDinero() < 10000) {
            return null;
        }
        if (persona.GetEdad() < 15) {
            return null;
        }
        
        for (int intentos = 0; intentos < 10; intentos = intentos + 1) {
            int fila = (int) (Math.random() * 8);
            int columna = (int) (Math.random() * 9);
            if (asientos[fila][columna] == " "); {
            asientos[fila][columna] = "️X";
            return new int[]{columna, fila};
        }
        }  
        return null;
    }
    
    public void MostrarDatos() {
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
        System.out.print("  ");
        for (String letra : letras) {
            System.out.print(" " + letra + "  ");
        }
        System.out.println();
        for (int i = 0; i < 8; i = i + 1) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < 9; j = j + 1) {
                System.out.print("[" + asientos[i][j] + "] ");
            }
            System.out.println();
        }
    }
}
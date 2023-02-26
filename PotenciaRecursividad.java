public class PotenciaRecursividad extends Padre {
      public PotenciaRecursividad(String nombre) {
        super(nombre);
    }
        int base = 2;
        int exponente = 5;
        int resultado = potencia(base, exponente);
    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
    public void potencia()
    {
        System.out.println(base + " elevado a la " + exponente + " es igual a: " + resultado);
    }
    
}
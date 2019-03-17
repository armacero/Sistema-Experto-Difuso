package sistema;

/**
 * @author Antony-PC
 */
public class Centroide {
    public static int n = 100;  //N veces
    public static float x = n;  // Valor de X
    public static float[] ux = new float[n]; // Grado de membrecia respecto a X
    public static float sumatoria, sumatoria2, salida_real;
    
    public Centroide(){
        
    }
    public float Centroide(int n, float x, float ux[]) {
        for (int i = 0; i < n; i++) {
            sumatoria = sumatoria + (x * ux[i]);
            sumatoria2 = sumatoria2 + ux[i];
        }

        salida_real = sumatoria / sumatoria2;
        System.out.println("La salida real es:  " + salida_real);
        return salida_real;
    }
}

import java.util.Scanner;
 
public class Ejercicio6_18 {
   
    Scanner teclado = new Scanner(System.in);
   
    int n;
   
    public void entradato() {
        System.out.print("Por favor ingrese lado del cuadrado: ");
        n = teclado.nextInt();
    }
   
    public void proceso() {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(" *");
                }
                System.out.println("");
            }
            
    }
   
   
 
    public static void main(String[] args) {
        Ejercicio6_18 fc = new Ejercicio6_18();
        fc.entradato();
        fc.proceso();
    }
}
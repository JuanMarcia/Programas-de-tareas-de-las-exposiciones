import java.util.Scanner;

public class e6_22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            printMenu();
            int el = sc.nextInt();

            if(el == 9)
                break;

            if(el == 1){
                System.out.print("\nTemperatura en Celsius: ");
                System.out.printf("La temperatura en farenheit es: %.2f\n\n",
                        farenheit(sc.nextDouble()));
            }else{
                System.out.print("\nTemperatura en Farenheit: ");
                System.out.printf("La temperatura en celsius es: %.2f\n\n",
                        celsius(sc.nextDouble()));
            }
        }
    }
    private static void printMenu(){
        System.out.println("********");
        System.out.println("1. Celsius a Farenheit");
        System.out.println("2. Farenheit a Celsius");
        System.out.println("9. Salir.");
        System.out.println("********");
        System.out.print("> ");
    }
    private static double celsius(double farenheit){
        return 5.0 / 9.0 * (farenheit - 32);
    }
    private static double farenheit(double celsius){
        return 9.0 / 5.0 * celsius + 32;
    }
}
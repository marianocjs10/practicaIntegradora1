import java.util.Scanner;
public class Logica {
    public static void algoritmosString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primer cadena de texto");
        String cadena1 = sc.nextLine();
        System.out.println("Ingrese la segunda cadena de texto");
        String cadena2 = sc.nextLine();
        if(cadena1.length() >= cadena2.length()){
            if(cadena1.contains(cadena2)){
                System.out.println("ENCONTRADO");
            } else {
                System.out.println("NO ENCONTRADO");
            }
        } else {
            System.out.println("La segunda cadena debe ser menor o igual a la primera");
            algoritmosString();
        }
    }


    public static void algoritmosRepetitiva(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros:");
        int N = sc.nextInt();
        double total=0;
        if(N > 0) {
            for (int i = 0; i < N; i++) {
                System.out.println("Ingrese el "+ (i+1) +"° numero: ");
                total += sc.nextDouble();
            }
            double promedio = total / N;
            System.out.println("Promedio: "+promedio);
        } else {
            System.out.println("Ingrese un numero mayor que 0.");
            algoritmosRepetitiva();
        }
    }

    // C O M P L E T A R ------------------------------------------------
    public static void algoritmosRecursiva(){

    }
}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcion = 1;
        while (opcion != 0) {
            System.out.println("""
                               ELIJA LA OPCION QUE DESEE:
                               1-String
                               2-Repetitiva
                               3-Recursiva
                               4-Arreglo 1
                               5-Arreglo 2
                               6-Restaurante""");
            opcion = new Scanner(System.in).nextInt();
            if (opcion == 1) {
                Logica.algoritmosString();
            } else if (opcion == 2) {
                Logica.algoritmosRepetitiva();
            } else if (opcion == 3) {
                Logica.algoritmosRecursiva();
            } else if (opcion == 4) {
                Logica.algoritmosArreglo1();
            } else if (opcion == 5){
                Logica.algoritmosArreglo2();
            } else if (opcion == 6) {
                Logica.restaurante();
            }
        }
    }
}

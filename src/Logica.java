
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Logica {
    
    public static final Scanner sc = new Scanner(System.in);

    public static void algoritmosString() {

        System.out.println("Ingrese la primer cadena de texto");
        String cadena1 = sc.nextLine();
        System.out.println("Ingrese la segunda cadena de texto");
        String cadena2 = sc.nextLine();
        if (cadena1.length() >= cadena2.length()) {
            if (cadena1.contains(cadena2)) {
                System.out.println("ENCONTRADO");
            } else {
                System.out.println("NO ENCONTRADO");
            }
        } else {
            System.out.println("La segunda cadena debe ser menor o igual a la primera");
            algoritmosString();
        }
    }

    public static void algoritmosRepetitiva() {

        System.out.println("Ingrese la cantidad de numeros:");
        int N = sc.nextInt();
        double total = 0;
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                System.out.println("Ingrese el " + (i + 1) + "° numero: ");
                total += sc.nextDouble();
            }
            double promedio = total / N;
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("Ingrese un numero mayor que 0.");
            algoritmosRepetitiva();
        }
    }

    public static void algoritmosRecursiva() {
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();

        recursiva(frase, 0);
        System.out.println();
    }

    public static void recursiva(String cadena, int indice) {
        // Caso base: si el índice es igual a la longitud de la cadena, terminar
        if (indice == cadena.length()) {
            return; // Fin de la recursión
        }

        // Imprimir la letra actual
        System.out.print(cadena.charAt(indice) + " ");

        // Llamar a la función recursivamente para el siguiente índice
        recursiva(cadena, indice + 1);
    }
    
    public static void algoritmosArreglo1() {

        Random random = new Random();
        int[] arreglo = new int[10];
        int i = 0;

        while (i < 10) {
            int numeroAleatorio = random.nextInt(100) + 1;

            // Validar que el número no esté ya en el array
            boolean existe = false;

            for (int j = 0; j < i; j++) {
                if (arreglo[j] == numeroAleatorio) {
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                // Almacenar el número en el array
                arreglo[i] = numeroAleatorio;
                i++; // Incrementar el contador
            }
        }

        System.out.println("El arreglo queda: " + Arrays.toString(arreglo));

    }
    
    public static void algoritmosArreglo2() {

        System.out.print("Indique la dimension en la que desea el arreglo: ");
        int cant = sc.nextInt();

        while (cant <= 0) {
            System.out.println("Dimension invalida! Indique nuevamente la dimension del arreglo ( > 0 ):");
            cant = sc.nextInt();
        }

        int[] arreglo = new int[cant];

        System.out.println("Ingrese " + cant + " números enteros para completar el arreglo: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i + 1) + ". ");
            arreglo[i] = sc.nextInt();
        }

        System.out.println("Ingrese un número que desee eliminar del arreglo: ");
        int borrarNum = sc.nextInt();

        System.out.println("Elemento a borrar: " + borrarNum);

        int cont = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != borrarNum) {
                cont++;
            }
        }

        int[] arreglo2 = new int[cont];
        int j = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != borrarNum) {
                arreglo2[j++] = arreglo[i];
            }
        }

        System.out.println("-------------------------------------------");
        System.out.println("Arreglo inicial: " + Arrays.toString(arreglo));
        System.out.println("-------------------------------------------");
        System.out.println("Arreglo final: " + Arrays.toString(arreglo2));
        System.out.println();

    }
    
    public static void restaurante() {

        int[] precios = {2500, 3200, 4500};

        System.out.println("BIENVENIDO!");
        System.out.print("Ingrese el numero de comensales (mínimo 1, máximo 6): ");
        int comensales = sc.nextInt();

        while (!(comensales >= 1 && comensales <= 6)) {
            System.out.println("Inválido! Ingrese nuevamente el numero de comensales (mín 1, máx 6): ");
            comensales = sc.nextInt();
        }

        System.out.println("""
                              - MENÚS -
                           - Menú 1: $2500
                           - Menú 2: $3200
                           - Menú 3: $4500
                           """);

        int[] menusElegidos = new int[comensales];

        for (int i = 0; i < menusElegidos.length; i++) {
            System.out.print("Introduce el menú pedido por el comensal " + (i + 1) + ": ");
            int menuSeleccionado = sc.nextInt();

            while (!(menuSeleccionado >= 1 && menuSeleccionado <= 3)) {
                System.out.print("Menú inválido! Ingrese un valor válido (1, 2 o 3) para el comensal " + (i + 1) + ": ");
                menuSeleccionado = sc.nextInt();
            }
            menusElegidos[i] = menuSeleccionado;
        }

        int costoTotal = 0;

        System.out.println();

        for (int i = 0; i < comensales; i++) {
            int menu = menusElegidos[i];
            int precio = precios[menu - 1];

            System.out.println("Comensal " + (i + 1) + " va a tomar el menú " + menu + ", con precio $ " + precio);

            costoTotal += precio;
        }
        
        System.out.println();
        System.out.println("El costo total a pagar por la mesa es de $ " + costoTotal);

    }
}

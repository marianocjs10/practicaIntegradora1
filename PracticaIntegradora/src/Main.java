import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int opcion=1;
        while(opcion!=0){
            System.out.println(
                    "1-String\n"+
                    "2-Repetitiva\n"+
                    "3-Recursiva\n"+
                    "4-Arreglo");
            opcion=new Scanner(System.in).nextInt();
            if(opcion==1){
                Logica.algoritmosString();
            } else if (opcion==2) {
                Logica.algoritmosRepetitiva();
            } else if (opcion==3){

            } else if (opcion==4) {

            }
        }
    }
}
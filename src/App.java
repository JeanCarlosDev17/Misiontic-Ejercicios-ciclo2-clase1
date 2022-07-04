import java.util.function.Function;
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        var ejecutar = true;
        String value = "";

        while (ejecutar) {

            System.out.println("\n\tMenu principal \n");
            System.out.println("Seleccione la operacion que desea realizar");
            System.out.println("1. salir");
            System.out.println("2. ejercicio 1 Saludar");
            System.out.println("3. ejercicio 2 Numero de digitos");
            System.out.println("4. ejercicio 3 duplicar y triplicar");
            System.out.println("5. ejercicio 4 Grados Centigrados a Fahrenheit");
            System.out.println("6. ejercicio 5 Suma, resta, division y multiplicación de 2 numeros");
            // System.out.println("7. ejercicio 8");
            // System.out.println("8. ejercicio 9");
            // System.out.println("9. ejercicio 10");
            // System.out.println("10. ejercicio 11");
            // System.out.println("11. ejercicio 12");
            // System.out.println("12. ejercicio 13");
            // System.out.println("");
            // System.out.println("");
            // System.out.println("");
            System.out.println("");

            value = scan.nextLine();

            switch (value) {
                case "1":
                    ejecutar = false;

                    break;
                case "2":
                    ejercicio1();
                    break;
                case "3":
                    ejercicio2();
                    break;
                case "4":
                    ejercicio3();

                    break;
                case "5":
                    ejercicio4();
                break;
                case "6":
                    ejercicio5();
                break;
                // case :

                // break;
                // case :

                // break;
                // case :

                // break;
                // case :

                // break;

                default:

                    break;
            }

        }
        scan.close();
        System.out.println(" \033");
        System.out.println("Hasta luego, Un gusto nos vemos pronto!");
    }

    public static void ejercicio1() {
        String nombre;
        System.out.println("Ingresa tu nombre");

        nombre = scan.nextLine();
        System.out.printf("Hola %s te saludo desde java, Bienvenido \n", nombre);
        System.out.println("presione enter para continuar");
        scan.nextLine();
    }

    public static void ejercicio2() {
        System.out.println("ingrese un numero");
        var numero = Math.abs(scan.nextInt());
        int cifras = 0;
        do {
            numero = numero / 10;
            cifras++;
        } while (numero > 0);
        scan.nextLine();
        System.out.printf("El numero de cifras es %d \n", cifras);
        System.out.println("presione enter para continuar");
        scan.nextLine();
    }

    public static void ejercicio3() {
        System.out.println("Ingrese el numero a duplicar y triplicar");
        var numero = scan.nextInt();
        scan.nextLine();
        System.out.printf("El doble de %d es %d y el triple es  %d \n pulse Enter para continuar ", numero, numero * 2,
                numero * 3);
        scan.nextLine();
    }

    public static void ejercicio4(){
        System.out.println("Ingrese a temperatura en grados centigrados");
        Float gradosC=Float.parseFloat(scan.nextLine());
        Float gradosF=32+(9*gradosC/5);
        System.out.printf("La conversión de %.2f grados centrigrdos a fahrenheit es %.2f \n",gradosC,gradosF);
        System.out.println("presione Enter para contimuar");
        scan.nextLine();
    }
    
    public static void ejercicio5() {
        System.out.println("Ingrese el numero 1");
        Integer numero1=scan.nextInt();
        System.out.println("Ingrese el numero 2");
        Integer numero2=scan.nextInt();
        Integer suma = (numero1+numero2);
        Integer resta = (numero1-numero2);
        if (numero2==0) {
            String division="indeterminada"
        }else{

            Float division = Float.valueOf(numero1/numero2);
        }
        Integer muliplicacion = (numero1*numero2);
        System.out.printf("La suma de %d y %d es igual a  %d \n",numero1,numero2,suma);
        System.out.printf("La resta de %d y %d es igual a  %d \n",numero1,numero2,resta);
        System.out.printf("La division de %d y %d es igual a  %.2f \n",numero1,numero2,division);
        System.out.printf("La multiplicacion de %d y %d es igual a  %d \n",numero1,numero2,muliplicacion);
        scan.nextLine();
        System.out.println("presione Enter para contimuar");
        scan.nextLine();
    }
}

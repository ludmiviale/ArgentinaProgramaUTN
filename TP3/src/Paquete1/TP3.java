package Paquete1;

import java.util.Arrays;

public class TP3 {

    public static void main(String[] args) {

        // a)

        String palabra = "ArgentinaPrograma";
        int contador = 0, posicion = 0;
        char caracter = 'a';
        String palabra_min = palabra.toLowerCase();

        posicion = palabra_min.indexOf(caracter);
        if (posicion != -1) {
            while (posicion != -1) {
                contador++;
                posicion = palabra_min.indexOf(caracter, posicion + 1);
            }

            System.out.println("La cantidad de coincidencias es: " + contador);
            System.out.println("El caracter \"" + caracter + "\" aparece " + contador + " veces");
        } else {
            System.out.println("No hay coincidencias");
        }

        // b)

        int numeros[] = new int[3];
        numeros[0] = 11;
        numeros[1] = 8;
        numeros[2] = 17;

        String orden = "descendente";

        if (orden == "ascendente") {
            System.out.println("Los números ordenados de forma ascendente son: ");
            Arrays.sort(numeros);
            for (int i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i]);
            }
        } else if (orden == "descendente") {
            System.out.println("Los números ordenados de forma descendente son: ");
            Arrays.sort(numeros);
            for (int i = numeros.length - 1; i >= 0; i--) {
                System.out.println(numeros[i]);
            }
        }

        // c)

        int vectorNum[] = new int[5];
        vectorNum[0] = 1;
        vectorNum[1] = 6;
        vectorNum[2] = 13;
        vectorNum[3] = 21;
        vectorNum[4] = 34;

        int numX = 15;
        int suma = 0;

        for (int i = 0; i < vectorNum.length; i++) {
            if (vectorNum[i] > numX) {
                suma += vectorNum[i];
            }
        }
        System.out.println("La suma de todos los valores mayores a X es: " + suma);
    }
}

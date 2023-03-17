package Paquete1;

import java.util.Scanner;

public class OrdenarScn {

    public void ordenarNunerosScanner() {

        Scanner scannerNum = new Scanner(System.in);
        int a, b, c;

        System.out.println("Ingrese el primer número");
        a = scannerNum.nextInt();
        System.out.println("Ingrese el segundo número");
        b = scannerNum.nextInt();
        System.out.println("Ingrese el tercer número");
        c = scannerNum.nextInt();

        Ordenar llamada1 = new Ordenar();
        llamada1.ordenarNumeros(a, b, c, 'd');

        scannerNum.close();
    }
}

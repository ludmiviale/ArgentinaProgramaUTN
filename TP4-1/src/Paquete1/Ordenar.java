package Paquete1;

public class Ordenar {

    public void ordenarNumeros(int a, int b, int c, char opcion) {

        if (opcion == 'd') {
            if (a > b && b > c) {
                System.out.println("Los valores ordenados de forma descendente son: " + a + " " + b + " " + c);
            } else {
                if (a > c && c > b) {
                    System.out.println("Los valores ordenados de forma descendente son: " + a + " " + c + " " + b);
                } else {
                    if (b > a && a > c) {
                        System.out.println("Los valores ordenados de forma descendente son: " + b + " " + a + " " + c);
                    } else {
                        if (b > c && c > a) {
                            System.out.println(
                                    "Los valores ordenados de forma descendente son: " + b + " " + c + " " + a);
                        } else {
                            if (c > a && a > b) {
                                System.out
                                        .println(
                                                "Los valores ordenados de forma descendente son: " + c + " " + a + " "
                                                        + b);
                            } else {
                                if (c > b && b > a) {
                                    System.out.println(
                                            "Los valores ordenados de forma descendente son: " + c + " " + b + " " + a);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
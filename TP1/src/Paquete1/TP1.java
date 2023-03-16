package Paquete1;

public class TP1 {
    public static void main(String[] args) {

        // 1- a)

        int a1 = 9, b1 = 15;

        System.out.println("Los números entre la variable a y b son:");

        while (a1 <= b1) {
            System.out.println(a1);
            a1 = a1 + 1;
        }

        // b)

        int a2 = 9, b2 = 15;

        System.out.println("Los números pares entre las variables a y b son:");

        while (a2 <= b2) {
            if (a2 % 2 == 0) {
                System.out.println(a2);
            }
            a2++;
        }

        // c)

        int a3 = 9, b3 = 15;
        boolean mostrarPares = false;

        System.out.println("Los números impares entre las variables a y b son:");

        while (a3 <= b3) {
            if (mostrarPares == true) {
                if (a3 % 2 == 0) {
                    System.out.println(a3);
                }
            } else {
                if (a3 % 2 != 0) {
                    System.out.println(a3);
                }
            }
            a3++;
        }

        // d)

        int a4 = 9, b4 = 15;

        System.out.println("Los números pares entre la variable b y a son:");
        for (int i = b4; i >= a4; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // 2-

        int ingresosMensuales = 490000;
        int vehiculos = 4;
        int antVehiculo = 2;
        int inmuebles = 3;
        boolean bienDeLujo = true;

        if ((ingresosMensuales >= 489083) && (vehiculos >= 3) && (antVehiculo < 5) && (inmuebles >= 3)
                && (bienDeLujo == true)) {
            System.out.println("Pertenece al segmento de ingresos altos");
        } else {
            System.out.println("No pertenece al segmento de ingresos altos");
        }
    }
}
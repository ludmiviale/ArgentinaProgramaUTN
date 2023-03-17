package Paquete1;

import java.util.Scanner;
import java.io.File;

public class Archivo {

    public void lecturatxt() {
        Scanner archivotxt = null;

        try {
            archivotxt = new Scanner(new File("/Users/ludmiviale/Documents/UTN/ArchivoNumeros.txt"));
        } catch (Exception e) {
            System.out.println("Archivo no encontrado");
        }

        int count = 0;
        char opcion = 's';
        if (opcion == 's') {
            while (archivotxt.hasNext()) {
                count = count + archivotxt.nextInt();
            }
            System.out.println("La suma total es: " + count);
        } else if (opcion == 'm') {
            count = 1;
            while (archivotxt.hasNextInt()) {
                count = count * archivotxt.nextInt();
            }
            System.out.println("La multiplicación total es: " + count);
        }
    }
}
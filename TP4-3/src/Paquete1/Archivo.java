package Paquete1;

import java.util.List;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Archivo {

    public void lecturatxt() {

        System.out.println("Los diez nombres son: ");

        Path ruta = Paths.get("/Users/ludmiviale/Documents/UTN/ArchivoNombres.txt");

        try {
            List<String> ContenidoArchivo = Files.readAllLines(ruta, StandardCharsets.UTF_8);
            ContenidoArchivo.forEach(line -> System.out.println(line));
        } catch (Exception e) {
            System.out.println("Archivo no encontrado");
        }
    }
}
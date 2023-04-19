package com.trabajofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrito_de_compras",
                    "root", "");

            Statement statement = connection.createStatement();

            String query = "SELECT * FROM productos";
            ResultSet resultset = statement.executeQuery(query);

            System.out.println("ID PRECIO NOMBRE PRODUCTO:");
            while (resultset.next()) {
                System.out.println(resultset.getInt(1) + "  " + resultset.getDouble(2) + "  " + resultset.getString(3));
            }

            query = ("SELECT * FROM clientes");
            resultset = statement.executeQuery(query);

            System.out.println("CLIENTE\tCUIL:");
            while (resultset.next()) {
                System.out.println(resultset.getString(1) + " " + resultset.getString(2));
            }

        } catch (Exception e) {
            System.out.println("Error en la conexión con la base de datos");
            System.out.println(e.fillInStackTrace());
        }
    }
}

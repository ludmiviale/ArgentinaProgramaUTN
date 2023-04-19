package com.trabajofinal;

public class Producto {
    int id;
    double precio;
    String nombre;

    public Producto(int id, double precio, String nombre) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void getProducto() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + id);
        System.out.println("Precio: " + precio);
    }

}

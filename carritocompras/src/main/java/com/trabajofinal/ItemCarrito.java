package com.trabajofinal;

public class ItemCarrito {

    private Carrito carrito;
    private Producto prod;
    private int cantidad;
    private double subtotal;

    public ItemCarrito(Carrito num, Producto p, int cantidad) {
        this.carrito = num;
        this.prod = p;
        this.cantidad = cantidad;
        subtotal = prod.getPrecio() * cantidad;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public Producto getProd() {
        return prod;
    }

    public void setProd(Producto prod) {
        this.prod = prod;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void mostrarItem() {
        System.out.println(
                "Producto: " + prod.getNombre() + " - Cantidad: " + cantidad + " - Precio: " + prod.getPrecio());
        System.out.println("Subtotal: " + subtotal);
    }
}

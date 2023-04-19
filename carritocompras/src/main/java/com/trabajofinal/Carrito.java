package com.trabajofinal;

public class Carrito {

    private int num;
    private Cliente cl;
    private double montoTotal;

    public Carrito(int num, Cliente cl) {
        this.num = num;
        this.cl = cl;
        montoTotal = 0.0;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Cliente getCl() {
        return cl;
    }

    public void setCl(Cliente cl) {
        this.cl = cl;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(ItemCarrito subtotal) {
        montoTotal = montoTotal + subtotal.getSubtotal();
    }
}
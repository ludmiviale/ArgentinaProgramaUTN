package com.trabajofinal;

public class Cliente {

    String nombres;
    String cuil;
    String numeroTelefono;
    String email;

    public Cliente(String nombres, String cuil) {
        this.nombres = nombres;
        this.cuil = cuil;
    }

    public Cliente(String nombres, String cuil, String numeroTelefono, String email) {
        this.nombres = nombres;
        this.cuil = cuil;
        this.numeroTelefono = numeroTelefono;
        this.email = email;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getcuil() {
        return cuil;
    }

    public void setcuil(String cuil) {
        this.cuil = cuil;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getCliente() {
        System.out.println("Nombre y apellido: " + nombres);
        System.out.println("cuil: " + cuil);
        System.out.println("Número de teléfono: " + numeroTelefono);
        System.out.println("Email: " + email);
    }
}
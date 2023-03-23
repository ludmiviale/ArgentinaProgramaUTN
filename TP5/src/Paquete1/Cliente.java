package Paquete1;

public class Cliente {
    String nombres;
    int dni;
    String numeroTelefono;
    String email;

    public Cliente(String nombres, int dni) {
        this.nombres = nombres;
        this.dni = dni;
    }

    public Cliente(String nombres, int dni, String numeroTelefono, String email) {
        this.nombres = nombres;
        this.dni = dni;
        this.numeroTelefono = numeroTelefono;
        this.email = email;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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
        System.out.println("DNI: " + dni);
        System.out.println("Número de teléfono: " + numeroTelefono);
        System.out.println("Email: " + email);
    }

}

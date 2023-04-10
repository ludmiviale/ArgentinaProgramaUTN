package Paquete1;

/**
 * <h1>Calculadora</h1>
 * <p>
 * Esta calculadora realiza operaciones aritméticas básicas entre números
 * </p>
 * <b>Note:</b> Lea atentamente la documentación de esta clase para poder
 * utilizar los
 * recursos ofrecidos por el autor
 * 
 * @author Ludmila Grisel Viale
 * @version 1.0
 * @since 30/03/2023
 */

public class Calculadora {

    /**
     * Este método es utilizado para sumar dos números
     * 
     * @param unNumero   es el primer parámetro del método
     * 
     * @param otroNumero es el segundo parámetro del método
     * 
     * @return el resultado de este método es la suma de los dos números
     */

    public static double Sumar(double unNumero, double otroNumero) {
        double resultado;
        resultado = unNumero + otroNumero;
        return resultado;
    }

    /**
     * Este método es utilizado para restar dos números
     * 
     * @param unNumero   es el primer parámetro del método
     * 
     * @param otroNumero es el segundo parámetro del método
     * 
     * @return el resultado de este método es la resta de los dos números
     */

    public static double Restar(double unNumero, double otroNumero) {
        double resultado;
        resultado = unNumero - otroNumero;
        return resultado;
    }

    /**
     * Este método es utilizado para multiplicar dos números
     * 
     * @param unNumero   es el primer parámetro del método
     * 
     * @param otroNumero es el segundo parámetro del método
     * 
     * @return el resultado de este método es la multiplicación de los dos números
     */

    public static double Multiplicar(double unNumero, double otroNumero) {
        double resultado;
        resultado = unNumero * otroNumero;
        return resultado;
    }

    /**
     * Este método es utilizado para dividir dos números
     * 
     * @param unNumero   es el primer parámetro del método
     * 
     * @param otroNumero es el segundo parámetro del método
     * 
     * @return el resultado de este método es la división de los dos números
     */

    public static double Dividir(double unNumero, double otroNumero) {
        double resultado;
        resultado = unNumero / otroNumero;
        return resultado;
    }
}

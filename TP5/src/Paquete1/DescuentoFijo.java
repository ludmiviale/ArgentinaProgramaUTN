package Paquete1;

public class DescuentoFijo extends Descuento {

    public double montoFinal(double montoInicial) {
        return montoInicial - this.getMontoDesc();
    }
}
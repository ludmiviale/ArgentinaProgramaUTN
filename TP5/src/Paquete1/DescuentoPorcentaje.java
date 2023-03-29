package Paquete1;

public class DescuentoPorcentaje extends Descuento {

    public double montoFinal(double montoInicial) {
        return montoInicial - (this.getMontoDesc() / 100 * montoInicial);
    }
}
package Paquete1;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje {
    private double tope;

    public DescuentoPorcentajeConTope(double tope) {
        this.tope = tope;
    }

    public double getTope() {
        return tope;
    }

    public void setTope(double tope) {
        this.tope = tope;
    }

    public double montoFinal(double montoInicial) {
        double desc = (this.getMontoDesc() / 100 * montoInicial);
        if (desc > this.tope) {
            return montoInicial - this.tope;
        }
        return montoInicial - desc;
    }
}
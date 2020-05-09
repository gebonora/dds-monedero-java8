package dds.monedero.model;

import java.time.LocalDate;

public class Deposito extends Movimiento {
    public Deposito(LocalDate fecha, double monto, boolean esDeposito) {
        super(fecha, monto, esDeposito);
    }

    @Override
    public boolean isDeposito() {
      return true;
    } //no agrega comportamiento, Misplaced Method

    @Override
    public double calcularValor(Cuenta cuenta) {
        return cuenta.getSaldo() + getMonto();
    }
}

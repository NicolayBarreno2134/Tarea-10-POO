package SisBancarioPagos;

class PagoTarjeta implements Pagable {
    private final double comision = 0.05; // 5% de comisión

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            double total = monto + (monto * comision);
            System.out.println("===Pago con Tarjeta procesado===");
            System.out.println("Monto: $" + monto);
            System.out.println("Comision: $" + (monto * comision));
            System.out.println("Total: $" + total);
        } else {
            System.out.println("Monto inválido. El pago con tarjeta no puede ser procesado.");
        }
    }
}
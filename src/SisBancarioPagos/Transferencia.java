package SisBancarioPagos;

class Transferencia implements Pagable {
    private final double comision = 0.02;

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            double total = monto + (monto * comision);
            System.out.println("===Pago por Transferencia===");
            System.out.println("Monto: $" + monto);
            System.out.println("Comision: $" + (monto * comision));
            System.out.println("Total: $" + total);
        } else {
            System.out.println("Monto inválido. La transferencia no puede ser procesada.");
        }
    }
}
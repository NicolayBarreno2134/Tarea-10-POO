package SisBancarioPagos;
class PagoEfectivo implements Pagable {
    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("===Pago en EFECTIVO procesado===");
            System.out.println("Monto: " + monto);
        } else {
            System.out.println("Monto inválido. El pago en efectivo no puede ser procesado.");
        }
    }
}

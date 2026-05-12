package SisBancarioPagos;

public class Main {
    static void main() {
        Pagable pago1 = new PagoEfectivo();
        Pagable pago2 = new PagoTarjeta();
        Pagable pago3 = new Transferencia();

        pago1.procesarPago(100);
        pago2.procesarPago(200);
        pago3.procesarPago(300);

        pago1.procesarPago(-50);
    }
}

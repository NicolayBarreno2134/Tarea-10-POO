package SisAcadeDocumetos;

public class Certificado implements Imprimible {
    int dia;
    Certificado(int dia) {
        this.dia = dia;
    }
    @Override
    public void imprimir() {
        System.out.println("===Certificado===");
        System.out.println("Dia: " + this.dia);
    }
}

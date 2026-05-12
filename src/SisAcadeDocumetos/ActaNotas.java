package SisAcadeDocumetos;

public class ActaNotas implements Imprimible {
    double nota1;
    ActaNotas(double nota1) {
        this.nota1 = nota1;
    }
    @Override
    public void imprimir() {
        System.out.println("===Acta Notas===");
        System.out.println("Nota 1: " + this.nota1);
    }
}

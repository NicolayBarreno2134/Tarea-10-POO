package SisAcadeDocumetos;

public class Main {
    static void main() {
        ActaNotas actaNotas=new ActaNotas(17.50);
        Certificado certificado=new Certificado(30);
        HorarioAcademico horarioAcademico=new HorarioAcademico(30);
        actaNotas.imprimir();
        certificado.imprimir();
        horarioAcademico.imprimir();

    }
}

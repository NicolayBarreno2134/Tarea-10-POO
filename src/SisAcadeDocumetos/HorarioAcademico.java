package SisAcadeDocumetos;

public class HorarioAcademico implements Imprimible{
    int horasMaterias;

    HorarioAcademico(int horasMaterias){
        this.horasMaterias = horasMaterias;
    }
    @Override
    public void imprimir() {
        System.out.println("===Horario Academico===");
        System.out.println("Horas materias: "+horasMaterias);
    }
}

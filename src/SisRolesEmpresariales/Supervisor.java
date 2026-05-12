package SisRolesEmpresariales;

public class Supervisor implements Autenticable, Reportable {
    private final String usuarioValido = "supervisor";
    private final String claveValida = "sup2026";

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        if(usuarioValido==usuario && claveValida==clave){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public void generarReporte() {
        System.out.println("Supervisor generando reporte de operaciones...");
    }
}

package SisRolesEmpresariales;

public class Administrador implements Reportable ,Autenticable,Gestionable{
    private final String usuarioValido = "admin";
    private final String claveValida = "admin123";
    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        if(usuarioValido.equals(usuario)&&claveValida.equals(clave)){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public void generarReporte() {
        System.out.println("Administrador generando reporte financiero...");
    }
    @Override
    public void gestionarDatos() {
        System.out.println("Administrador gestionando datos de empleados...");
    }
}

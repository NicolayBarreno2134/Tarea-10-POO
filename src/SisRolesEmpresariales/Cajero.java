package SisRolesEmpresariales;

public class Cajero implements Autenticable, Gestionable{
    private final String usuarioValido = "cajero";
    private final String claveValida = "1234";

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        if(usuarioValido.equals(usuario)&&claveValida.equals(clave)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void gestionarDatos() {
        System.out.println("Cajero gestionando transacciones de clientes...");
    }
}

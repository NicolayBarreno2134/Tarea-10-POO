package SisRolesEmpresariales;

public class Cajero implements Autenticable, Gestionable{
    private final String usuarioValido = "cajero";
    private final String claveValida = "1234";

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        return usuario.equals(usuarioValido) && clave.equals(claveValida);
    }

    @Override
    public void gestionarDatos() {
        System.out.println("Cajero gestionando transacciones de clientes...");
    }
}

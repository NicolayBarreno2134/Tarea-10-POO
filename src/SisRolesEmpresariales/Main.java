package SisRolesEmpresariales;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione rol: 1) Cajero  2) Administrador  3) Supervisor");
        int opcion = sc.nextInt();
        sc.nextLine();

        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Clave: ");
        String clave = sc.nextLine();

        if (opcion == 1) {
            Cajero cajero = new Cajero();
            if (cajero.iniciarSesion(usuario, clave)) {
                System.out.println("Inicio de sesión exitoso como Cajero.");
                cajero.gestionarDatos();
            } else {
                System.out.println("Credenciales inválidas.");
            }
        } else if (opcion == 2) {
            Administrador admin = new Administrador();
            if (admin.iniciarSesion(usuario, clave)) {
                System.out.println("Inicio de sesión exitoso como Administrador.");
                admin.gestionarDatos();
                admin.generarReporte();
            } else {
                System.out.println("Credenciales inválidas.");
            }
        } else if (opcion == 3) {
            Supervisor sup = new Supervisor();
            if (sup.iniciarSesion(usuario, clave)) {
                System.out.println("Inicio de sesión exitoso como Supervisor.");
                sup.generarReporte();
            } else {
                System.out.println("Credenciales inválidas.");
            }
        } else {
            System.out.println("Opción no válida.");
        }

        sc.close();
    }
}

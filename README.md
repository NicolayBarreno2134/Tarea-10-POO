Ejercicio 1 — Sistema Académico de Documentos

Objetivo

Aplicar una interfaz común (Imprimible) para diferentes tipos de documentos académicos, asegurando que todos puedan ser impresos con un método estándar.

Diseño

Interfaz Imprimible: define el método imprimir().

Clases:

Certificado: imprime la fecha del certificado.

ActaNotas: imprime notas registradas.

HorarioAcademico: imprime las horas de materias.

Main: instancia cada documento y llama al método imprimir().

Validaciones

No se requiere validación de datos compleja, pero cada clase recibe parámetros en su constructor y los muestra al imprimir.


Tarea 2 — Sistema bancario de pagos

Objetivo

Aplicar interfaz con validación de montos en un sistema que procesa pagos por efectivo, tarjeta y transferencia.

Diseño

Interfaz Pagable: define el método procesarPago(double monto).

Clases:

PagoEfectivo: valida monto y procesa pago en efectivo.

PagoTarjeta: aplica comisión del 5% y procesa pago con tarjeta.

Transferencia: aplica comisión del 2% y procesa pago por transferencia.

MainPagos: ejecuta pruebas con diferentes montos.

Validaciones

El monto debe ser mayor a cero.

Mensajes personalizados según el medio de pago.


Tarea 3 — Sistema de roles empresariales

Objetivo

Diferenciar responsabilidades mediante varias interfaces y demostrar polimorfismo.

Diseño

Interfaces:

Autenticable: iniciar sesión con usuario y clave.

Reportable: generar reportes.

Gestionable: gestionar datos.

Clases:

Cajero: implementa Autenticable y Gestionable.

Administrador: implementa Autenticable, Reportable y Gestionable.

Supervisor: implementa Autenticable y Reportable.

MainRoles: menú interactivo para seleccionar rol y ejecutar acciones.

Validaciones

Usuario y clave deben coincidir con credenciales definidas.

Mensajes de error en caso de credenciales inválidas.

Polimorfismo

Uso de referencias de tipo interfaz (Autenticable, Reportable, Gestionable) para instanciar diferentes roles.

Cada clase ejecuta su propia implementación de los métodos abstractos.



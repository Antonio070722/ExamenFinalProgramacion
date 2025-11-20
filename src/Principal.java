import Clases.Banco;
import Clases.Cliente;

import java.util.Random;
import java.util.Scanner;

public class Principal {


    static void main(String[] args) {

        mostrarMenu();

    }

    private static void mostrarMenu() {
        Banco banco = new Banco(0);
        banco.setTelefono(989989989);
        banco.setDireccion("Avd Carlos III, nº 2");

        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        int idCliente=0;

        do {
            System.out.println("Bienvenido al menú del Banco " + banco.getSucursal());
            System.out.println("\t* 0. Salir");
            System.out.println("\t* 1. Crear cliente");
            System.out.println("\t* 2. Ver cliente");
            System.out.println("\t* 3. Ver saldo cliente");
            System.out.println("\t* 4. Ver todos los clientes");

            opcion = sc.nextInt();
            Cliente cliente = null;


            switch (opcion) {
                case 1:
                    System.out.println("Dame el nombre para el cliente: ");
                    String nombreCliente = sc.nextLine();
                    System.out.println("Dame el número de cuenta para el cliente: ");
                    int numeroCuenta = sc.nextInt();
                    banco.crearCliente(nombreCliente, numeroCuenta);
                    break;
                case 2:
                    System.out.println("Dame el ID cliente para ver: ");
                    idCliente = sc.nextInt();
                    banco.verCliente(idCliente);
                    break;
                case 3:
                    System.out.println("Dame el ID cliente para ver: ");
                    idCliente = sc.nextInt();
                    banco.verSaldoCliente(idCliente);
                    break;
                case 4:
                    banco.verTodosCliente(idCliente);
                    break;
                case 5:
                    System.out.println("Clientes totales: "+Cliente.numeroTotalClientes);
                    break;
                case 0:
                    System.out.println("Salida del sistema... BYE");
                    break;
                default:
                    System.out.println("Opción no valida. Introduce otra opción válida");
            }
        } while (opcion != 0);
    }
}

package programas;
import java.util.Scanner;
public class EjercisioSET02 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        // Solicitar los datos iniciales de la cuenta bancaria
        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        String titular = lectura.nextLine();
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = lectura.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        double saldo = lectura.nextDouble();
        lectura.nextLine(); // Limpiar el buffer de entrada
        System.out.print("Ingrese el tipo de cuenta (Ahorros/Corriente): ");
        String tipoCuenta = lectura.nextLine();

        // Crear un objeto CuentaBancaria con los datos ingresados
        CuentaBancaria cuenta = new CuentaBancaria(titular, numeroCuenta, saldo, tipoCuenta);
        // Mostrar los detalles actuales de la cuenta bancaria
        System.out.println("\nDetalles actuales de la cuenta:");
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());
        System.out.println("Tipo de cuenta: " + cuenta.getTipoCuenta());

        // Modificar los detalles de la cuenta usando métodos set
        lectura.nextLine(); // Limpiar el buffer de entrada
        System.out.print("\nIngrese el nuevo nombre del titular: ");
        String nuevoTitular = lectura.nextLine();
        cuenta.setTitular(nuevoTitular);

        System.out.print("Ingrese el nuevo número de cuenta: ");
        String nuevoNumeroCuenta = lectura.nextLine();
        cuenta.setNumeroCuenta(nuevoNumeroCuenta);

        System.out.print("Ingrese el nuevo saldo de la cuenta: ");
        double nuevoSaldo = lectura.nextDouble();
        cuenta.setSaldo(nuevoSaldo);

        lectura.nextLine(); // Limpiar el buffer de entrada
        System.out.print("Ingrese el nuevo tipo de cuenta: ");
        String nuevoTipoCuenta = lectura.nextLine();
        cuenta.setTipoCuenta(nuevoTipoCuenta);

        // Mostrar los detalles actualizados de la cuenta bancaria
        System.out.println("\nDetalles actualizados de la cuenta:");
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo actual: $" + cuenta.getSaldo());
        System.out.println("Tipo de cuenta: " + cuenta.getTipoCuenta());

        lectura.close();
    }
}

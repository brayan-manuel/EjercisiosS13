package programas;
import java.util.Scanner;

public class EjercisioGET01{
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Solicitar datos del producto al usuario
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = lectura.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = lectura.nextDouble();
        lectura.nextLine(); // Limpiar el buffer de entrada

        // Solicitar detalles adicionales del producto
        System.out.print("Ingrese la descripción del producto: ");
        String descripcion = lectura.nextLine();
        System.out.print("Ingrese la cantidad en stock: ");
        int cantidadStock = lectura.nextInt();

        // Crear un objeto Producto con los datos ingresados
        Producto producto = new Producto(nombre, precio, descripcion, cantidadStock);

        // Mostrar los detalles del producto usando métodos get
        System.out.println("\nDetalles del producto:");
        System.out.println("Nombre del producto: " + producto.getNombre());
        System.out.println("Precio del producto: $" + producto.getPrecio());
        System.out.println("Descripción del producto: " + producto.getDescripcion());
        System.out.println("Cantidad en stock: " + producto.getCantidadStock());

        lectura.close();
    }
}

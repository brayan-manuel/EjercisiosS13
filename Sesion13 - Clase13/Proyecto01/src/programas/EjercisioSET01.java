package programas;
import java.util.Scanner;

public class EjercisioSET01 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Solicitar los datos iniciales del producto
        System.out.print("Ingrese el nombre inicial del producto: ");
        String nombre = lectura.nextLine();
        System.out.print("Ingrese el precio inicial del producto: ");
        double precio = lectura.nextDouble();

        // Crear un objeto ActualizaProducto con los datos ingresados
        ActualizaProducto producto = new ActualizaProducto(nombre, precio);

        // Mostrar los detalles actuales del producto
        System.out.println("\nDetalles actuales del producto:");
        System.out.println("Nombre del producto: " + producto.getNombre());
        System.out.println("Precio del producto: S/ " + producto.getPrecio());

        // Modificar el nombre y el precio del producto usando métodos set
        lectura.nextLine(); // Limpiar el buffer de entrada
        System.out.print("\nIngrese el nuevo nombre del producto: ");
        String nuevoNombre = lectura.nextLine();
        producto.setNombre(nuevoNombre);

        System.out.print("Ingrese el nuevo precio del producto: ");
        double nuevoPrecio = lectura.nextDouble();
        producto.setPrecio(nuevoPrecio);

        // Mostrar los detalles actualizados del producto
        System.out.println("\nDetalles actualizados del producto:");
        System.out.println("Nombre del producto: " + producto.getNombre());
        System.out.println("Precio del producto: $" + producto.getPrecio());

        lectura.close();
    }
}

package programas;

public class Producto {
    private String nombre;
    private double precio;
    private String descripcion;
    private int cantidadStock;

    // Constructor
    public Producto(String nombre, double precio, String descripcion, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidadStock = cantidadStock;
    }

    // Método get para obtener el nombre del producto
    public String getNombre() {
        return nombre;
    }

    // Método get para obtener el precio del producto
    public double getPrecio() {
        return precio;
    }

    // Método get para obtener la descripción del producto
    public String getDescripcion() {
        return descripcion;
    }

    // Método get para obtener la cantidad en stock
    public int getCantidadStock() {
        return cantidadStock;
    }
}

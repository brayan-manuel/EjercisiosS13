package programas;

public class ActualizaProducto {
    private String nombre;
    private double precio;

    // Constructor
    public ActualizaProducto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método get para obtener el nombre del producto
    public String getNombre() {
        return nombre;
    }

    // Método set para establecer el nombre del producto
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método get para obtener el precio del producto
    public double getPrecio() {
        return precio;
    }

    // Método set para establecer el precio del producto
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

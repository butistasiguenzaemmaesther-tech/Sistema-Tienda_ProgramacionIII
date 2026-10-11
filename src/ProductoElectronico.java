public class ProductoElectronico extends Producto implements Vendible {
    private String marca;

    public ProductoElectronico(String nombreProducto, int codigo, double precio,
                               String categoria, String cantidadProducto, String marca) {
        super(nombreProducto, codigo, precio, categoria, cantidadProducto);
        this.marca = marca;
    }

    // SOBREESCRITURA 1: Lo usamos por la clase abstracta
    @Override
    public void mostrarTipo() {
        System.out.println("Tipo: Prodcuto Electrónico | Marca: " + marca);
    }

    // SOBREESCRITURA 2: Validamos la funcionalidad de la herencia padre
    @Override
    public void mostrarProducto() {
        super.mostrarProducto();
        System.out.println("Marca registrada: " + marca);
    }

    @Override
    public double calcularTotalVenta() {
        return getPrecio();
    }

    @Override
    public boolean verificarDisponibilidad() {
        return true;
    }
}

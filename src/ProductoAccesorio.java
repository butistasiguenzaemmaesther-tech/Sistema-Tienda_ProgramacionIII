public class ProductoAccesorio extends Producto implements Vendible{
    private String material;

    public ProductoAccesorio(String nombreProducto, int codigo, double precio,
                             String categoria, String cantidadProducto, String material) {

        super(nombreProducto, codigo, precio, categoria, cantidadProducto);
        this.material = material;
    }
    @Override
    public void mostrarTipo() {
        System.out.println("Material del producto accesorio: " + material);
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

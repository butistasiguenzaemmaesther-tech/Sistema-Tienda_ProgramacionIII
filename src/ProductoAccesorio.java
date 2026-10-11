public class ProductoAccesorio extends Producto implements Vendible {
    private String material;

    public ProductoAccesorio(String nombreProducto, int codigo, double precio,
                             String categoria, String cantidadProducto, String material) {
        super(nombreProducto, codigo, precio, categoria, cantidadProducto);
        this.material = material;
    }

    // SOBREESCRITURA 1: Obligatoria por la clase abstracta
    @Override
    public void mostrarTipo() {
        System.out.println("Tipo: Accesorio | Material: " + material);
    }

    // SOBREESCRITURA 2: Extendemos la funcionalidad del padre
    @Override
    public void mostrarProducto() {
        super.mostrarProducto();
        System.out.println("Material de producto: " + material);
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

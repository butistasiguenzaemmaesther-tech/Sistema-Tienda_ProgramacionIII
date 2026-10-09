//subclase que hereda de la clase abstracta producto
public class ProductoElectronico extends Producto {
    private String marca;

    //constructor de la clase
    public ProductoElectronico (String nombreProducto, int codigo, double precio,
                                String categoria, String cantidadProducto, String marca) {

        //llamamos al constructor de la clase padre
        super(nombreProducto, codigo, precio, categoria, cantidadProducto);
        this.marca = marca;

    }
        @Override
    public void mostrarTipo() {
        System.out.println("Marca del producto electronico: " + marca);

    }
}

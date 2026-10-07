public abstract class Producto {
    private String nombreProducto;
    private int codigo;
    private double precio;
    private String categoria;
    private String cantidadProducto;

    public Producto(String nombreProducto, int codigo, double precio, String categoria, String cantidadProducto) {
        this.nombreProducto = nombreProducto;
        this.codigo = codigo;
        this.precio = precio;
        this.categoria = categoria;
        this.cantidadProducto = cantidadProducto;
    }

    public String getNombreProducto() { return nombreProducto;}
    public void setNombreProducto(String nombreProducto) {this.nombreProducto = nombreProducto;}

    public int getCodigo() {return codigo; }
    public void setCodigo(int codigo) {this.codigo = codigo; }

    public double getPrecio() {return precio; }
    public void setPrecio(double precio) {this.precio = precio; }

    public String getCategoria() {return categoria; }
    public void setCategoria(String categoria) {this.categoria = categoria;}

    public String getCantidadProducto() {return cantidadProducto;}
    public void setCantidadProducto(String cantidadProducto) {this.cantidadProducto = cantidadProducto;}

    //imprimir
    public void mostrarProducto() {
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Codigo del producto: " + codigo);
        System.out.println("Precio del producto: " + precio);
        System.out.println("Categoria del producto: " + categoria);
        System.out.println("Cantidad de productos: " + cantidadProducto);
    }

    // Método abstracto
    public abstract void mostrarTipo();
}

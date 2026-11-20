import javax.swing.SwingUtilities;

public class Main {
    // "Metodo principal que ejecuta la demo y abre la interfaz grafica"
    public static void main(String[] args) throws ProductoInvalidoException {

        // "Crea los objetos base de tienda y cliente"
        Tienda tienda = new Tienda("Electro Villanueva", "San Salvador", "2222-4444");
        Cliente cliente = new Cliente("Kevin Villanueva", 22, "6134-0000", "Kevin.villanueva@uped.edu.sv", "San Salvador");

        // "Crea productos electronicos y accesorios usando el tipo abstracto Producto"
        Producto p1 = new ProductoElectronico("Laptop Lenovo", 101, 900.00, "Tecnologia", "5", "Lenovo");
        Producto p2 = new ProductoAccesorio("cartera", 102, 23.50, "Accesorios", "3", "Cuero");

        System.out.println(" DEMO DE POLIMORFISMO Y SOBRECARGA ");

        // "1. Demostracion de polimorfismo y binding dinamico"
        System.out.println("\n 1. Recorrido Polimórfico en Arreglo Producto[] ");
        Producto[] listaProductos = { p1, p2 };

        for (Producto p : listaProductos) {
            // "Llama a los metodos sobrescritos segun el tipo real del objeto"
            p.mostrarProducto();
            p.mostrarTipo();
        }

        // "2. Demostracion de sobrecarga de metodos en Cliente"
        System.out.println("\n 2. Demostración de Sobrecarga en Cliente ");
        double totalSinDescuento = p1.getPrecio() + p2.getPrecio();
        System.out.println("Total original de la compra: $" + totalSinDescuento);

        // "Sobrecarga con un parametro"
        double totalDescuento1 = cliente.aplicarDescuento(totalSinDescuento);

        // "Sobrecarga con dos parametros"
        double totalDescuento2 = cliente.aplicarDescuento(totalSinDescuento, 10.0);

        // "3. Registro de carrito, pedido y factura en consola"
        String productosCompra = p1.getNombreProducto() + ", " + p2.getNombreProducto();

        Carrito carrito = new Carrito(cliente.getNombreCliente(), 4, productosCompra, "10/10/2026", totalDescuento2);
        Pedido pedido = new Pedido(30, cliente.getNombreCliente(), productosCompra, totalDescuento2);
        Factura factura = new Factura(2666, cliente.getNombreCliente(), productosCompra, totalDescuento2);

        System.out.println("\n RESUMEN DE FACTURACIÓN ");
        factura.mostrarFactura();

        // "4. Abre la ventana principal de la tienda"
        SwingUtilities.invokeLater(() -> {
            VentanaTienda ventana = new VentanaTienda();
            ventana.setVisible(true);
        });
    }
}
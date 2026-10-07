public class Main {
    public static void main(String[] args) {

        Tienda tienda = new Tienda(
                "Electro Villanueva",
                "San Salvador",
                "2222-4444"
        );

        Cliente cliente = new Cliente(
                "Kevin Villanueva",
                22,
                "6134-0000",
                "Kevin.villanueva@uped.edu.sv",
                "San Salvador"
        );

        Producto producto1 = new Producto(
                "Computadora Lenovo",
                3108,
                1000.00,
                "Aparato electronico",
                "1"
        );

        Producto producto2 = new Producto(
                "Mouse",
                8,
                25.00,
                "Accesorios",
                "2"
        );

        Producto producto3 = new Producto(
                "Teclado",
                8,
                25.00,
                "Accesorios",
                "2"
        );

        Carrito carrito = new Carrito(
                cliente.getNombreCliente(),
                4,
                "Computadora Lenovo, Mouse",
                "27/08/2026",
                1025.00
        );

        Pedido pedido = new Pedido(
                30,
                cliente.getNombreCliente(),
                "Computadora Lenovo, Mouse, Teclado",
                1070.00
        );

        Factura factura = new Factura(
                2666,
                cliente.getNombreCliente(),
                "Computadora Lenovo, Mouse, Teclado",
                1070.00
        );

        // Imprimir resultados
        System.out.println("=========Tienda=========");
        tienda.mostrarTienda();
        System.out.println();

        System.out.println("=========Cliente=========");
        cliente.mostrarCliente();
        System.out.println();

        System.out.println("=========Productos=========");
        producto1.mostrarProducto();
        System.out.println();

        producto2.mostrarProducto();
        System.out.println();

        producto3.mostrarProducto();
        System.out.println();

        System.out.println("=========Productos en la compra========");
        carrito.MostrarCarrito();
        System.out.println();

        System.out.println("=========Núm de compra=========");
        pedido.mostrarPedido();
        System.out.println();

        System.out.println("=========Factura=========");
        factura.mostrarFactura();
    }
}
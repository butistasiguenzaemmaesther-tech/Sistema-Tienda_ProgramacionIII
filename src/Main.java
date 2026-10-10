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

        ProductoElectronico electronico = new ProductoElectronico(
                "Laptop",
                101,
                900.00,
                "Tecnologia",
                "5",
                "Lenovo"
        );

        ProductoAccesorio accesorio = new ProductoAccesorio(
                "Cartera",
                102,
                23.50,
                "Accesorios",
                "3",
                "Cuero"
        );

        // Productos y total de compra
        String productosCompra = electronico.getNombreProducto()
                + ", " + accesorio.getNombreProducto();

        double totalCompra = electronico.getPrecio()
                + accesorio.getPrecio();

        // Crear carrito
        Carrito carrito = new Carrito(
                cliente.getNombreCliente(),
                4,
                productosCompra,
                "10/10/2026",
                totalCompra
        );

        // Crear pedido con los mismos productos y total
        Pedido pedido = new Pedido(
                30,
                cliente.getNombreCliente(),
                productosCompra,
                totalCompra
        );

        // Crear factura con los mismos productos y total
        Factura factura = new Factura(
                2666,
                cliente.getNombreCliente(),
                productosCompra,
                totalCompra
        );

        // Mostrar tienda
        System.out.println("========= TIENDA =========");
        tienda.mostrarTienda();

        // Mostrar cliente
        System.out.println("\n========= CLIENTE =========");
        cliente.mostrarCliente();

        // Mostrar producto electrónico
        System.out.println("\n========= PRODUCTO ELECTRONICO =========");
        electronico.mostrarProducto();
        electronico.mostrarTipo();

        // Mostrar producto accesorio
        System.out.println("\n========= PRODUCTO ACCESORIO =========");
        accesorio.mostrarProducto();
        accesorio.mostrarTipo();

        // Mostrar carrito
        System.out.println("\n========= CARRITO =========");
        carrito.MostrarCarrito();

        // Mostrar pedido
        System.out.println("\n========= PEDIDO =========");
        pedido.mostrarPedido();

        // Mostrar factura
        System.out.println("\n========= FACTURA =========");
        factura.mostrarFactura();
    }
}

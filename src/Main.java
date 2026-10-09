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

        System.out.println("HERENCIA IMPLEMENTADA");

        System.out.println("=========Producto Electronico=========");
        electronico.mostrarProducto();
        electronico.mostrarTipo();
        System.out.println();

        System.out.println("=========Producto Accesorio=========");
        accesorio.mostrarProducto();
        accesorio.mostrarTipo();
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
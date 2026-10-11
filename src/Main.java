public class Main {
    public static void main(String[] args) {

        Tienda tienda = new Tienda("Electro Villanueva", "San Salvador", "2222-4444");
        Cliente cliente = new Cliente("Kevin Villanueva", 22, "6134-0000", "Kevin.villanueva@uped.edu.sv", "San Salvador");

        // Usamos relaciones en tipo abstracto Producto (Polimorfismo por herencia)
        Producto p1 = new ProductoElectronico("Laptop Lenovo", 101, 900.00, "Tecnologia", "5", "Lenovo");
        Producto p2 = new ProductoAccesorio("Cartera", 102, 23.50, "Accesorios", "3", "Cuero");

        System.out.println("========= DEMO DE POLIMORFISMO Y SOBRECARGA =========");

        // 1. DEMOSTRACIÓN DE POLIMORFISMO Y BINDING DINÁMICO
        System.out.println("\n--- 1. Recorrido Polimórfico en Arreglo Producto[] ---");
        Producto[] listaProductos = { p1, p2 };

        for (Producto p : listaProductos) {
            // Llama a los métodos sobrescritos. Java decide en tiempo de ejecución
            // qué versión ejecutar según el objeto real (Electronico o Accesorio)
            p.mostrarProducto();
            p.mostrarTipo();
        }

        // 2. DEMOSTRACIÓN DE SOBRECARGA DE MÉTODOS (OVERLOADING)
        System.out.println("\n--- 2. Demostración de Sobrecarga en Cliente ---");
        double totalSinDescuento = p1.getPrecio() + p2.getPrecio();
        System.out.println("Total original de la compra: $" + totalSinDescuento);

        // Uso de Sobrecarga 1 (un parámetro)
        double totalDescuento1 = cliente.aplicarDescuento(totalSinDescuento);

        // Uso de Sobrecarga 2 (dos parámetros)
        double totalDescuento2 = cliente.aplicarDescuento(totalSinDescuento, 10.0);

        // -------------------------------------------------------------
        // 3. REGISTRO EN SISTEMA (CARRITO, PEDIDO, FACTURA)
        // -------------------------------------------------------------
        String productosCompra = p1.getNombreProducto() + ", " + p2.getNombreProducto();

        Carrito carrito = new Carrito(cliente.getNombreCliente(), 4, productosCompra, "10/10/2026", totalDescuento2);
        Pedido pedido = new Pedido(30, cliente.getNombreCliente(), productosCompra, totalDescuento2);
        Factura factura = new Factura(2666, cliente.getNombreCliente(), productosCompra, totalDescuento2);

        System.out.println("\n========= RESUMEN DE FACTURACIÓN =========");
        factura.mostrarFactura();
    }
}

public class ProcesadorPedido implements Runnable {

    private Pedido pedido;

    public ProcesadorPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void run() {
        System.out.println("\n===== PROCESAMIENTO DE PEDIDO =====");

        System.out.println("Procesando pedido: " + pedido.getNumeroPedido());
        System.out.println("Cliente: " + pedido.getNombreCliente());

        try {
            Thread.sleep(3000);

            System.out.println("Pedido procesado correctamente.");
            System.out.println("Total: $" + pedido.getPrecioPedido());

        } catch (InterruptedException e) {
            System.out.println("El procesamiento del pedido fue interrumpido.");
            Thread.currentThread().interrupt();
        }
    }
}
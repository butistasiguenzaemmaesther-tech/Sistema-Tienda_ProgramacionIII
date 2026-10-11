public class Cliente {
    private String nombreCliente;
    private int edad;
    private String telefono;
    private String correo;
    private String direccion;

    public Cliente(String nombreCliente, int edad, String telefono, String correo, String direccion) {
        this.nombreCliente = nombreCliente;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNombreCliente() { return nombreCliente; }
    public void setNombreCliente(String nombreCliente) { this.nombreCliente = nombreCliente; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public void mostrarCliente() {
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + telefono);
        System.out.println("Correo: " + correo);
        System.out.println("Direccion: " + direccion);
    }


    // SOBRECARGA 1: Descuento sobre saldo principal

    public double aplicarDescuento(double total) {
        double totalConDescuento = total * 0.95; // 5% de descuento
        System.out.println("Descuento (5%) aplicado a " + nombreCliente + ": $" + totalConDescuento);
        return totalConDescuento;
    }

    // SOBRECARGA 2: Descuento por porcentaje extra

    public double aplicarDescuento(double total, double porcentajeExtra) {
        double descuentoTotal = 5.0 + porcentajeExtra;
        double totalConDescuento = total * (1 - (descuentoTotal / 100));
        System.out.println("Descuento VIP (" + descuentoTotal + "%) aplicado a " + nombreCliente + ": $" + totalConDescuento);
        return totalConDescuento;
    }
}

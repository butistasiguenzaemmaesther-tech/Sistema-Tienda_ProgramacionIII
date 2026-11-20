import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class VentanaTienda extends JFrame {

    // "Objetos base y lista de productos"
    private Tienda tienda = new Tienda("Electro Villanueva", "San Salvador", "2222-4444");
    private Cliente cliente = new Cliente("Kevin Villanueva", 22, "6134-0000", "Kevin.villanueva@uped.edu.sv", "San Salvador");
    private List<Producto> productos = new ArrayList<>();

    // "Componentes de Tienda y Cliente"
    private JTextField txtTienda, txtUbi, txtTelTienda;
    private JTextField txtCli, txtEdad, txtTelCli, txtCorreo, txtDir;
    private JTextArea areaInfo;

    // "Datos de Productos"
    private JComboBox<String> cmbTipo;
    private JTextField txtNomProd, txtCodProd, txtPrecio, txtCat, txtCant, txtExtra;
    private JLabel lblExtra;
    private JTextArea areaProductos;

    // "Datos de Compra y Factura"
    private JCheckBox chkVIP;
    private JTextField txtExtraVIP, txtIdCarrito, txtFecha, txtPedido, txtFactura;
    private JTextArea areaFactura;

    public VentanaTienda() {
        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Tienda y Cliente", panelCliente());
        tabs.addTab("Productos", panelProductos());
        tabs.addTab("Compra y Factura", panelFactura());
        add(tabs);

        refrescarInfo();
        refrescarProductos();
    }

    private void cargarIniciales() {
        // "Agrega productos iniciales"
        try {
            productos.add(new ProductoElectronico("Laptop Lenovo", 101, 900.00, "Tecnologia", "5", "Lenovo"));
            productos.add(new ProductoAccesorio("Cartera", 102, 23.50, "Accesorios", "3", "Cuero"));
        } catch (ProductoInvalidoException | PrecioIncorrectoException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } finally {
            System.out.println("Carga de productos iniciales evaluada.");
        }
    }

    private JPanel panelCliente() {
        // "Mueestra el cuadro para actualizar tienda y cliente"
        JPanel p = new JPanel(new BorderLayout(10, 10));
        p.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));

        JPanel pTienda = new JPanel(new GridLayout(4, 2, 5, 5));
        pTienda.setBorder(BorderFactory.createTitledBorder("Tienda"));
        txtTienda = new JTextField(tienda.getNombreTienda());
        txtUbi = new JTextField(tienda.getDireccion());
        txtTelTienda = new JTextField(tienda.getTelefono());
        JButton btnTienda = new JButton("Guardar Tienda");
        btnTienda.addActionListener(e -> guardarTienda());

        pTienda.add(new JLabel("Nombre:")); pTienda.add(txtTienda);
        pTienda.add(new JLabel("Ubicacion:")); pTienda.add(txtUbi);
        pTienda.add(new JLabel("Telefono:")); pTienda.add(txtTelTienda);
        pTienda.add(new JLabel("")); pTienda.add(btnTienda);

        JPanel pCli = new JPanel(new GridLayout(6, 2, 5, 5));
        pCli.setBorder(BorderFactory.createTitledBorder("Cliente"));
        txtCli = new JTextField(cliente.getNombreCliente());
        txtEdad = new JTextField(String.valueOf(cliente.getEdad()));
        txtTelCli = new JTextField(cliente.getTelefono());
        txtCorreo = new JTextField(cliente.getCorreo());
        txtDir = new JTextField(cliente.getDireccion());
        JButton btnCli = new JButton("Guardar Cliente");
        btnCli.addActionListener(e -> guardarCliente());

        pCli.add(new JLabel("Nombre:")); pCli.add(txtCli);
        pCli.add(new JLabel("Edad:")); pCli.add(txtEdad);
        pCli.add(new JLabel("Telefono:")); pCli.add(txtTelCli);
        pCli.add(new JLabel("Correo:")); pCli.add(txtCorreo);
        pCli.add(new JLabel("Direccion:")); pCli.add(txtDir);
        pCli.add(new JLabel("")); pCli.add(btnCli);

        JPanel forms = new JPanel(new GridLayout(1, 2, 10, 10));
        forms.add(pTienda);
        forms.add(pCli);

        areaInfo = new JTextArea();
        areaInfo.setEditable(false);

        p.add(forms, BorderLayout.NORTH);
        p.add(new JScrollPane(areaInfo), BorderLayout.CENTER);
        return p;
    }

    private JPanel panelProductos() {
        // "Muestra el cuadro para registrar y listar productos"
        JPanel p = new JPanel(new BorderLayout(10, 10));
        p.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));

        JPanel form = new JPanel(new GridLayout(7, 2, 5, 5));
        form.setBorder(BorderFactory.createTitledBorder("Agregar Producto"));
        cmbTipo = new JComboBox<>(new String[]{"Electronico", "Accesorio"});
        txtNomProd = new JTextField();
        txtCodProd = new JTextField();
        txtPrecio = new JTextField();
        txtCat = new JTextField();
        txtCant = new JTextField();
        lblExtra = new JLabel("Marca:");
        txtExtra = new JTextField();

        cmbTipo.addActionListener(e -> lblExtra.setText("Electronico".equals(cmbTipo.getSelectedItem()) ? "Marca:" : "Material:"));

        JButton btnAdd = new JButton("Agregar Producto");
        btnAdd.addActionListener(e -> agregarProducto());

        form.add(new JLabel("Tipo:")); form.add(cmbTipo);
        form.add(new JLabel("Nombre:")); form.add(txtNomProd);
        form.add(new JLabel("Codigo:")); form.add(txtCodProd);
        form.add(new JLabel("Precio $:")); form.add(txtPrecio);
        form.add(new JLabel("Categoria:")); form.add(txtCat);
        form.add(new JLabel("Cantidad:")); form.add(txtCant);
        form.add(lblExtra); form.add(txtExtra);

        JPanel top = new JPanel(new BorderLayout(5, 5));
        top.add(form, BorderLayout.CENTER);
        top.add(btnAdd, BorderLayout.SOUTH);

        areaProductos = new JTextArea();
        areaProductos.setEditable(false);

        p.add(top, BorderLayout.NORTH);
        p.add(new JScrollPane(areaProductos), BorderLayout.CENTER);
        return p;
    }

    private JPanel panelFactura() {
        // "Muestra el cuadro para calcular totales y generar factura"
        JPanel p = new JPanel(new BorderLayout(10, 10));
        p.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));

        JPanel cfg = new JPanel(new GridLayout(5, 2, 5, 5));
        cfg.setBorder(BorderFactory.createTitledBorder("Datos de Compra"));
        txtIdCarrito = new JTextField("4");
        txtFecha = new JTextField("18/11/2026");
        txtPedido = new JTextField("50");
        txtFactura = new JTextField("4532");
        chkVIP = new JCheckBox("Descuento VIP");
        txtExtraVIP = new JTextField("10.0");
        txtExtraVIP.setEnabled(false);
        chkVIP.addActionListener(e -> txtExtraVIP.setEnabled(chkVIP.isSelected()));

        cfg.add(new JLabel("ID Carrito:")); cfg.add(txtIdCarrito);
        cfg.add(new JLabel("Fecha:")); cfg.add(txtFecha);
        cfg.add(new JLabel("Num. Pedido:")); cfg.add(txtPedido);
        cfg.add(new JLabel("Num. Factura:")); cfg.add(txtFactura);
        cfg.add(chkVIP); cfg.add(txtExtraVIP);

        JButton btnGen = new JButton("Generar Factura");
        btnGen.addActionListener(e -> generarFactura());

        JPanel top = new JPanel(new BorderLayout(5, 5));
        top.add(cfg, BorderLayout.CENTER);
        top.add(btnGen, BorderLayout.SOUTH);

        areaFactura = new JTextArea();
        areaFactura.setEditable(false);

        p.add(top, BorderLayout.NORTH);
        p.add(new JScrollPane(areaFactura), BorderLayout.CENTER);
        return p;
    }

    private void guardarTienda() {
        // "Actualiza los datos de la tienda"
        if (txtTienda.getText().trim().isEmpty() || txtUbi.getText().trim().isEmpty() || txtTelTienda.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Rellenar toda la información.");
            return;
        }
        tienda.setNombreTienda(txtTienda.getText().trim());
        tienda.setDireccion(txtUbi.getText().trim());
        tienda.setTelefono(txtTelTienda.getText().trim());
        refrescarInfo();
        JOptionPane.showMessageDialog(this, "Datos actualizados.");
    }

    private void guardarCliente() {
        // "Actualza los datos del cliente"
        try {
            int edad = Integer.parseInt(txtEdad.getText().trim());
            if (txtCli.getText().trim().isEmpty() || txtTelCli.getText().trim().isEmpty()
                    || txtCorreo.getText().trim().isEmpty() || txtDir.getText().trim().isEmpty() || edad <= 0) {
                JOptionPane.showMessageDialog(this, "Revisa los datos y la edad del cliente.");
                return;
            }
            cliente.setNombreCliente(txtCli.getText().trim());
            cliente.setEdad(edad);
            cliente.setTelefono(txtTelCli.getText().trim());
            cliente.setCorreo(txtCorreo.getText().trim());
            cliente.setDireccion(txtDir.getText().trim());
            refrescarInfo();
            JOptionPane.showMessageDialog(this, "Datos del cliente.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Edad debe ser numero entero.");
        } finally {
            System.out.println("Intento de guardado de cliente finalizado.");
        }
    }

    private void agregarProducto() {
        // "Crea producto electronico o accesorio"
        try {
            String tipo = (String) cmbTipo.getSelectedItem();
            int cod = Integer.parseInt(txtCodProd.getText().trim());
            double precio = Double.parseDouble(txtPrecio.getText().trim());
            String nom = txtNomProd.getText().trim();
            String cat = txtCat.getText().trim();
            String cant = txtCant.getText().trim();
            String extra = txtExtra.getText().trim();

            if (cat.isEmpty() || cant.isEmpty() || extra.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Complete categoria, cantidad y marca.");
                return;
            }

            Producto p = "Electronico".equals(tipo)
                    ? new ProductoElectronico(nom, cod, precio, cat, cant, extra)
                    : new ProductoAccesorio(nom, cod, precio, cat, cant, extra);

            productos.add(p);
            refrescarProductos();
            txtNomProd.setText(""); txtCodProd.setText(""); txtPrecio.setText("");
            txtCat.setText(""); txtCant.setText(""); txtExtra.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Codigo entero y precio numerico.");
        } catch (ProductoInvalidoException | PrecioIncorrectoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } finally {
            System.out.println("Intento de registro de producto finalizado.");
        }
    }

    private void generarFactura() {
        // "Genera carrito, pedido y factura con el descuento"
        if (productos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "AGREGAR UN PRODUCTO.");
            return;
        }
        try {
            int idCarrito = Integer.parseInt(txtIdCarrito.getText().trim());
            String fecha = txtFecha.getText().trim();
            int numPed = Integer.parseInt(txtPedido.getText().trim());
            int numFac = Integer.parseInt(txtFactura.getText().trim());
            if (fecha.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingresar fecha.");
                return;
            }

            double total = 0;
            List<String> nombres = new ArrayList<>();
            for (Producto p : productos) {
                total += p.getPrecio();
                nombres.add(p.getNombreProducto());
            }

            String listaNombres = String.join(", ", nombres);
            double finalTotal = chkVIP.isSelected()
                    ? cliente.aplicarDescuento(total, Double.parseDouble(txtExtraVIP.getText().trim()))
                    : cliente.aplicarDescuento(total);

            Carrito c = new Carrito(cliente.getNombreCliente(), idCarrito, listaNombres, fecha, finalTotal);
            Pedido ped = new Pedido(numPed, cliente.getNombreCliente(), listaNombres, finalTotal);
            Factura fac = new Factura(numFac, cliente.getNombreCliente(), listaNombres, finalTotal);

            areaFactura.setText(
                    "Tienda: " + tienda.getNombreTienda() + " Tel: " + tienda.getTelefono() + "\n"
                            + "Subtotal: $" + String.format("%.2f", total) + " | Total: $" + String.format("%.2f", finalTotal) + "\n\n"
                            + "CARRITO #" + c.getIdCarrito() + " (" + c.getFecha() + "): " + c.getProductos() + "\n"
                            + "PEDIDO #" + ped.getNumeroPedido() + " - " + ped.getNombreCliente() + " - $" + String.format("%.2f", ped.getPrecioPedido()) + "\n"
                            + "FACTURA #" + fac.getNumeroFactura() + " - " + fac.getNombreCliente() + " - $" + String.format("%.2f", fac.getPrecioFactura())
            );
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Validar ID de compra sea correctos.");
        } finally {
            System.out.println("Intento de generacion de factura finalizado.");
        }
    }

    private void refrescarInfo() {
        // "Dice el resumen de tienda y cliente"
        areaInfo.setText(
                "TIENDA: " + tienda.getNombreTienda() + " | " + tienda.getDireccion() + " | " + tienda.getTelefono() + "\n"
                        + "CLIENTE: " + cliente.getNombreCliente() + " (" + cliente.getEdad() + " años) | "
                        + cliente.getTelefono() + " | " + cliente.getCorreo() + " | " + cliente.getDireccion()
        );
    }

    private void refrescarProductos() {
        // "Dice los productos agregados al carrito"
        if (productos.isEmpty()) {
            areaProductos.setText("No hay productos seleccionados.");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Producto p : productos) {
            String tipo = (p instanceof ProductoElectronico) ? "Electronico" : "Accesorio";
            sb.append("- ").append(p.getNombreProducto())
                    .append(" Cod: ").append(p.getCodigo())
                    .append("  $").append(String.format("%.2f", p.getPrecio()))
                    .append("  Cat: ").append(p.getCategoria())
                    .append("  Cant: ").append(p.getCantidadProducto())
                    .append(" ").append(tipo).append("\n");
        }
        areaProductos.setText(sb.toString());
    }
}

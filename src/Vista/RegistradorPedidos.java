/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Negocio.Operaciones.VendedorMenudeo;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import Vista.Tablas.ModeloTablaProductosVendidos;
import Negocio.Entidades.ProductosVendidos;
import Negocio.Entidades.Producto;
import Negocio.Operaciones.AdminProductos;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/********************************************************************** 
 
    CLASE: {@link RegistradorPedidos}
    
    AUTOR: Roberto Gil Flores

 **********************************************************************/
public class RegistradorPedidos extends javax.swing.JFrame {
    VendedorMenudeo vendedorMenudeo = new VendedorMenudeo();
    AdminProductos adminProductos = new AdminProductos();
    List<String> nombresProductosDisponibles = 
            adminProductos.getNombresProductosDisponibles();
    List<ProductosVendidos> productosVendidosActuales = new ArrayList<>();
    /**
     * Creates new form registradorPedidos
     */
    public RegistradorPedidos() {
        initComponents();
        rellenarTablaProductosVendidos(productosVendidosActuales);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        labelStatus.setFont(new Font("Serif", Font.PLAIN, 14));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelComprador = new javax.swing.JPanel();
        labelComprador = new javax.swing.JLabel();
        campoComprador = new javax.swing.JTextField();
        labelDireccion = new javax.swing.JLabel();
        campoDireccion = new javax.swing.JTextField();
        labelTelefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        labelCampos = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        comboFecha = new datechooser.beans.DateChooserCombo();
        labelHora = new javax.swing.JLabel();
        campoHora = new javax.swing.JTextField();
        panelProductosVendidos = new javax.swing.JPanel();
        scrollProductosVendidos = new javax.swing.JScrollPane();
        tablaProductosVendidos = new javax.swing.JTable();
        comboProductos = new javax.swing.JComboBox<String>();
        labelProducto = new javax.swing.JLabel();
        labelCantidad = new javax.swing.JLabel();
        campoCantidad = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        campoCostoTotal = new javax.swing.JTextField();
        labelTotal = new javax.swing.JLabel();
        botonRegistrar = new javax.swing.JToggleButton();
        botonCancelar = new javax.swing.JToggleButton();
        labelStatus = new javax.swing.JLabel();
        jLabelSeparador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar un Pedido");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelComprador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelComprador.setText("Comprador *");
        panelComprador.add(labelComprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));
        panelComprador.add(campoComprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 11, 620, -1));

        labelDireccion.setText("Dirección *");
        panelComprador.add(labelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, -1));
        panelComprador.add(campoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 42, 620, -1));

        labelTelefono.setText("Telefono");
        panelComprador.add(labelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, -1, -1));
        panelComprador.add(campoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 73, 620, -1));

        labelCampos.setText("* Campos obligatorios");
        panelComprador.add(labelCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        labelFecha.setText("Fecha *");
        panelComprador.add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, -1, -1));
        panelComprador.add(comboFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        labelHora.setText("Tiempo de entrega *");
        panelComprador.add(labelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));
        panelComprador.add(campoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 330, -1));

        getContentPane().add(panelComprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 720, 150));

        panelProductosVendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos Seleccionados"));

        tablaProductosVendidos.setModel(new Vista.Tablas.ModeloTablaProductosVendidos());
        scrollProductosVendidos.setViewportView(tablaProductosVendidos);

        comboProductos.setModel(new DefaultComboBoxModel(nombresProductosDisponibles.toArray()));

        labelProducto.setText("Producto:");

        labelCantidad.setText("Cantidad:");

        campoCantidad.setToolTipText("Ingrese la cantidad de productos");

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        campoCostoTotal.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        campoCostoTotal.setEnabled(false);
        campoCostoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCostoTotalActionPerformed(evt);
            }
        });

        labelTotal.setText("TOTAL:");

        javax.swing.GroupLayout panelProductosVendidosLayout = new javax.swing.GroupLayout(panelProductosVendidos);
        panelProductosVendidos.setLayout(panelProductosVendidosLayout);
        panelProductosVendidosLayout.setHorizontalGroup(
            panelProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosVendidosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollProductosVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProductosVendidosLayout.createSequentialGroup()
                        .addGroup(panelProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelProductosVendidosLayout.createSequentialGroup()
                                .addComponent(labelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(labelCantidad)
                                .addGap(10, 10, 10)
                                .addComponent(campoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonAgregar))
                            .addComponent(botonEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTotal)
                        .addGap(18, 18, 18)
                        .addComponent(campoCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );
        panelProductosVendidosLayout.setVerticalGroup(
            panelProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosVendidosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(scrollProductosVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductosVendidosLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(panelProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProductosVendidosLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(labelProducto))
                            .addGroup(panelProductosVendidosLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelProductosVendidosLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(labelCantidad))
                            .addGroup(panelProductosVendidosLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(campoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonAgregar))
                        .addGap(7, 7, 7)
                        .addComponent(botonEliminar)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductosVendidosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        getContentPane().add(panelProductosVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 176, 710, 310));

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 88, -1));

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 88, -1));
        getContentPane().add(labelStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 484, -1, -1));
        getContentPane().add(jLabelSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 30, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCostoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCostoTotalActionPerformed
    }//GEN-LAST:event_campoCostoTotalActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        if(camposEntradaProductosCorrectos()){
            vaciarLabelStatus();
            agregarNuevoProductoSeleccionado(
                    getNombreProductoDelCombo().toString(),
                    campoCantidad.getText()
            );
            actualizarTablaProductosVendidos();
            actualizarCostoTotal();
        } else{
            mostrarErrorLabelStatus("ERROR: "+
                    "Rellene correctamente la cantidad");  
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private Object getNombreProductoDelCombo() {
        return comboProductos.getSelectedItem();
    }

    private void vaciarLabelStatus() {
        labelStatus.setFont(new Font("Serif", Font.PLAIN, 14));
        labelStatus.setText("");
    }

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        if(camposEntradaPedidoCorrectos()){
            vaciarLabelStatus();
            enviarInputs();
            finalizarRegistroPedido();
        } else{
            mostrarErrorLabelStatus("ERROR: "+
                    "Rellene correctamente la información del pedido");
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void mostrarErrorLabelStatus(String input) {
        labelStatus.setFont(new Font("Serif", Font.BOLD, 14));
        labelStatus.setText(input);
    }

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        productosVendidosActuales.remove(getProductoVendidoSeleccionado());
        actualizarTablaProductosVendidos();
        actualizarCostoTotal();
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        finalizarRegistroPedido();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void agregarNuevoProductoSeleccionado(String nombreProd, String inputCantidad) {
        productosVendidosActuales.add(crearNuevoGrupoProd(nombreProd, inputCantidad));
    }
    
    private ProductosVendidos crearNuevoGrupoProd(
            String NombreProd, String inputCantidad
    ){
        Producto productoSeleccionado = adminProductos.getProductosPorNombre(NombreProd);
                ProductosVendidos nuevoGrupoProductos = new ProductosVendidos(
                productoSeleccionado, 
                Integer.parseInt(inputCantidad)
        );
        return nuevoGrupoProductos;
    }

    private void actualizarTablaProductosVendidos() {
        vaciarTablaProductosVendidos();
        rellenarTablaProductosVendidos(productosVendidosActuales);
    }

    private void vaciarTablaProductosVendidos() {
        ModeloTablaProductosVendidos tablaProductosVendidos 
                = getModeloTablaProductosVendidos();
        int rowCount = tablaProductosVendidos.getRowCount();
        for (int i = rowCount - 1; 0 <= i; i--) {
            tablaProductosVendidos.removerFila(i);
        }    
    }

    private void rellenarTablaProductosVendidos(
            List<ProductosVendidos> productosSeleccionados
    ) {
        getModeloTablaProductosVendidos().agregarVariasFilas(productosSeleccionados);
    }

    private ModeloTablaProductosVendidos getModeloTablaProductosVendidos() {
        return (ModeloTablaProductosVendidos) tablaProductosVendidos.getModel();
    }
    
    private String getHora() {
        return campoHora.getText();
    }
    
    private String getDireccion(){
        return campoDireccion.getText();
    }
    
    private String getTelefono(){
        return campoTelefono.getText();
    }
    
    private String getComprador(){
        return campoComprador.getText();
    }
    
    private Date getFechaEntrega() {
        Calendar selectedDateChooserCalendar = comboFecha.getSelectedDate();
        
        return selectedDateChooserCalendar.getTime();
    }
    
    private void enviarInputs() {
        vendedorMenudeo.registrarPedido(getComprador(), 
                getDireccion(), 
                getTelefono(), 
                getFechaEntrega(), 
                productosVendidosActuales, 
                getHora()
        );
        
    }

    public List<ProductosVendidos> getGruposProductosActuales() {
        return productosVendidosActuales;
    }

    public void setGruposProdActuales(List<ProductosVendidos> productosVendidosActuales) {
        this.productosVendidosActuales = productosVendidosActuales;
    }

    private boolean seSeleccionoFilaVacia() {
        int INDICE_NINGUNA_FILA = -1;
        
        return (getFilaSeleccionada() == INDICE_NINGUNA_FILA);    }

    private int getFilaSeleccionada() {
        return tablaProductosVendidos.getSelectedRow();
    }
    
    private void actualizarCostoTotal(){
        double costoTotalActual 
                = vendedorMenudeo.calcularCostoTotal(this.productosVendidosActuales); 
        campoCostoTotal.setText(String.valueOf(costoTotalActual));
    }



    private ProductosVendidos getProductoVendidoSeleccionado() {
        if(!seSeleccionoFilaVacia()){
            int filaSeleccionada = getFilaSeleccionada();
            ProductosVendidos productosSeleccionados = 
                    getModeloTablaProductosVendidos().getFila(
                            filaSeleccionada
                    );
            vaciarLabelStatus();
            return productosSeleccionados;
        }else{
            mostrarErrorLabelStatus("No se selecciono una fila");
            return null;
        }    
    }

    private void finalizarRegistroPedido() {
        this.setVisible(false);
        dispose();
        MenuPrincipal menuPrincipal=new MenuPrincipal();
        menuPrincipal.setVisible(true);
    }
    
    private boolean camposEntradaPedidoCorrectos() {
        campoComprador.setText(getComprador().trim());
        campoHora.setText(getHora().trim());
        campoDireccion.setText(getDireccion().trim());
        return !(
                getComprador().isEmpty() ||
                getDireccion().isEmpty() ||
                getHora().isEmpty() ||
                productosVendidosActuales.isEmpty()
                );
     }
     
    private boolean camposEntradaProductosCorrectos() {
        campoCantidad.setText(campoCantidad.getText().trim());
        return !(
                getNombreProductoDelCombo().toString().isEmpty() ||
                campoCantidad.getText().isEmpty()
                );
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JToggleButton botonCancelar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JToggleButton botonRegistrar;
    private javax.swing.JTextField campoCantidad;
    private javax.swing.JTextField campoComprador;
    private javax.swing.JTextField campoCostoTotal;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoHora;
    private javax.swing.JTextField campoTelefono;
    private datechooser.beans.DateChooserCombo comboFecha;
    private javax.swing.JComboBox<String> comboProductos;
    private javax.swing.JLabel jLabelSeparador;
    private javax.swing.JLabel labelCampos;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelComprador;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelProducto;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JPanel panelComprador;
    private javax.swing.JPanel panelProductosVendidos;
    private javax.swing.JScrollPane scrollProductosVendidos;
    private javax.swing.JTable tablaProductosVendidos;
    // End of variables declaration//GEN-END:variables

   
}

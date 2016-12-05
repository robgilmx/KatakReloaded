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

/**
 *
 * @author DEMON
 */
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelComprador = new javax.swing.JPanel();
        LabelComprador = new javax.swing.JLabel();
        CampoComprador = new javax.swing.JTextField();
        LabelDireccion = new javax.swing.JLabel();
        CampoDireccion = new javax.swing.JTextField();
        LabelTelefono = new javax.swing.JLabel();
        CampoTelefono = new javax.swing.JTextField();
        LabelCampos = new javax.swing.JLabel();
        LabelFecha = new javax.swing.JLabel();
        comboFecha = new datechooser.beans.DateChooserCombo();
        LabelHora = new javax.swing.JLabel();
        CampoHora = new javax.swing.JTextField();
        PanelGruposProds = new javax.swing.JPanel();
        ScrollGruposProd = new javax.swing.JScrollPane();
        TablaProductosVendidos = new javax.swing.JTable();
        comboProds = new javax.swing.JComboBox<>();
        LabelProducto = new javax.swing.JLabel();
        LabelCantidad = new javax.swing.JLabel();
        CampoCantidad = new javax.swing.JTextField();
        BotonAgregar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        CampoCostoTotal = new javax.swing.JTextField();
        LabelTotal = new javax.swing.JLabel();
        BotonRegistrar = new javax.swing.JToggleButton();
        BotonCancelar = new javax.swing.JToggleButton();
        labelStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar un Pedido");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelComprador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelComprador.setText("Comprador *");
        PanelComprador.add(LabelComprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));
        PanelComprador.add(CampoComprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 11, 620, -1));

        LabelDireccion.setText("Dirección *");
        PanelComprador.add(LabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, -1));
        PanelComprador.add(CampoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 42, 620, -1));

        LabelTelefono.setText("Telefono");
        PanelComprador.add(LabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, -1, -1));
        PanelComprador.add(CampoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 73, 620, -1));

        LabelCampos.setText("* Campos obligatorios");
        PanelComprador.add(LabelCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        LabelFecha.setText("Fecha *");
        PanelComprador.add(LabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, -1, -1));
        PanelComprador.add(comboFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        LabelHora.setText("Hora de entrega *");
        PanelComprador.add(LabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));
        PanelComprador.add(CampoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 106, -1));

        getContentPane().add(PanelComprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 720, 150));

        PanelGruposProds.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos Seleccionados"));

        TablaProductosVendidos.setModel(new Vista.Tablas.ModeloTablaProductosVendidos());
        ScrollGruposProd.setViewportView(TablaProductosVendidos);

        comboProds.setModel(new DefaultComboBoxModel(nombresProductosDisponibles.toArray()));

        LabelProducto.setText("Producto:");

        LabelCantidad.setText("Cantidad:");

        CampoCantidad.setToolTipText("Ingrese la cantidad de productos");

        BotonAgregar.setText("Agregar");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        CampoCostoTotal.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        CampoCostoTotal.setEnabled(false);
        CampoCostoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCostoTotalActionPerformed(evt);
            }
        });

        LabelTotal.setText("TOTAL:");

        javax.swing.GroupLayout PanelGruposProdsLayout = new javax.swing.GroupLayout(PanelGruposProds);
        PanelGruposProds.setLayout(PanelGruposProdsLayout);
        PanelGruposProdsLayout.setHorizontalGroup(
            PanelGruposProdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGruposProdsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PanelGruposProdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollGruposProd, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelGruposProdsLayout.createSequentialGroup()
                        .addGroup(PanelGruposProdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelGruposProdsLayout.createSequentialGroup()
                                .addComponent(LabelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(comboProds, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(LabelCantidad)
                                .addGap(10, 10, 10)
                                .addComponent(CampoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotonAgregar))
                            .addComponent(BotonEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelTotal)
                        .addGap(18, 18, 18)
                        .addComponent(CampoCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );
        PanelGruposProdsLayout.setVerticalGroup(
            PanelGruposProdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGruposProdsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(ScrollGruposProd, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelGruposProdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGruposProdsLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(PanelGruposProdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelGruposProdsLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(LabelProducto))
                            .addGroup(PanelGruposProdsLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(comboProds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelGruposProdsLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(LabelCantidad))
                            .addGroup(PanelGruposProdsLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(CampoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BotonAgregar))
                        .addGap(7, 7, 7)
                        .addComponent(BotonEliminar)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGruposProdsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelGruposProdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        getContentPane().add(PanelGruposProds, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 176, 710, 310));

        BotonRegistrar.setText("Registrar");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 88, -1));

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 88, -1));
        getContentPane().add(labelStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 484, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 30, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoCostoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCostoTotalActionPerformed
    }//GEN-LAST:event_CampoCostoTotalActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        agregarNuevoGrupoProd(comboProds.getSelectedItem().toString(),CampoCantidad.getText());
        actualizarTablaProductosVendidos();
        actualizarCostoTotal();
    }//GEN-LAST:event_BotonAgregarActionPerformed

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        if(camposEntradaCorrectos()){
        EnviarInputs();
        FinalizarRegistroPedido();
        }else{
            labelStatus.setFont(new Font("Bold", Font.PLAIN, 14));
            labelStatus.setText("ERROR: "+
                    "Rellene correctamente la información del pedido");
        }
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        productosVendidosActuales.remove(getProductoVendidoSeleccionado());
        actualizarTablaProductosVendidos();
        actualizarCostoTotal();
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        FinalizarRegistroPedido();
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void agregarNuevoGrupoProd(String nombreProd, String inputCantidad) {
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
        return (ModeloTablaProductosVendidos) TablaProductosVendidos.getModel();
    }
    
    private String getHora() {
        return CampoHora.getText();
    }
    
    private String getDireccion(){
        return CampoDireccion.getText();
    }
    
    private String getTelefono(){
        return CampoTelefono.getText();
    }
    
    private String getComprador(){
        return CampoComprador.getText();
    }
    
    private Date getFechaEntrega() {
        Calendar selectedDateChooserCalendar = comboFecha.getSelectedDate();
        
        return selectedDateChooserCalendar.getTime();
    }
    
    private void EnviarInputs() {
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
        return TablaProductosVendidos.getSelectedRow();
    }
    
    private void actualizarCostoTotal(){
        double costoTotalActual 
                = vendedorMenudeo.calcularCostoTotal(this.productosVendidosActuales); 
        CampoCostoTotal.setText(String.valueOf(costoTotalActual));
    }



    private ProductosVendidos getProductoVendidoSeleccionado() {
        if(!seSeleccionoFilaVacia()){
            int filaSeleccionada = getFilaSeleccionada();
            ProductosVendidos productosSeleccionados = 
                    getModeloTablaProductosVendidos().getFila(
                            filaSeleccionada
                    );
            labelStatus.setText("");
            return productosSeleccionados;
        }else{
            labelStatus.setText("No se selecciono una fila");
            return null;
        }    
    }

    private void FinalizarRegistroPedido() {
        this.setVisible(false);
        dispose();
        MenuPrincipal menuPrincipal=new MenuPrincipal();
        menuPrincipal.setVisible(true);
    }
    
     private boolean camposEntradaCorrectos() {
         CampoComprador.setText(getComprador().trim());
         CampoHora.setText(getHora().trim());
         CampoDireccion.setText(getDireccion().trim());
         if(
            getComprador().isEmpty() ||
            getDireccion().isEmpty() ||
            getHora().isEmpty() ||
            productosVendidosActuales.isEmpty()
         ) {
            return false; 
         }else{
             return true;
         }
     }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JToggleButton BotonCancelar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JToggleButton BotonRegistrar;
    private javax.swing.JTextField CampoCantidad;
    private javax.swing.JTextField CampoComprador;
    private javax.swing.JTextField CampoCostoTotal;
    private javax.swing.JTextField CampoDireccion;
    private javax.swing.JTextField CampoHora;
    private javax.swing.JTextField CampoTelefono;
    private javax.swing.JLabel LabelCampos;
    private javax.swing.JLabel LabelCantidad;
    private javax.swing.JLabel LabelComprador;
    private javax.swing.JLabel LabelDireccion;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JLabel LabelProducto;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JPanel PanelComprador;
    private javax.swing.JPanel PanelGruposProds;
    private javax.swing.JScrollPane ScrollGruposProd;
    private javax.swing.JTable TablaProductosVendidos;
    private datechooser.beans.DateChooserCombo comboFecha;
    private javax.swing.JComboBox<String> comboProds;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelStatus;
    // End of variables declaration//GEN-END:variables

   

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


/**
 *
 * @author Mario
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public MenuPrincipal() {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btMenuVentas = new javax.swing.JButton();
        btMenuClientes = new javax.swing.JButton();
        btMenuSalir = new javax.swing.JButton();
        btMenuProductos = new javax.swing.JButton();
        btMenuPedidos = new javax.swing.JButton();
        btMenuInventario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));

        btMenuVentas.setBackground(new java.awt.Color(0, 204, 102));
        btMenuVentas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btMenuVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/Ventas.png"))); // NOI18N
        btMenuVentas.setText("Ventas");
        btMenuVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuVentasActionPerformed(evt);
            }
        });

        btMenuClientes.setBackground(new java.awt.Color(51, 51, 255));
        btMenuClientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btMenuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/cliente.jpg"))); // NOI18N
        btMenuClientes.setText("Clientes");
        btMenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuClientesActionPerformed(evt);
            }
        });

        btMenuSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btMenuSalir.setText("Salir");
        btMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuSalirActionPerformed(evt);
            }
        });

        btMenuProductos.setBackground(new java.awt.Color(255, 255, 0));
        btMenuProductos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btMenuProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/producto.png"))); // NOI18N
        btMenuProductos.setText("Productos");
        btMenuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuProductosActionPerformed(evt);
            }
        });

        btMenuPedidos.setBackground(new java.awt.Color(255, 51, 51));
        btMenuPedidos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btMenuPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/pedidos.png"))); // NOI18N
        btMenuPedidos.setText("Pedidos");
        btMenuPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuPedidosActionPerformed(evt);
            }
        });

        btMenuInventario.setBackground(new java.awt.Color(204, 0, 204));
        btMenuInventario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btMenuInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icon_inventario.gif"))); // NOI18N
        btMenuInventario.setText("Inventario");
        btMenuInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuInventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btMenuSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btMenuClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btMenuVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btMenuProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btMenuPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btMenuInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(285, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btMenuVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btMenuProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btMenuClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btMenuPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btMenuInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btMenuSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMenuVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuVentasActionPerformed
        this.dispose();
        vistaRegistrarVentas registradorVentas = new vistaRegistrarVentas();
        registradorVentas.setVisible(true);
    }//GEN-LAST:event_btMenuVentasActionPerformed

    private void btMenuProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuProductosActionPerformed
        this.dispose();
        new vistaProductos().setVisible(true);
    }//GEN-LAST:event_btMenuProductosActionPerformed

    private void btMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuClientesActionPerformed
        this.dispose();
        new vistaClientes().setVisible(true);
    }//GEN-LAST:event_btMenuClientesActionPerformed

    private void btMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btMenuSalirActionPerformed

    private void btMenuPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuPedidosActionPerformed
        // TODO add your handling code here:
       this.dispose();
        RegistradorPedidos registradorPedidos = new RegistradorPedidos();
        registradorPedidos.setVisible(true);
    }//GEN-LAST:event_btMenuPedidosActionPerformed

    private void btMenuInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuInventarioActionPerformed
        // TODO add your handling code here:
        this.dispose();
        vistaInventario inventario = new vistaInventario();
        inventario.setVisible(true);
    }//GEN-LAST:event_btMenuInventarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMenuClientes;
    private javax.swing.JButton btMenuInventario;
    private javax.swing.JButton btMenuPedidos;
    private javax.swing.JButton btMenuProductos;
    private javax.swing.JButton btMenuSalir;
    private javax.swing.JButton btMenuVentas;
    // End of variables declaration//GEN-END:variables
}

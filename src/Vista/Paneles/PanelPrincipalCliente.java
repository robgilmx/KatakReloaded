/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Paneles;

import Negocio.Entidades.Cliente;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Bernardo Espinoza
 */
public class PanelPrincipalCliente extends JPanel{
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonEditar;
    private javax.swing.JButton BotonRegresarMenu;
    private javax.swing.JTable TablaListaClientes;
    private javax.swing.JScrollPane AdminClientesScrollPanel;
    
    public PanelPrincipalCliente(){
        InicializarComponentes();
    }

    private void InicializarComponentes() {
        AdminClientesScrollPanel = new javax.swing.JScrollPane();
        TablaListaClientes = new javax.swing.JTable();
        BotonAgregar = new javax.swing.JButton();
        BotonEditar = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        BotonRegresarMenu = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Administrar Clientes", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        TablaListaClientes.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    
                },
                new String [] {
                    "Nombre", "Direccion", "Telefono", "E-mail"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AdminClientesScrollPanel.setViewportView(TablaListaClientes);

        BotonAgregar.setText("Agregar");

        BotonEditar.setText("Editar");

        BotonBorrar.setText("Borrar");

        BotonRegresarMenu.setText("Regresar al Menu Principal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
        setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AdminClientesScrollPanel)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BotonAgregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotonEditar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotonBorrar)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(BotonRegresarMenu)))
                        .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AdminClientesScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BotonAgregar)
                                .addComponent(BotonEditar)
                                .addComponent(BotonBorrar))
                        .addGap(54, 54, 54)
                        .addComponent(BotonRegresarMenu))
        );
    }
    
    private TableModel getTableModel(){
        return TablaListaClientes.getModel();
    }
    
    private int getFilaSeleccionada(){
        return TablaListaClientes.getSelectedRow();
    }
    
    public String getValorEnFilaSeleccionada(int columna){
        return getTableModel().getValueAt(getFilaSeleccionada(), columna).toString();
    }
    
    public boolean seSeleccionoFila(){
        int NINGUNA_FILA_SELECCIONADA=-1;
        
        return (getFilaSeleccionada() !=NINGUNA_FILA_SELECCIONADA);
    }
    
    public void ActualizarTabla(List<Cliente> clientes){
        DefaultTableModel modelo=(DefaultTableModel)getTableModel();
        modelo.setRowCount(0);
        for(Cliente cliente:clientes){
            modelo.addRow(new Object[]{cliente.getNombre(),
                                       cliente.getDireccion(),
                                       cliente.getTelefono(),
                                       cliente.getEmail()}
                         );
        }
    }

//----------Metodos de ActionListener    
    
    public void setListenerBotonAgregar(ActionListener listener){
        BotonAgregar.addActionListener(listener);
    }
    
    public void setListenerBotonBorrar(ActionListener listener){
        BotonBorrar.addActionListener(listener);
    }
    
    public void setListenerBotonEditar(ActionListener listener){
        BotonEditar.addActionListener(listener);
    }
    
    public void setListenerBotonRegresarMenu(ActionListener listener){
        BotonRegresarMenu.addActionListener(listener);
    }
    
    
}

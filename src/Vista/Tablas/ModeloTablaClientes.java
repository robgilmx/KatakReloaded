/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Tablas;

import Negocio.Entidades.Cliente;
import java.util.Arrays;

/**
 *
 * @author Bernardo Espinoza
 */
public class ModeloTablaClientes extends ModeloTabla<Cliente> {
    public static final int INDICE_NOMBRE=0;
    public static final int INDICE_DIRECCION=1;
    public static final int INDICE_TELEFONO=2;
    public static final int INDICE_EMAIL=3;
    private static final String[] TITULOS_COLUMNAS ={
        "Nombre",
        "Direccion",
        "Telefono",
        "Email"
    };

    public ModeloTablaClientes() {
        super(Arrays.asList(TITULOS_COLUMNAS));
        setClaseFila(Cliente.class);
        setModeloEditable(false);
    }

    //Commit: Mario
    //Se agrego la columna email
    @Override
    public Object getValueAt(int indiceFila, int indiceColumna) {
        Cliente cliente=getFila(indiceFila);
        
        switch(indiceColumna){
            case INDICE_NOMBRE:
                return cliente.getNombre();
            case INDICE_DIRECCION:
                return cliente.getDireccion();
            case INDICE_TELEFONO:
                return cliente.getTelefono();
            case INDICE_EMAIL:
                return cliente.getEmail();
            default:
                return null;
        }
    }
    
}

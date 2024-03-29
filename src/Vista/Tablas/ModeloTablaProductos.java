/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Tablas;

import Negocio.Entidades.Producto;
import java.util.Arrays;

/**
 *
 * @author DEMON
 */
public class ModeloTablaProductos extends ModeloTabla<Producto>{
    private static final int INDICE_ID = 0;
    private static final int INDICE_NOMBRE = 1;
    private static final int INDICE_PRECIO = 2;
    
    private static final String[] TITULOS_COLUMNAS =
    {
        "ID",
        "Nombre",
        "Precio"
    };
    
    public ModeloTablaProductos() {
        super(Arrays.asList(TITULOS_COLUMNAS));
        setClaseFila(Producto.class);
        setModeloEditable(false);
    }
    
    @Override
    public Object getValueAt(int indiceFila, int indiceColumna) {
        Producto prod = getFila(indiceFila);
        
        switch(indiceColumna) {
            case INDICE_ID:
                return prod.getId();
            case INDICE_NOMBRE:
                return prod.getNombre();
            case INDICE_PRECIO:
                return prod.getPrecio();
            default:
                return null;
        }
    }  
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosProductos;
import Negocio.Entidades.Producto;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author DEMON
 */
public class AdminProductos {
    private final AccesoDatosProductos accesoDatosProd;
    
    public AdminProductos(){
        accesoDatosProd = new AccesoDatosProductos();
    }
    
    public void AgregarProd(Producto prod){
        accesoDatosProd.insertar(prod);
    }
    
    public void EditarProd(Producto prod){
        accesoDatosProd.sobrescribir(prod);
    }
    
    public void BorrarProd(Producto prod){
        accesoDatosProd.borrar(prod);
    }
    
    public List<Producto> getListaProdPorNombre(String nombreProd) {
        return accesoDatosProd.getPorNombre(nombreProd);
    }
    
    public Producto getProdPorNombre(String nombreProd){
        List<Producto> resultados;
        resultados = getListaProdPorNombre(nombreProd);
        if(resultados.size()<2){
            return resultados.get(0);
        }else{
            System.err.println("Producto no unico encontrado");
            return null;
        }
    }
    
    public List<Producto> getListaProd() {
        return accesoDatosProd.getListaTodos();
    }
        
    public List<String> getNombresTodosProd() {
        List npd = new ArrayList();
        for(Producto prod : getListaProd()){
            npd.add(prod.getNombre());
        }
        return npd;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import Negocio.Entidades.ProductosVendidos;
import Negocio.Entidades.Venta;
import Negocio.Entidades.Cliente;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/********************************************************************** 
 
    CLASE: {@link VendedorMayoreo}
    
    AUTOR: Mario Lopez Duran
     
    Encargada de registrar las {@link Venta} de los {@link Cliente}
    que compran con regularidad.

 **********************************************************************/
public class VendedorMayoreo {
    private final AdminVentas adminVentas;
    private final AdminProductosVendidos adminProductosVendidos;


    
    public VendedorMayoreo(){
        adminVentas = new AdminVentas();
        adminProductosVendidos = new AdminProductosVendidos();
        
    }
      
    private Venta realizarVenta(
       
        Cliente cliente, 
        Date fechaVenta,
        List <ProductosVendidos> productosVendidosMayoreo
        
)
        {
            Venta nuevaVenta;

            nuevaVenta = new Venta(
                                   cliente,
                                   productosVendidosMayoreo,
                                   fechaVenta,
                                   calcularCostoTotal(productosVendidosMayoreo)
        );
            
        return nuevaVenta;
    }
    
    public void registrarVenta(Cliente cliente,
                               Date fechaVenta,
                               List <ProductosVendidos> productosVendidos
            )
    {

        List<ProductosVendidos> productosVendidosRegistrados =
                registrarProductosVendidos(productosVendidos);
        
        Venta nuevaVenta = realizarVenta(cliente,
                                         fechaVenta,
                                         productosVendidosRegistrados 
                );
        
        adminVentas.agregarVentaRegistro(nuevaVenta);
    }
        
    public double calcularCostoTotal(List<ProductosVendidos> prodsSeleccionados) {
        double costoTotal = 0;
        for(ProductosVendidos actual : prodsSeleccionados){
            costoTotal += actual.getCostoTotal();
        }
        return costoTotal;
    }
        
    private List<ProductosVendidos> registrarProductosVendidos(List<ProductosVendidos> productosVendidosInput){
        List<ProductosVendidos> prodsVendidosRegistrados;
        prodsVendidosRegistrados = new ArrayList<>();
        
        for(ProductosVendidos inputProductosVendidos : productosVendidosInput){
            adminProductosVendidos.AgregarProductosVendidos(inputProductosVendidos);
            prodsVendidosRegistrados.add(inputProductosVendidos);
        }
        return prodsVendidosRegistrados;
    }
        
 
}

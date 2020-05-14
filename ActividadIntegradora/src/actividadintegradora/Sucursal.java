/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadintegradora;

import java.util.*;

/**
 *
 * @author Mayra M.F
 */
public class Sucursal {
    private final int stockMaximo=100;
    private String razonSocial;
    private final double valorDeStockMaximo=200000.0;
    private Producto unicoProducto=new Producto("YerbaMate Marolio");
    private int stockActual;
    
   
    public Sucursal(String razonSocial, int stockActual) {
        this.razonSocial = razonSocial;
        this.stockActual = stockActual;
    }
      
   public void consultarStock(){
       System.out.println("En la Sucursal  "+razonSocial+"  Hay "+stockActual+" Productos.");
       if (stockActual<1) {System.out.println(" Hacer Pedido De Productos, no hay Stock");
           
       }
       else if (stockActual>stockMaximo) { System.out.println(" Deberá Hacer una Transferencia de "+(stockActual-stockMaximo)+" Productos. El stock actual supera el permitido.");
           
       }
      
   }
   public void hacerTransferenciaDeProductos(Sucursal otrasucursal,int cantidadTransferida){
     
       stockActual=stockActual-cantidadTransferida;
        otrasucursal.RecibirTransferencia(cantidadTransferida);
       
 
       
   } 
  
  public void RecibirTransferencia(int cantidadRecibida){// cantidad recibida es igual a la cantidad transferida por otro
  stockActual=stockActual+cantidadRecibida;
  
  
  }
  public void SolicitarPedidoDeProducto(Sucursal proveedora,int cantidadSolicitada){
     String mensaje="La Sucursal "+razonSocial+" Le solicita un pedido de: "+cantidadSolicitada+" Productos a "+proveedora.getRazonSocial();
      proveedora.recibirPedidoDeProductos(mensaje);
  }  
   public void recibirPedidoDeProductos(String notificacion){
       System.out.println(notificacion);
   
   
   
   }
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Producto getUnicoProducto() {
        return unicoProducto;
    }

    public void setUnicoProducto(Producto unicoProducto) {
        this.unicoProducto = unicoProducto;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    

  

   
}

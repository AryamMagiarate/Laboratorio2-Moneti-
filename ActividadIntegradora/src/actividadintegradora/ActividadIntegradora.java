/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadintegradora;

/**
 *
 * @author Mayra M.F
 */
public class ActividadIntegradora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Sucursal S1=new Sucursal("PepeSRL",34);
        Sucursal S2=new Sucursal("MoniSRL",109);
       
        S2.consultarStock();
        S1.consultarStock();
        S2.hacerTransferenciaDeProductos(S1, 9);
         S2.consultarStock();
        S1.consultarStock();
        S1.SolicitarPedidoDeProducto(S2, 20);
  
    }
    
}

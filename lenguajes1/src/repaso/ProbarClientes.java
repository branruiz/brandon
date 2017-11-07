/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author T-102
 */
public class ProbarClientes {
    
    
    public static void main(String[] args) {
        
        GeneradorClientes gencli=new GeneradorClientes();
        
        for(Cliente c: gencli.generarClientes()){
            System.out.println("nombre: "+ c.getNombre()+" Edad "+c.getEdad()+" calle "+c.getDireccion().getCalle()+" Colonia: "+c.getDireccion().getColonia()+" cp: "+c.getDireccion().getCp());
        
        
        } 
        
        
    }
}

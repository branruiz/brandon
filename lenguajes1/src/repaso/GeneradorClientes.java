/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.ArrayList;


public class GeneradorClientes {
    ArrayList <Cliente> generarClientes (){ 
  
     ArrayList<Cliente> generar=new ArrayList <Cliente> (); 
     
     
     Direccion d1=new Direccion("salsipuedes", "delaspetacas", 561, "benitocamelo");
      Direccion d2=new Direccion("ssasasasasaes", "dddddddas", 591, "besdsdsdsdsmelo");
      Direccion d3=new Direccion("sddsdsds", "delghhgghghgcas", 978, "beññlñllkvvvvlo");
      
      
       Cliente c1=new Cliente("oscar", 21, "hotmail", d1);
        Cliente c2=new Cliente("omar", 22, "gmail", d2);
         Cliente c3=new Cliente("maria",23, "yahoo", d3);
         
         generar.add(c1);
         generar.add(c2);
         generar.add(c3);
         
         
     return generar;
    }
}

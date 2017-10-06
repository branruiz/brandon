/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referenciados;

import abstraccion.Usuario;

/**
 *
 * @author T-102
 */
public class prueba2 {
    public static void main(String[] args) {
        //todos los referenciados pertenecen a una clase
        //se necesita uno o mas primitivos para definirlos
        String nombre="brandon";
        String otro=new String("Ludoviko");
        Usuario u=new Usuario();
        u.setAltura(1.7f);
        u.setPeso(71);
    }
}

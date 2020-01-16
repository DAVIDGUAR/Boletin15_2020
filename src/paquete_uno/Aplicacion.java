/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_uno;

import paquete_dos.Persoal;

/**
 *
 * @author david
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persoal datos1 = new Persoal();
        Persoal datos2 = new Persoal();
        Persoal datos3 = new Persoal();
        datos1.comprobardireccion();
        datos2.comprobardireccion();
       // datos3.comprobardireccion();
        
        
        Academica   alum1=new Academica("David", datos1,Academica.NotaLetra.NUEVE);
        Academica   alum2=new Academica("Juan", datos2,Academica.NotaLetra.SIETE );
      //  Academica   alum3=new Academica("Diana", datos3,Academica.NotaLetra.DOS);
        
        
        System.out.println("Datos academicos: "+alum1.toString());
        System.out.println("Datos academicos: "+alum2.toString());
      //  System.out.println("Datos academicos: "+alum3.toString());
    }
    
}

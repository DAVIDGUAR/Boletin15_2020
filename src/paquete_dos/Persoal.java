/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_dos;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Persoal {
    
    String telefono,correo;

    public Persoal(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    public Persoal() {
    }
    
    
    

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return  "telefono=" + telefono + ", correo=" + correo ;
    }
    
     public void comprobardireccion() {
        boolean punto = false;
        int arroba = 0;
        boolean a = false;
        boolean b = false;

        while (a == false) {

            correo = JOptionPane.showInputDialog("Introduce correo electronico");
            for (int i = 0; i < correo.length(); i++) {

                if (correo.charAt(i) == '@') {

                    arroba++;

                }

                if (correo.charAt(i) == '.') {

                    punto = true;

                }
            }

            if (arroba == 1 && punto == true) {

                System.out.println("Correcto");

                a = true;

               

            } else {
                System.out.println("Correo electronico incorrecto");
            }

            arroba = 0;
            punto = false;
        }
        while (b == false) {

            telefono = JOptionPane.showInputDialog("Introduce telefono");
            if (telefono.length() == 9) {
                System.out.println("Correcto ");
                b = true;
               

            } else {
                System.out.println("El telefono introducido es incorrecto");
            }

        }
    }
    
    
    
    
}

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
public class Academica {
    
    enum NotaLetra {

        UNO(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8), NUEVE(9), DIEZ(10);

        int notas;

        private NotaLetra(int notas) {

            this.notas = notas;

        }

        int getnota() {
            return notas;
        }
    }
    
    

    private static int numReferencia = 2020;
    private int id, nota;
    private String nome;
    private Persoal datosPersoal=new Persoal();
private NotaLetra notas;
   

    public Academica(String nome, Persoal datos, NotaLetra notas) {
        this.nome = nome;
        datosPersoal = datos;
        this.notas= notas;
        id = numReferencia;
        ++numReferencia;

    }

    public static int getNumReferencia() {
        return numReferencia;
    }

    public static void setNumReferencia(int numReferencia) {
        Academica.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  "id=" + id + ", nome=" + nome + ", datos Persoal= " + datosPersoal + ", nota= " + this.notas.getnota() ;
    }

 
 
}

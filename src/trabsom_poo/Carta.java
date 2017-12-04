/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabsom_poo;

/**
 *
 * @author Mateus
 */
public class Carta {
    String numero;
    String naipe;
    int valor;
    
    void novaCarta(String num, String np, int vl){
        this.naipe = np;
        this.numero = num;
        this.valor = vl;
    }
}

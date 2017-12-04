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

public class Rodada {
    int pontos = 1;
    boolean truco = false;
    int maior=-1;
    int ganhador;
    int cartas = 0;
    int nrods = 0;
    
    public void jogaCarta(int carta, int jogador, boolean truco){
        
        this.cartas++;
        
        if(this.truco){
            if(this.pontos == 1)
                this.pontos = 3;
            else if(this.pontos == 3)
                this.pontos = 6;
            else if(this.pontos == 6)
                this.pontos = 9;
            else if(this.pontos == 9)
                this.pontos = 12;
        }
  
        if(carta > this.maior){
            this.maior = carta;
            this.ganhador = jogador;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabsom_poo;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Mateus
 */
public class Jogador {
    String nome;
    int carta1;
    int carta2;
    int carta3;
    boolean prox = false;
   
    public void setName(Jogador j, String nome){
        j.nome = ""+nome;
    }
    
    public Baralho recebeCartas(Baralho b){
        Random random = new Random();
        int tam = b.baralho.size();
        int x = random.nextInt(tam);
        this.carta1 = (int) b.baralho.get(x);
        b.baralho.remove(x);
        
        tam = b.baralho.size();
        x = random.nextInt(tam);
        this.carta2 = (int) b.baralho.get(x);
        b.baralho.remove(x);
        
        tam = b.baralho.size();
        x = random.nextInt(tam);
        this.carta3 = (int) b.baralho.get(x);
        b.baralho.remove(x);
        
        return b;
    }
}

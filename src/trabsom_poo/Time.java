/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabsom_poo;

import javax.swing.*;

/**
 *
 * @author Mateus
 */
public class Time {
    Jogador jogador1;
    Jogador jogador2;
    int pontos;
    int rodadas;
    
    public void criaTime(String equipe){
        jogador1 = new Jogador();
        jogador2 = new Jogador();
        pontos = 0;
        rodadas = 1;
        
        JTextField jogador1Field = new JTextField(10);
        JTextField jogador2Field = new JTextField(10);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Jogador 1:"));
        myPanel.add(jogador1Field);
        myPanel.add(Box.createHorizontalStrut(20));
        myPanel.add(new JLabel("Jogador 2:"));
        myPanel.add(jogador2Field);
        
        int result = JOptionPane.showConfirmDialog(null, myPanel, 
               "Entre com nomes do jogadores do " + equipe, JOptionPane.OK_CANCEL_OPTION);
        
        String nome1 = jogador1Field.getText();
        String nome2 = jogador2Field.getText();
        
        if (result == JOptionPane.OK_OPTION) {
            if("".equals(nome1)){
                jogador1.setName(jogador1, "JOGADOR 1");
            } else if(!"".equals(nome1)){
                jogador1.setName(jogador1, nome1);
            }
            if("".equals(nome2)){
                jogador2.setName(jogador2, "JOGADOR 2");
            } else if(!"".equals(nome2)){
                jogador2.setName(jogador2, nome2);
            }
        } else if(result == JOptionPane.CANCEL_OPTION) {
            jogador1.setName(jogador1, "JOGADOR 1");
            jogador2.setName(jogador2, "JOGADOR 2");
        }
    }
    
    public void ganhouRodada(int pts){
        this.pontos +=pts;
    }
}

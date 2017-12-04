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
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.BevelBorder;

public class JanelaHome {
    
    public static void main(String[] args) {
                
        // cria frame
        final JFrame janela = new JFrame("Truco Stars"); //janela
        janela.setSize(800, 600);
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.setFocusable(true);
        
        //cria menubar
        final JMenuBar menuBar = new JMenuBar();
        final JMenu game = new JMenu("Game");
        menuBar.add(game);
        final JMenu option = new JMenu("Option");
        menuBar.add(option);
        final JMenu help = new JMenu("Help");
        menuBar.add(help);
        janela.setJMenuBar(menuBar);

        final JMenuItem newGame = new JMenuItem("(F1)  Novo Jogo");
        newGame.getAccessibleContext().setAccessibleDescription("Clique para iniciar um nobo jogo.");
        game.add(newGame);

        final JMenuItem closeGame = new JMenuItem("(F12)  Fechar");
        closeGame.getAccessibleContext().setAccessibleDescription("Clique para fechar a aplicação.");
        game.add(closeGame);
        
        final JMenuItem ajudaHelp = new JMenuItem("Ajuda");
        ajudaHelp.getAccessibleContext().setAccessibleDescription("Ajuda.");
        help.add(ajudaHelp);
        
        final JMenuItem sobreHelp = new JMenuItem("Sobre");
        sobreHelp.getAccessibleContext().setAccessibleDescription("Sobre.");
        help.add(sobreHelp);
        
        closeGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int exitDialogButton = JOptionPane.YES_NO_OPTION;
                int exitDialogResult = JOptionPane.showConfirmDialog (null, "Deseja realmente sair? Vamos sentir sua falta :(","Calma lá...",exitDialogButton);
                if(exitDialogResult == JOptionPane.YES_OPTION){
                    janela.setVisible(false);
                    janela.dispose();
                }
            }
        });
        
        sobreHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Desenvolvido por:\nMateus Pereira da Silva, 11411BCC020\nJose Maxwell, 11411BCC049 ");
            }
        });
                
        ajudaHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Jogo de truco");
            }
        });
        //FIM MENU BAR
        
        
        //STATUS GAME
        final JPanel statusGame = new JPanel();
        statusGame.setBorder(new BevelBorder(BevelBorder.LOWERED));
        statusGame.setPreferredSize(new Dimension(janela.getWidth(), 50));
        janela.add(statusGame, BorderLayout.NORTH);

        final JLabel currentStatusGame = new JLabel("INICIE UM NOVO JOGO");
        currentStatusGame.setHorizontalAlignment(SwingConstants.CENTER);
        statusGame.add(currentStatusGame, BorderLayout.CENTER);
        
        
        //cria status bottom bar
        final JPanel statusPanel = new JPanel();
        statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        janela.add(statusPanel, BorderLayout.SOUTH);
        statusPanel.setPreferredSize(new Dimension(janela.getWidth(), 16));
        statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
        final JLabel statusLabel = new JLabel("INICIE UM NOVO JOGO");
        statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
        statusPanel.add(statusLabel);

        final JPanel centro_do_jogo = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        centro_do_jogo.setBorder(new BevelBorder(BevelBorder.LOWERED));
        centro_do_jogo.setPreferredSize(new Dimension(333, 600));
        janela.add(centro_do_jogo, BorderLayout.CENTER);

        final JPanel time1 = new JPanel();
        time1.setBorder(new BevelBorder(BevelBorder.LOWERED));
        time1.setPreferredSize(new Dimension(333, 600));
        final JLabel time1Label = new JLabel("TIME 1");
        time1Label.setHorizontalAlignment(SwingConstants.CENTER);
        time1.add(time1Label);
        janela.add(time1, BorderLayout.WEST);
        
        //Status time 1
        final JPanel statusTime1 = new JPanel();
        statusTime1.setPreferredSize(new Dimension(330, 100));
        time1.add(statusTime1, BorderLayout.NORTH);
        
        final JLabel pontosTime1 = new JLabel("Pontos: ");
        statusTime1.add(pontosTime1);
        
        final JPanel jogador1 = new JPanel();
        jogador1.setBorder(new BevelBorder(BevelBorder.LOWERED));
        jogador1.setPreferredSize(new Dimension(333, 200));
        time1.add(jogador1, BorderLayout.NORTH);
        final JLabel nomeJogador1 = new JLabel("Jogador #1: ");
        jogador1.add(nomeJogador1);
        
        final JPanel jogador2 = new JPanel();
        jogador2.setBorder(new BevelBorder(BevelBorder.LOWERED));
        jogador2.setPreferredSize(new Dimension(333, 200));
        time1.add(jogador2, BorderLayout.SOUTH);
        final JLabel nomeJogador2 = new JLabel("Jogador #2:");
        jogador2.add(nomeJogador2);
        //fim status time 1
        
        final JPanel time2 = new JPanel();
        time2.setBorder(new BevelBorder(BevelBorder.LOWERED));
        time2.setPreferredSize(new Dimension(333, 600));
        final JLabel time2Label = new JLabel("TIME 2");
        time2.add(time2Label, BorderLayout.NORTH);
        time2Label.setHorizontalAlignment(SwingConstants.CENTER);
        janela.add(time2, BorderLayout.EAST);

        //Status time 2
        final JPanel statusTime2 = new JPanel();
        statusTime2.setPreferredSize(new Dimension(330, 100));
        time2.add(statusTime2, BorderLayout.NORTH);
        final JLabel pontosTime2 = new JLabel("Pontos: ");
        statusTime2.add(pontosTime2);
        
        final JPanel jogador3 = new JPanel();
        jogador3.setBorder(new BevelBorder(BevelBorder.LOWERED));
        jogador3.setPreferredSize(new Dimension(333, 200));
        time2.add(jogador3, BorderLayout.NORTH);
        final JLabel nomeJogador3 = new JLabel("Jogador #3: ");
        jogador3.add(nomeJogador3);
        
        final JPanel jogador4 = new JPanel();
        jogador4.setBorder(new BevelBorder(BevelBorder.LOWERED));
        jogador4.setPreferredSize(new Dimension(333, 200));
        time2.add(jogador4, BorderLayout.SOUTH);
        final JLabel nomeJogador4 = new JLabel("Jogador #4:");
        jogador4.add(nomeJogador4);
        //fim status time 1
        
        janela.pack();
        janela.setVisible(true);
        
        Time equipe1 = new Time();
        Time equipe2 = new Time();
        equipe1.criaTime("Time 1");
        equipe2.criaTime("Time 2");
        //equipe1.ganhouRodada(3);
        int nRodadas = 1;
        int nRodadasPqn = 0;
        equipe1.jogador1.prox = true;
        
            while(equipe1.pontos < 12 && equipe2.pontos < 12){
                 //rodada diferente

                equipe1.rodadas = 0;
                equipe2.rodadas = 0;
                nRodadasPqn = 0;
                
                Baralho b = new Baralho();
                b = equipe1.jogador1.recebeCartas(b);
                b = equipe1.jogador2.recebeCartas(b);
                b = equipe2.jogador1.recebeCartas(b);
                b = equipe2.jogador2.recebeCartas(b);

                System.out.println("Jogador #1: " + equipe1.jogador1.nome + ": carta1: " + equipe1.jogador1.carta1 + " - carta2: " + equipe1.jogador1.carta2 + " - carta3: " + equipe1.jogador1.carta3);
                System.out.println("Jogador #2: " + equipe1.jogador2.nome + ": carta1: " + equipe1.jogador2.carta1 + " - carta2: " + equipe1.jogador2.carta2 + " - carta3: " + equipe1.jogador2.carta3);
                System.out.println("Jogador #3: " + equipe2.jogador1.nome + ": carta1: " + equipe2.jogador1.carta1 + " - carta2: " + equipe2.jogador1.carta2 + " - carta3: " + equipe2.jogador1.carta3);
                System.out.println("Jogador #4: " + equipe2.jogador2.nome + ": carta1: " + equipe2.jogador2.carta1 + " - carta2: " + equipe2.jogador2.carta2 + " - carta3: " + equipe2.jogador2.carta3);

                nomeJogador1.setText("Jogador #1: " + equipe1.jogador1.nome);
                nomeJogador2.setText("Jogador #2: " + equipe1.jogador2.nome);
                nomeJogador3.setText("Jogador #3: " + equipe2.jogador1.nome);
                nomeJogador4.setText("Jogador #4: " + equipe2.jogador2.nome);

                pontosTime1.setText("Pontos: " + equipe1.pontos);
                pontosTime2.setText("Pontos: " + equipe2.pontos);

                if(equipe1.jogador1.prox){
                    currentStatusGame.setText("Rodada #" + nRodadas + ": VEZ DE " + equipe1.jogador1.nome);
                    statusLabel.setText("Rodada #" + nRodadas + ": VEZ DE " + equipe1.jogador1.nome);
                    
                } else if(equipe1.jogador2.prox){
                    currentStatusGame.setText("Rodada #" + nRodadas + ": VEZ DE " + equipe1.jogador2.nome);
                    statusLabel.setText("Rodada #" + nRodadas + ": VEZ DE " + equipe1.jogador2.nome);
                    
                } else if(equipe2.jogador1.prox){
                    currentStatusGame.setText("Rodada #" + nRodadas + ": VEZ DE " + equipe2.jogador1.nome);
                    statusLabel.setText("Rodada #" + nRodadas + ": VEZ DE " + equipe2.jogador1.nome);
                    
                } else if(equipe2.jogador2.prox){
                    currentStatusGame.setText("Rodada #" + nRodadas + ": VEZ DE " + equipe2.jogador2.nome);
                    statusLabel.setText("Rodada #" + nRodadas + ": VEZ DE " + equipe2.jogador2.nome);
                    
                }
                
                final JPanel jg1_cartas = new JPanel();
                jg1_cartas.setPreferredSize(new Dimension(330, 100));
                jogador1.add(jg1_cartas);

                final JPanel jg2_cartas = new JPanel();
                jg2_cartas.setPreferredSize(new Dimension(330, 100));
                jogador2.add(jg2_cartas);

                final JPanel jg3_cartas = new JPanel();
                jg3_cartas.setPreferredSize(new Dimension(330, 100));
                jogador3.add(jg3_cartas);

                final JPanel jg4_cartas = new JPanel();
                jg4_cartas.setPreferredSize(new Dimension(330, 100));
                jogador4.add(jg4_cartas);

                //1
                //Icon jg1_carta1_icon = new ImageIcon("img/1.png");
                JLabel jg1_carta1 = new JLabel(Integer.toString(equipe1.jogador1.carta1));//(jg1_carta1_icon);
                jg1_cartas.add(jg1_carta1);

                   
                Icon jg1_carta2_icon = new ImageIcon("img/14.png");
                JLabel jg1_carta2 = new JLabel(Integer.toString(equipe1.jogador1.carta2));//(jg1_carta2_icon);
                jg1_cartas.add(jg1_carta2);

                Icon jg1_carta3_icon = new ImageIcon("img/20.png");
                JLabel jg1_carta3 = new JLabel(Integer.toString(equipe1.jogador1.carta3));//(jg1_carta3_icon);
                jg1_cartas.add(jg1_carta3);

                JLabel aux1 = new JLabel();
                aux1.setPreferredSize(new Dimension(70, 70));
                jg1_cartas.add(aux1);
                aux1.setText(" ");

                //2
                Icon jg2_carta1_icon = new ImageIcon("img/1.png");
                JLabel jg2_carta1 = new JLabel(Integer.toString(equipe1.jogador2.carta1));//(jg2_carta1_icon);
                jg2_cartas.add(jg2_carta1);

                Icon jg2_carta2_icon = new ImageIcon("img/14.png");
                JLabel jg2_carta2 = new JLabel(Integer.toString(equipe1.jogador2.carta2));//(jg2_carta2_icon);
                jg2_cartas.add(jg2_carta2);

                Icon jg2_carta3_icon = new ImageIcon("img/20.png");
                JLabel jg2_carta3 = new JLabel(Integer.toString(equipe1.jogador2.carta3));//(jg2_carta3_icon);
                jg2_cartas.add(jg2_carta3);

                JLabel aux2 = new JLabel();
                aux2.setPreferredSize(new Dimension(70, 70));
                jg2_cartas.add(aux2);
                aux2.setText(" ");

                //3
                Icon jg3_carta1_icon = new ImageIcon("img/1.png");
                JLabel jg3_carta1 = new JLabel(Integer.toString(equipe2.jogador1.carta1));//(jg3_carta1_icon);
                jg3_cartas.add(jg3_carta1);

                Icon jg3_carta2_icon = new ImageIcon("img/14.png");
                JLabel jg3_carta2 = new JLabel(Integer.toString(equipe2.jogador1.carta2));//(jg3_carta2_icon);
                jg3_cartas.add(jg3_carta2);

                Icon jg3_carta3_icon = new ImageIcon("img/20.png");
                JLabel jg3_carta3 = new JLabel(Integer.toString(equipe2.jogador1.carta3));//(jg3_carta3_icon);
                jg3_cartas.add(jg3_carta3);

                JLabel aux3 = new JLabel();
                aux3.setPreferredSize(new Dimension(70, 70));
                jg3_cartas.add(aux3);
                aux3.setText(" ");

                //4
                Icon jg4_carta1_icon = new ImageIcon("img/1.png");
                JLabel jg4_carta1 = new JLabel(Integer.toString(equipe2.jogador2.carta1));//(jg4_carta1_icon);
                jg4_cartas.add(jg4_carta1);

                Icon jg4_carta2_icon = new ImageIcon("img/14.png");
                JLabel jg4_carta2 = new JLabel(Integer.toString(equipe2.jogador2.carta2));//(jg4_carta2_icon);
                jg4_cartas.add(jg4_carta2);

                Icon jg4_carta3_icon = new ImageIcon("img/20.png");
                JLabel jg4_carta3 = new JLabel(Integer.toString(equipe2.jogador2.carta3));//(jg4_carta3_icon);
                jg4_cartas.add(jg4_carta3);

                JLabel aux4 = new JLabel();
                aux4.setPreferredSize(new Dimension(70, 70));
                jg4_cartas.add(aux4);
                aux4.setText(" ");
                int aux_carta;
                Rodada rodada = new Rodada();
                while(nRodadasPqn!=3){
                    int rodadaMini = 0;
                    while(rodadaMini != 4){
                        if(equipe1.jogador1.prox){
                            aux_carta = -1;
                            while(true){
                                try{
                                    aux_carta = Integer.parseInt(JOptionPane.showInputDialog("JOGADOR 1, DIGITE O NUMERO DA CARTA: "));
                                    if(aux_carta != equipe1.jogador1.carta1 && aux_carta != equipe1.jogador1.carta2 && aux_carta != equipe1.jogador1.carta3)
                                        JOptionPane.showMessageDialog(null, "Carta Invalida, digite novamente");
                                    else
                                    {
                                        if(aux_carta == equipe1.jogador1.carta1){
                                            rodada.jogaCarta(equipe1.jogador1.carta1, 1, false);
                                            //jg1_cartas.remove(jg1_carta1);
                                            jg1_carta1.setText("");
                                            equipe1.jogador1.carta1 = -2;
                                        } else if(aux_carta == equipe1.jogador1.carta2){
                                            rodada.jogaCarta(equipe1.jogador1.carta2, 1, false);
                                            //jg1_cartas.remove(jg1_carta2);
                                            jg1_carta2.setText("");
                                            equipe1.jogador1.carta2 = -2;
                                        } else if(aux_carta == equipe1.jogador1.carta3){
                                            rodada.jogaCarta(equipe1.jogador1.carta3, 1, false);
                                            equipe1.jogador1.carta3 = -2;
                                            //jg1_cartas.remove(jg1_carta3);
                                            jg1_carta3.setText("");
                                        } 
                                        equipe1.jogador1.prox = false;
                                        equipe2.jogador1.prox = true;
                                        break;
                                    }
                                } catch(Exception e){
                                   JOptionPane.showMessageDialog(null, "Carta Invalida, digite novamente");
                                }
                            }
                            
                        } else if(equipe1.jogador2.prox){
                            aux_carta = -1;
                            while(true){
                                try{
                                    aux_carta = Integer.parseInt(JOptionPane.showInputDialog("JOGADOR 2, DIGITE O NUMERO DA CARTA: "));
                                    if(aux_carta != equipe1.jogador2.carta1 && aux_carta != equipe1.jogador2.carta2 && aux_carta != equipe1.jogador2.carta3)
                                        JOptionPane.showMessageDialog(null, "Carta Invalida, digite novamente");
                                    else{
                                        if(aux_carta == equipe1.jogador2.carta1){
                                            rodada.jogaCarta(equipe1.jogador2.carta1, 2, false);
                                            //jg2_cartas.remove(jg2_carta1);
                                            jg2_carta1.setText("");
                                            equipe1.jogador2.carta1 = -2;
                                        } else if(aux_carta == equipe1.jogador2.carta2){
                                            rodada.jogaCarta(equipe1.jogador2.carta2, 2, false);
                                            ///jg2_cartas.remove(jg2_carta2);
                                            jg2_carta2.setText("");
                                            equipe1.jogador2.carta2 = -2;
                                        } else if(aux_carta == equipe1.jogador2.carta3){
                                            rodada.jogaCarta(equipe1.jogador2.carta3, 2, false);
                                            //jg2_cartas.remove(jg2_carta3);
                                            jg2_carta3.setText("");
                                            equipe1.jogador2.carta3 = -2;
                                        }
                                        equipe1.jogador2.prox = false;
                                        equipe2.jogador2.prox = true;
                                        break;
                                    }
                                        
                                } catch(Exception e){
                                   JOptionPane.showMessageDialog(null, "Carta Invalida, digite novamente");
                                }
                            }
                        } else if(equipe2.jogador1.prox){
                            aux_carta = -1;
                            while(true){
                                try{
                                    aux_carta = Integer.parseInt(JOptionPane.showInputDialog("JOGADOR 3, DIGITE O NUMERO DA CARTA: "));
                                    if(aux_carta != equipe2.jogador1.carta1 && aux_carta != equipe2.jogador1.carta2 && aux_carta != equipe2.jogador1.carta3)
                                        JOptionPane.showMessageDialog(null, "Carta Invalida, digite novamente");
                                    else
                                    {
                                        if(aux_carta == equipe2.jogador1.carta1){
                                            rodada.jogaCarta(equipe2.jogador1.carta1, 3, false);
                                            //jg3_cartas.remove(jg3_carta1);
                                            jg3_carta1.setText("");
                                            equipe2.jogador1.carta1 = -2;
                                        } else if(aux_carta == equipe2.jogador1.carta2){
                                            rodada.jogaCarta(equipe2.jogador1.carta2, 3, false);
                                            jg3_carta2.setText("");
                                            equipe2.jogador1.carta2 = -2;
                                            //jg3_cartas.remove(jg3_carta2);
                                        } else if(aux_carta == equipe2.jogador1.carta3){
                                            rodada.jogaCarta(equipe2.jogador1.carta3, 3, false);
                                            jg3_carta3.setText("");
                                            equipe2.jogador1.carta3 = -2;
                                            //jg3_cartas.remove(jg3_carta3);
                                        }
                                        equipe2.jogador1.prox = false;
                                        equipe1.jogador2.prox = true;
                                        break;
                                    }
                                } catch(Exception e){
                                   JOptionPane.showMessageDialog(null, "Carta Invalida, digite novamente");
                                }
                            }
                            
                        } else {
                            aux_carta = -1;
                            while(true){
                                try{
                                    aux_carta = Integer.parseInt(JOptionPane.showInputDialog("JOGADOR 4, DIGITE O NUMERO DA CARTA: "));
                                    if(aux_carta != equipe2.jogador2.carta1 && aux_carta != equipe2.jogador2.carta2 && aux_carta != equipe2.jogador2.carta3)
                                        JOptionPane.showMessageDialog(null, "Carta Invalida, digite novamente");
                                    else
                                    {
                                        if(aux_carta == equipe2.jogador2.carta1){
                                            rodada.jogaCarta(equipe2.jogador2.carta1, 4, false);
                                            jg4_carta1.setText("");
                                            equipe2.jogador2.carta1 = -2;
                                            //jg4_cartas.remove(jg4_carta1);
                                        } else if(aux_carta == equipe2.jogador2.carta2){
                                            rodada.jogaCarta(equipe2.jogador2.carta2, 4, false);
                                            //jg4_cartas.remove(jg4_carta2);
                                            jg4_carta2.setText("");
                                            equipe2.jogador2.carta2 = -2;
                                        } else if(aux_carta == equipe2.jogador2.carta3){
                                            rodada.jogaCarta(equipe2.jogador2.carta3, 4, false);
                                            //jg4_cartas.remove(jg4_carta3);
                                            jg4_carta3.setText("");
                                            equipe2.jogador2.carta3 = -2;
                                        }
                                        equipe2.jogador2.prox = false;
                                        equipe1.jogador1.prox = true;
                                        break;
                                    }
                                } catch(Exception e){
                                   JOptionPane.showMessageDialog(null, "Carta Invalida, digite novamente");
                                }
                            }
                            
                        }
                        rodadaMini++;
                    }
                   
                    if(rodada.ganhador == 1){
                        equipe1.jogador1.prox = true;
                        equipe1.jogador2.prox = false;
                        equipe2.jogador1.prox = false;
                        equipe2.jogador2.prox = false;
                        equipe1.rodadas++;
                    }
                    else if(rodada.ganhador == 2){
                        equipe1.jogador1.prox = false;
                        equipe1.jogador2.prox = true;
                        equipe2.jogador1.prox = false;
                        equipe2.jogador2.prox = false;
                        equipe1.rodadas++;
                    } else if(rodada.ganhador == 3){
                        equipe1.jogador1.prox = false;
                        equipe1.jogador2.prox = false;
                        equipe2.jogador1.prox = true;
                        equipe2.jogador2.prox = false;
                        equipe2.rodadas++;
                    } else if (rodada.ganhador == 4){
                        equipe1.jogador1.prox = false;
                        equipe1.jogador2.prox = false;
                        equipe2.jogador1.prox = false;
                        equipe2.jogador2.prox = true;
                        equipe2.rodadas++;
                    }
                    
                    nRodadasPqn++;
                }
                if(equipe1.rodadas > equipe2.rodadas){
                    equipe1.ganhouRodada(rodada.pontos);
                } else if(equipe1.rodadas < equipe2.rodadas){
                    equipe2.ganhouRodada(rodada.pontos);
                }
                
                jogador1.remove(jg1_cartas);
                jogador2.remove(jg2_cartas);
                jogador3.remove(jg3_cartas);
                jogador4.remove(jg4_cartas);
                
            }
            
        if(equipe1.pontos > 11){
            JOptionPane.showMessageDialog(null, "EQUIPE 1 GANHOU");
        } else if(equipe2.pontos > 11){
            JOptionPane.showMessageDialog(null, "EQUIPE 2 GANHOU");
        }
                    
                        
                        
        /*jg1_carta1.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("1");            
            }
        });

        jg1_carta2.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("2");             
            }
        });

        jg1_carta3.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("3");           
            }
        });*/
        
    }
}

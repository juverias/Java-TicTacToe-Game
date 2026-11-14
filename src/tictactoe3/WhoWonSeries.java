/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe3;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author JShaikh
 */
public class WhoWonSeries {
    JFrame jf;
    JLabel jl;
    
    WhoWonSeries(String message){
        jf=new JFrame("TicTacToe Game - Juveria");
        jf.setSize(600, 600);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(3);
        
        jl=new JLabel(message);
        jl.setBounds(130, 230, 500, 50);
        jl.setFont(new Font("Arial",1,30));
        jl.setForeground(Color.red);
        jf.add(jl);
        
        jf.setVisible(true);
    }
    
    
}

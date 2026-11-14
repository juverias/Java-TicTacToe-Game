/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe2;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author JShaikh
 */
public class UserPanel implements ActionListener{
    JFrame jf;
    JLabel jl1 , jl2;
    JTextField jtf1 , jtf2;
    JButton jb1;

    public UserPanel() {
        jf=new JFrame("TicTacToe Game - Juveria");
        jf.setSize(600, 600);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(3);
        
        jl1=new JLabel("Enter Player 01 : ");
        jl1.setBounds(100, 20, 195, 190);
        jf.add(jl1);
        
        jtf1= new JTextField();
        jtf1.setBounds(240,95,200,40);
        jf.add(jtf1);
        
        jl2=new JLabel("Enter Player 02 : ");
        jl2.setBounds(100, 120, 195, 190);
        jf.add(jl2);
        
        jtf2= new JTextField();
        jtf2.setBounds(240,190,200,40);
        jf.add(jtf2);
        
        jb1=new JButton("Start Game");
        jb1.setBounds(260, 300, 100, 50);
        jb1.addActionListener(this);
        jf.add(jb1);
        
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb1){
            String p1 = jtf1.getText();
            String p2=jtf2.getText();
            GamePanel gp = new GamePanel(p1,p2);
            gp.openGamePanel();
            jf.setVisible(false);
        }
    }
    
    
}

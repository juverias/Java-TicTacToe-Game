/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe3;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author JShaikh
 */
public class UserPanel implements ActionListener{
    JFrame jf;
    JLabel jl1 , jl2 , jl3;
    JTextField jtf1 , jtf2 ;
    JComboBox jcb;
    JButton jb1;

    public UserPanel() {
        jf=new JFrame("TicTacToe Game - Juveria");
        jf.setSize(600, 600);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(3);
        
        jl1=new JLabel("Enter Player 01 : ");
        jl1.setBounds(60, 20, 195, 190);
        jl1.setFont(new Font("Arial",1,15));
        jf.add(jl1);
        
        jtf1= new JTextField();
        jtf1.setBounds(255,95,250,40);
        jf.add(jtf1);
        
        jl2=new JLabel("Enter Player 02 : ");
        jl2.setBounds(60, 110, 195, 190);
        jl2.setFont(new Font("Arial",1,15));
        jf.add(jl2);
        
        jtf2= new JTextField();
        jtf2.setBounds(255,190,250,40);
        jf.add(jtf2);
        
        jl3=new JLabel("Select Number of Series : ");
        jl3.setBounds(60, 210, 195 , 190);
        jl3.setFont(new Font("Arial",1,15));
        jf.add(jl3);
        
        String[] series={"3","5","7","9"};
        jcb= new JComboBox(series);
        jcb.setBounds(255,280,250,40);
        jf.add(jcb);
        
        jb1=new JButton("Start Game");
        jb1.setBounds(200, 400, 200, 50);
        jb1.setFont(new Font("Arial",1,20));
        jb1.addActionListener(this);
        jf.add(jb1);
        
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb1){
            String p1 = jtf1.getText();
            String p2=jtf2.getText();
            String series = (String)jcb.getSelectedItem();
            GamePanel gp = new GamePanel(p1,p2,Integer.parseInt(series));
            gp.openGamePanel();
            jf.setVisible(false);
        }
    }
    
    
}

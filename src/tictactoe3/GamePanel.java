/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe3;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author JShaikh
 */
public class GamePanel implements ActionListener {

    JFrame jf;
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;
    String xo_value = "", title_str = "X";
    String player_who_wins, p1, p2;

    int count = 0;
    Color color;

    boolean win = false;
    boolean player1_turn = true;
    int total_series;
    int series_count=1;
    
    int p1_win_count=0 ,p2_win_Count=0;

    public GamePanel(String player1, String player2 , int total_series) {
        this.p1 = player1;
        this.p2 = player2;
        this.total_series=total_series;
    }

    public void openGamePanel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel( "javax.swing.plaf.nimbus.NimbusLookAndFeel");
            //UIManager.getSystemLookAndFeelClassName()---> by default 
        } catch (Exception e) {
            System.out.println(e);
        }

        jf = new JFrame();
        jf.setTitle(p1 + " ( " + title_str + " ) " + " Turn");
        jf.setSize(600, 600);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(new GridLayout(3, 3)); // layout will grow and shrink as per size , automatically adjusts

        jb1 = new JButton();
        //jb1.setBounds(0, 0, 195, 190);
        jb1.addActionListener(this);
        jf.add(jb1);

        jb2 = new JButton();
        //jb2.setBounds(195, 0, 195, 190);
        jb2.addActionListener(this);
        jf.add(jb2);

        jb3 = new JButton();
        //jb3.setBounds(390, 0, 195, 190);
        jb3.addActionListener(this);
        jf.add(jb3);

        jb4 = new JButton();
        //jb4.setBounds(0, 190, 195, 190);
        jb4.addActionListener(this);
        jf.add(jb4);

        jb5 = new JButton();
        //jb5.setBounds(195, 190, 195, 190);
        jb5.addActionListener(this);
        jf.add(jb5);

        jb6 = new JButton();
        //jb6.setBounds(390, 190, 195, 190);
        jb6.addActionListener(this);
        jf.add(jb6);

        jb7 = new JButton();
        //jb7.setBounds(0, 380, 195, 190);
        jb7.addActionListener(this);
        jf.add(jb7);

        jb8 = new JButton();
        //jb8.setBounds(195, 380, 195, 190);
        jb8.addActionListener(this);
        jf.add(jb8);

        jb9 = new JButton();
        //jb9.setBounds(390, 380, 195, 190);
        jb9.addActionListener(this);
        jf.add(jb9);

        jf.setVisible(true); // Should always be written at last , since we want all the added elements to be displayed 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count = count + 1;
        //System.out.println(count);
        if (player1_turn == true) {
            xo_value = "X"; // box character 
            color = Color.DARK_GRAY;
            
            title_str = "O"; // will change after player 1 finishes 
            jf.setTitle(p2 + " ( " + title_str + " ) " + " Turn");
            player1_turn = false;
        } else {
            xo_value = "O"; // if divisible by 2  
            color = Color.BLUE;
            
            title_str = "X"; // will chnage after player 2 finishes
            jf.setTitle(p1 + " ( " + title_str + " ) " + " Turn");
            player1_turn = true;
        }
        if (e.getSource() == jb1) {
            jb1.setFont(new Font("Arial", 1, 90));
            jb1.setText(xo_value);
            jb1.setBackground(color);
            jb1.setEnabled(false); // wont work if used once , will become non clickable 
        }
        if (e.getSource() == jb2) {
            Font f = new Font("Arial", 1, 90);
            jb2.setText(xo_value);
            jb2.setFont(f);
            jb2.setBackground(color);
            jb2.setEnabled(false);
        }
        if (e.getSource() == jb3) {
            Font f = new Font("Arial", 1, 90);
            jb3.setText(xo_value);
            jb3.setFont(f);
            jb3.setBackground(color);
            jb3.setEnabled(false);
        }
        if (e.getSource() == jb4) {
            Font f = new Font("Arial", 1, 90);
            jb4.setText(xo_value);
            jb4.setFont(f);
            jb4.setBackground(color);
            jb4.setEnabled(false);
        }
        if (e.getSource() == jb5) {
            Font f = new Font("Arial", 1, 90);
            jb5.setText(xo_value);
            jb5.setFont(f);
            jb5.setBackground(color);
            jb5.setEnabled(false);
        }
        if (e.getSource() == jb6) {
            Font f = new Font("Arial", 1, 90);
            jb6.setText(xo_value);
            jb6.setFont(f);
            jb6.setBackground(color);
            jb6.setEnabled(false);
        }
        if (e.getSource() == jb7) {
            Font f = new Font("Arial", 1, 90);
            jb7.setText(xo_value);
            jb7.setFont(f);
            jb7.setBackground(color);
            jb7.setEnabled(false);
        }
        if (e.getSource() == jb8) {
            Font f = new Font("Arial", 1, 90);
            jb8.setText(xo_value);
            jb8.setFont(f);
            jb8.setBackground(color);
            jb8.setEnabled(false);
        }
        if (e.getSource() == jb9) {
            Font f = new Font("Arial", 1, 90);
            jb9.setText(xo_value);
            jb9.setFont(f);
            jb9.setBackground(color);
            jb9.setEnabled(false);
        }
        winningPossibilities();
        whoWins();
    }

    void winningPossibilities() {

        // Horizontal winning possibilities
        if (!jb1.getText().isEmpty() && jb1.getText().equals(jb2.getText()) && jb2.getText().equals(jb3.getText())) {
            win = true;
        } else if (!jb4.getText().isEmpty() && jb4.getText().equals(jb5.getText()) && jb5.getText().equals(jb6.getText())) {
            win = true;
        } else if (!jb7.getText().isEmpty() && jb7.getText().equals(jb8.getText()) && jb8.getText().equals(jb9.getText())) {
            win = true;
        } // Vertical winning possibilities
        else if (!jb1.getText().isEmpty() && jb1.getText().equals(jb4.getText()) && jb4.getText().equals(jb7.getText())) {
            win = true;
        } else if (!jb2.getText().isEmpty() && jb2.getText().equals(jb5.getText()) && jb5.getText().equals(jb8.getText())) {
            win = true;
        } else if (!jb3.getText().isEmpty() && jb3.getText().equals(jb6.getText()) && jb6.getText().equals(jb9.getText())) {
            win = true;
        } // Diagonal winning possibilities
        else if (!jb1.getText().isEmpty() && jb1.getText().equals(jb5.getText()) && jb5.getText().equals(jb9.getText())) {
            win = true;
        } else if (!jb3.getText().isEmpty() && jb3.getText().equals(jb5.getText()) && jb5.getText().equals(jb7.getText())) {
            win = true;
        } else {
            win = false;
        }
    }

    void whoWins() {
        if (win == true) {
             series_count=series_count+1;
            if (xo_value.equals("X")) {
                player_who_wins = p1;
                p1_win_count=p1_win_count+1;
            } else {
                player_who_wins = p2;
                p2_win_Count=p2_win_Count+1;
            }
            String win_title = player_who_wins + "( " + xo_value + " )" + " wins";
            jf.setTitle(win_title);
            JOptionPane.showMessageDialog(jf, win_title);
            restartGame();
        } else if (win == false && count == 9) {
            series_count=series_count+1;
            JOptionPane.showMessageDialog(jf, "Match is draw");
            restartGame();
        }
    }

    void restartGame() {
        if(total_series>=series_count){
            int i = JOptionPane.showConfirmDialog(jf, "Do u want to restart the game ? "); // yes : 0 no : 1 cancel : 2 , close button -1
        if (i == 0) {
            jb1.setText("");
            jb2.setText("");
            jb3.setText("");
            jb4.setText("");
            jb5.setText("");
            jb6.setText("");
            jb7.setText("");
            jb8.setText("");
            jb9.setText("");

            jb1.setBackground(null);
            jb2.setBackground(null);
            jb3.setBackground(null);
            jb4.setBackground(null);
            jb5.setBackground(null);
            jb6.setBackground(null);
            jb7.setBackground(null);
            jb8.setBackground(null);
            jb9.setBackground(null);

            btnEnabling(true);
            count = 0;
            win = false;

            if (player_who_wins.equals(p1)) {
                player1_turn = true;
            } else {
                player1_turn = false;
            }
            jf.setTitle(player_who_wins + "( " + xo_value + " )" + " Turn");

        } else if (i == 1) {
            System.exit(0); // Shutdowns JVM , so app will be close automatically 
        } else {
            btnEnabling(false);
        }
      }else{
            JOptionPane.showMessageDialog(jf,"Series Completed........");
            if(p1_win_count>p2_win_Count){
                //JOptionPane.showMessageDialog(jf,p1+" Won the Match");
                new WhoWonSeries(p1+" Won the Match");
                jf.setVisible(false);
            }else if(p2_win_Count>p1_win_count){
                // JOptionPane.showMessageDialog(jf,p2+" Won the Match");
                new WhoWonSeries(p2+" Won the Match");
                jf.setVisible(false);
            }else{
                //JOptionPane.showMessageDialog(jf," Series is Draw");
                new WhoWonSeries(" Series is Draw  ");
                jf.setVisible(false);
            }
        }
        
    }

    void btnEnabling(Boolean b) {
        // incase if someone wins so dont take input on cancel 
        jb1.setEnabled(b);
        jb2.setEnabled(b);
        jb3.setEnabled(b);
        jb4.setEnabled(b);
        jb5.setEnabled(b);
        jb6.setEnabled(b);
        jb7.setEnabled(b);
        jb8.setEnabled(b);
        jb9.setEnabled(b);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe;

import javax.swing.JFrame;

/**
 *
 * @author JShaikh
 */
public class OtherJFrameApproach extends JFrame{

    public OtherJFrameApproach() {
        setSize(600, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
    }
    
    public static void main(String[] args) {
        new OtherJFrameApproach();
    }
    
}

// Approach used incase we dont have more than 1 Parent class , but will contain extra methods too
// In 2nd Approach we just create Object Reference and access the required methods only 
package Source;

import GUI.Inicio;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class main {
    public static void main(String[] args){
        Inicio calculadora=new Inicio();
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculadora.setSize(705, 450);
        calculadora.setLocationRelativeTo(null);
        calculadora.setResizable(false);
        calculadora.setVisible(true);
    }
}

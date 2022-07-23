/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author David
 */
public class Inicio extends JFrame{
    
    private JLabel imagenF;
    private JLabel imagenB;
    private JButton botonI;
    public Inicio(){
        super("Resistor Calc");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icono.png")).getImage());
        setLayout(null);
        
        imagenF=new JLabel(new ImageIcon(getClass().getResource("/Imagenes/Fondo.png")));
        imagenF.setBounds(0, 0, 700, 430);
        imagenB=new JLabel(new ImageIcon(getClass().getResource("/Imagenes/Bienvenido.png")));
        imagenB.setBounds(175,178,350,42);
        imagenB.setToolTipText("Bienvenido");
        botonI=new JButton(new ImageIcon(getClass().getResource("/Imagenes/BotonI1.png")));
        botonI.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/BotonI2.png")));
        botonI.setToolTipText("Continuar");
        botonI.setBorderPainted(false);
        botonI.setContentAreaFilled(false);
        botonI.setMargin(new Insets(-3,-3,-3,-3));
        botonI.setBounds(276, 344,142,31);
        add(botonI);
        add(imagenB);
        add(imagenF);
        ManejadorBoton manejador = new ManejadorBoton();
        botonI.addActionListener( manejador );
    }
    private class ManejadorBoton implements ActionListener 
    {
      // maneja evento de bot�n
      @Override
      public void actionPerformed( ActionEvent evento )
      {
          getContentPane().setVisible(false);
          getContentPane().removeAll();
          
          ResC menu=new ResC(imagenF);
          menu.setBounds(0, 0, 700, 430);
          add(menu);
          getContentPane().setVisible(true);
      } // fin del m�todo actionPerformed
    } // fin de la clase interna privada ManejadorBoton
    
}

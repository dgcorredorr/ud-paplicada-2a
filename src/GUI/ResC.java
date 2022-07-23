/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.Color;
import java.awt.Container;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import static java.lang.Math.pow;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author David
 */
public class ResC extends Container {
    private int band1, band2, band3,band4;
    private double band3aux, mili,ohm,kilo,mega;
    private ArrayList<String> arrayTolerancia;
    private JButton boton1,boton2,boton11,boton12,boton21,boton22,boton31,boton32,boton41,boton42,boton51,boton52;
    private JLabel sombra, resistor,label, escudoUD,Banda1,Banda2,Banda3,Banda4,Banda5,unidad,decena,centena,multiplicador,tolerancia;
    private JComboBox conversion;
    public ResC(JLabel fondo) {
        setLayout(null);
        arrayTolerancia=new ArrayList<>();
        //{"±10%","±5%","±1%","±2%","±0.5%","±0.25%","±0.1%"}
        arrayTolerancia.add("±10%");
        arrayTolerancia.add("±5%");
        arrayTolerancia.add("±1%");
        arrayTolerancia.add("±2%");
        arrayTolerancia.add("±0.5%");
        arrayTolerancia.add("±0.25%");
        arrayTolerancia.add("±0.1%");
        label=new JLabel();
        label.setBounds(300, 250, 300, 20);
        label.setForeground(Color.white);
        add(label);
        conversion=new JComboBox();
        conversion.setToolTipText("Conversor de Unidades");
        conversion.addItem("mΩ");
        conversion.addItem("Ω");
        conversion.addItem("KΩ");
        conversion.addItem("MΩ");
        conversion.setSelectedIndex(1);
        conversion.setBounds(530, 205, 100, 20);
        add(conversion);
        JLabel resultado = new JLabel(new ImageIcon(getClass().getResource("/Imagenes/resultado.png")));
        resultado.setBounds(300, 220, 152,20);
        add(resultado);
        JLabel fondoR = new JLabel(new ImageIcon(getClass().getResource("/Imagenes/fondoR.png")));
        fondoR.setBounds(285, 205, 180,81);
        add(fondoR);
        sombra=new JLabel(new ImageIcon(getClass().getResource("/Imagenes/sombra.png")));
        sombra.setBounds(387, 131, 214,46);
        add(sombra);
        unidad=new JLabel("UNIDAD");
        unidad.setForeground(Color.white);
        unidad.setBounds(125,160,100,20);
        add(unidad);
        decena=new JLabel("DECENA");
        decena.setForeground(Color.white);
        decena.setBounds(125,110,100,20);
        add(decena);
        multiplicador=new JLabel("MÚLTIPLO");
        multiplicador.setForeground(Color.white);
        multiplicador.setBounds(115,210,100,20);
        add(multiplicador);
        tolerancia=new JLabel("TOLERANCIA");
        tolerancia.setForeground(Color.white);
        tolerancia.setBounds(110,260,100,20);
        add(tolerancia);
        Banda1=new JLabel(new ImageIcon(getClass().getResource("/Imagenes/Banda1-0.png")));
        Banda1.setToolTipText("Decena");
        Banda1.setBounds(410, 100, 22,80);
        add(Banda1);
        Banda2=new JLabel(new ImageIcon(getClass().getResource("/Imagenes/Banda-0.png")));
        Banda2.setToolTipText("Unidad");
        Banda2.setBounds(453, 107, 22,65);
        add(Banda2);
        Banda3=new JLabel(new ImageIcon(getClass().getResource("/Imagenes/Banda-8.png")));
        Banda3.setToolTipText("Multiplicador");
        Banda3.setBounds(498, 107, 22,65);
        add(Banda3);
        Banda4=new JLabel(new ImageIcon(getClass().getResource("/Imagenes/Banda5-0.png")));
        Banda4.setToolTipText("Tolerancia");
        Banda4.setBounds(569, 100, 8,80);
        add(Banda4);
        boton11=new JButton(new ImageIcon(getClass().getResource("/Imagenes/Boton11.png")));
        boton11.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton12.png")));
        boton11.setToolTipText("-");
        boton11.setBorderPainted(false);
        boton11.setContentAreaFilled(false);
        boton11.setMargin(new Insets(-3,-3,-3,-3));
        boton11.setBounds(50, 100,40,40);
        add(boton11);
        boton12=new JButton(new ImageIcon(getClass().getResource("/Imagenes/Boton21.png")));
        boton12.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton22.png")));
        boton12.setToolTipText("+");
        boton12.setBorderPainted(false);
        boton12.setContentAreaFilled(false);
        boton12.setMargin(new Insets(-3,-3,-3,-3));
        boton12.setBounds(205, 100,40,40);
        add(boton12);
        boton21=new JButton(new ImageIcon(getClass().getResource("/Imagenes/Boton11.png")));
        boton21.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton12.png")));
        boton21.setToolTipText("-");
        boton21.setBorderPainted(false);
        boton21.setContentAreaFilled(false);
        boton21.setMargin(new Insets(-3,-3,-3,-3));
        boton21.setBounds(50, 150,40,40);
        add(boton21);
        boton22=new JButton(new ImageIcon(getClass().getResource("/Imagenes/Boton21.png")));
        boton22.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton22.png")));
        boton22.setToolTipText("+");
        boton22.setBorderPainted(false);
        boton22.setContentAreaFilled(false);
        boton22.setMargin(new Insets(-3,-3,-3,-3));
        boton22.setBounds(205, 150,40,40);
        add(boton22);
        boton31=new JButton(new ImageIcon(getClass().getResource("/Imagenes/Boton11.png")));
        boton31.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton12.png")));
        boton31.setToolTipText("-");
        boton31.setBorderPainted(false);
        boton31.setContentAreaFilled(false);
        boton31.setMargin(new Insets(-3,-3,-3,-3));
        boton31.setBounds(50, 200,40,40);
        add(boton31);
        boton32=new JButton(new ImageIcon(getClass().getResource("/Imagenes/Boton21.png")));
        boton32.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton22.png")));
        boton32.setToolTipText("+");
        boton32.setBorderPainted(false);
        boton32.setContentAreaFilled(false);
        boton32.setMargin(new Insets(-3,-3,-3,-3));
        boton32.setBounds(205, 200,40,40);
        add(boton32);
        boton41=new JButton(new ImageIcon(getClass().getResource("/Imagenes/Boton11.png")));
        boton41.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton12.png")));
        boton41.setToolTipText("-");
        boton41.setBorderPainted(false);
        boton41.setContentAreaFilled(false);
        boton41.setMargin(new Insets(-3,-3,-3,-3));
        boton41.setBounds(50, 250,40,40);
        add(boton41);
        boton42=new JButton(new ImageIcon(getClass().getResource("/Imagenes/Boton21.png")));
        boton42.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton22.png")));
        boton42.setToolTipText("+");
        boton42.setBorderPainted(false);
        boton42.setContentAreaFilled(false);
        boton42.setMargin(new Insets(-3,-3,-3,-3));
        boton42.setBounds(205, 250,40,40);
        add(boton42);
        resistor=new JLabel(new ImageIcon(getClass().getResource("/Imagenes/Resistor.png")));
        resistor.setToolTipText("Resistor");
        resistor.setBounds(300, 100, 374,80);
        add(resistor);
        escudoUD=new JLabel(new ImageIcon(getClass().getResource("/Imagenes/escudoUD.png")));
        escudoUD.setToolTipText("Escudo UDFJC");
        escudoUD.setBounds(500, 225, 164,160);
        ManejadorBoton manejadorB=new ManejadorBoton();
        boton1 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/BotonIcon1A.png")));
        boton1.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/BotonIcon1.png")));
        boton1.setToolTipText("Calcular");
        boton1.setBorderPainted(false);
        boton1.setContentAreaFilled(false);
        boton1.setMargin(new Insets(-3,-3,-3,-3));
        boton1.setBounds(50, 344,123,31);
        boton2 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/BotonIcon2A.png")));
        boton2.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/BotonIcon2.png")));
        boton2.setToolTipText("Salir");
        boton2.setBorderPainted(false);
        boton2.setContentAreaFilled(false);
        boton2.setMargin(new Insets(-3,-3,-3,-3));
        boton2.setBounds(200, 344,123,31);
        add(boton1);
        add(boton2);
        boton1.addActionListener(manejadorB);
        boton2.addActionListener(manejadorB);
        boton11.addActionListener(manejadorB);
        boton12.addActionListener(manejadorB);
        boton22.addActionListener(manejadorB);
        boton21.addActionListener(manejadorB);
        boton31.addActionListener(manejadorB);
        boton32.addActionListener(manejadorB);
        boton41.addActionListener(manejadorB);
        boton42.addActionListener(manejadorB);
        ManejadorComboBox manejadorCB=new ManejadorComboBox();
        conversion.addItemListener(manejadorCB);
        add(escudoUD);
        add(fondo);
        
    }
    private String calculo(){
        String cadena=String.valueOf(band1)+String.valueOf(band2);
        double valor=Double.parseDouble(cadena)*band3aux;
        return String.valueOf(valor)+arrayTolerancia.get(band4);
    }
    private void cambiarband1(boolean b){
        if(b){
            if(band1==9){

            }else{
            band1+=1;
            }

        } else{
            if(band1==0){

            }else{
            band1-=1;
            }
        }

        if(band1==0){
            Banda1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda1-0.png")));
        }else if(band1==1){
            Banda1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda1-1.png")));
        }else if(band1==2){
            Banda1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda1-2.png")));
        }else if(band1==3){
            Banda1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda1-3.png")));
        }else if(band1==4){
            Banda1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda1-4.png")));
        }else if(band1==5){
            Banda1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda1-5.png")));
        }else if(band1==6){
            Banda1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda1-6.png")));
        }else if(band1==7){
            Banda1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda1-7.png")));
        }else if(band1==8){
            Banda1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda1-8.png")));
        }else if(band1==9){
            Banda1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda1-9.png")));
        }
    
    }
    private void cambiarband2(boolean b){
        if(b){
            if(band2==9){

            }else{
            band2+=1;
            }

        } else{
            if(band2==0){

            }else{
            band2-=1;
            }
        }

        if(band2==0){
            Banda2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-0.png")));
        }else if(band2==1){
            Banda2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-1.png")));
        }else if(band2==2){
            Banda2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-2.png")));
        }else if(band2==3){
            Banda2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-3.png")));
        }else if(band2==4){
            Banda2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-4.png")));
        }else if(band2==5){
            Banda2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-5.png")));
        }else if(band2==6){
            Banda2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-6.png")));
        }else if(band2==7){
            Banda2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-7.png")));
        }else if(band2==8){
            Banda2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-8.png")));
        }else if(band2==9){
            Banda2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-9.png")));
        }
    
    }
    private void cambiarband3(boolean b){
        if(b){
            if(band3==9){

            }else{
            band3+=1;
            }

        } else{
            if(band3==0){

            }else{
            band3-=1;
            }
        }

        if(band3==0){
            band3aux=pow(10,-2);
            Banda3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-8.png")));
        }else if(band3==1){
            band3aux=pow(10,-1);
            Banda3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-10.png")));
        }else if(band3==2){
            band3aux=pow(10,0);
            Banda3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-0.png")));
        }else if(band3==3){
            band3aux=pow(10,1);
            Banda3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-1.png")));
        }else if(band3==4){
            band3aux=pow(10,2);
            Banda3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-2.png")));
        }else if(band3==5){
            band3aux=pow(10,3);
            Banda3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-3.png")));
        }else if(band3==6){
            band3aux=pow(10,4);
            Banda3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-4.png")));
        }else if(band3==7){
            band3aux=pow(10,5);
            Banda3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-5.png")));
        }else if(band3==8){
            band3aux=pow(10,6);
            Banda3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-6.png")));
        }else if(band3==9){
            band3aux=pow(10,7);
            Banda3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda-7.png")));
        }
    
    }
    private void cambiarband4(boolean b){
        if(b){
            if(band4==6){

            }else{
            band4+=1;
            }

        } else{
            if(band4==0){

            }else{
            band4-=1;
            }
        }

        if(band4==0){
            Banda4.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda5-0.png")));
        }else if(band4==1){
            Banda4.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda5-1.png")));
        }else if(band4==2){
            Banda4.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda5-2.png")));
        }else if(band4==3){
            Banda4.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda5-3.png")));
        }else if(band4==4){
            Banda4.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda5-4.png")));
        }else if(band4==5){
            Banda4.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda5-5.png")));
        }else if(band4==6){
            Banda4.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Banda5-6.png")));
        }
    
    }
    private class ManejadorComboBox implements ItemListener 
    {
      // maneja evento de combobox
      @Override
      public void itemStateChanged( ItemEvent evento )
      {
        if (evento.getSource()==conversion) {
            String seleccionado=(String)conversion.getSelectedItem();
            
            if(seleccionado.equals("mΩ")){
                label.setText(mili+arrayTolerancia.get(band4)+" mΩ");
            } else if (seleccionado.equalsIgnoreCase("Ω")){
               label.setText(ohm+arrayTolerancia.get(band4)+" Ω");
            }else if(seleccionado.equalsIgnoreCase("KΩ")){
                label.setText(kilo+arrayTolerancia.get(band4)+" KΩ");
            }else if (seleccionado.equals("MΩ")){
                label.setText(mega+arrayTolerancia.get(band4)+" MΩ");
            }
        }
      } // fin del m�todo itemPerformed
    } // fin de la clase interna privada ManejadorComboBox
    private class ManejadorBoton implements ActionListener 
    {
      // maneja evento de bot�n
      @Override
      public void actionPerformed( ActionEvent evento )
      {
          if (band1>=0&&band1<=9&&band2>=0&&band2<=9&&band3>=0&&band3<=9&&band4>=0&&band4<=6){
              if(evento.getSource()==boton11){
                  cambiarband1(false);
              } else if(evento.getSource()==boton12){
                  cambiarband1(true);
              } else if(evento.getSource()==boton21){
                  cambiarband2(false);
              } else if(evento.getSource()==boton22){
                  cambiarband2(true);
              } else if(evento.getSource()==boton31){
                  cambiarband3(false);
              } else if(evento.getSource()==boton32){
                  cambiarband3(true);
              } else if(evento.getSource()==boton41){
                  cambiarband4(false);
              } else if(evento.getSource()==boton42){
                  cambiarband4(true);
              } 
          }
          if (evento.getSource()==boton1){
              String cadena=String.valueOf(band1)+String.valueOf(band2);
              double valor=Double.parseDouble(cadena)*band3aux;
              conversion.setSelectedIndex(1);
              mili=valor*1000;
              ohm=valor;
              kilo=valor/1000;
              mega=valor/1000000;
              label.setText(calculo()+" Ω");
          } else if(evento.getSource()==boton2){
              System.exit(0);
          }
      } // fin del m�todo actionPerformed
    } // fin de la clase interna privada ManejadorBoton
          
}

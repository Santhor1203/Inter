/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package freddys;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author srg12
 */
public class Cantidad extends JFrame implements ActionListener {
    JButton btn3;
    JPanel BaG2,bag4,bag5;
    JLabel Immage2;
    JTextArea Menu;
    public Cantidad(){
                Immage2 = new JLabel();
    ImageIcon icon = new ImageIcon("C:\\Users\\srg12\\Documents\\NetBeansProjects\\Freddys\\src\\Imagenes\\Logo.png");
    Immage2.setIcon(icon);
    Immage2.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
        setTitle("Cantidad"); //Establece el título de la ventana
        setSize(600, 400); //Dimenciona la ventana (largo y ancho)
        setLayout(null); //Posicionamiento de los objetos
        cuerpo2(); //Llamada al método que contiene los componentes que conforman el  formulario
        this.setResizable(Boolean.FALSE); //Cambiar el tamaño del marco
        setLocationRelativeTo(null); //Posiciona la ventana en el centro
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Operación que se va a realizar, cuando se cierre la ventana
        setVisible(true); //Hace visible la ventana 
    }
    public final void cuerpo2(){
     //Fondos
    bag4 = new JPanel();
    bag4.setBackground(new Color (0,255,255));//Borde azul
    bag4.setBounds(15,15,550, 325);
    bag5 = new JPanel();
    bag5.setBackground(Color.black);
    bag5.setBounds(21,21,538, 310);
    BaG2 = new JPanel();
    BaG2.setBackground(Color.black);
    BaG2.setSize(600, 600);    
    //Botones
    btn3 = new JButton();
     btn3= new JButton("Siguiente");
     btn3.setBounds(400,250,100,25);
        //Mostrar
     Menu = new JTextArea();
     Menu.setBounds(25,25,200,200);
        
     
     add(Immage2);
     add(btn3);
     add(Menu);
     add(bag5);
     add(bag4);
     add(BaG2);
     btn3.addActionListener(this);
}
    @Override
     public void actionPerformed(ActionEvent e){
     if(e.getSource()==btn3);
     {
         JOptionPane.showMessageDialog(null,"Estas seguro de que quieres continuar?");
         Ingredientes ing= new Ingredientes();
         ing.setVisible(true);
         dispose();
     }
 }

}

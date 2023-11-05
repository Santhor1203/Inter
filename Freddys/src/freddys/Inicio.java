/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package freddys;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.*;
/**
 *
 * @author srg12
 */
public class Inicio extends JFrame implements ActionListener {
    JTextField Nombre;
    JPanel BaG,imag,bag2,bag3;
    JLabel txt1, txt2,Immage;
    JButton btn1, btn2;


 public Inicio(){
        setTitle("Inicio"); //Establece el título de la ventana
        setSize(600, 400); //Dimenciona la ventana (largo y ancho)
        setLayout(null); //Posicionamiento de los objetos
        cuerpo(); //Llamada al método que contiene los componentes que conforman el  formulario
        this.setResizable(Boolean.FALSE); //Cambiar el tamaño del marco
        setLocationRelativeTo(null); //Posiciona la ventana en el centro
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Operación que se va a realizar, cuando se cierre la ventana
        setVisible(true); //Hace visible la ventana 
        
    }
 
                
 public void cuerpo(){

    //Texto
     txt1= new JLabel("<html>Holaa¡ y bienvenido a freddy's fazbear pizza,<p> para comenzar con tu orden escribe tu nombre.");
     txt1.setForeground(Color.white);
     txt1.setBounds(170,100,300,30);
     bag2 = new JPanel();
     bag2.setBackground(new Color (0,255,255));//Borde azul
     bag2.setBounds(15,15,550, 325);
     bag3 = new JPanel();
     bag3.setBackground(Color.black);
     bag3.setBounds(21,21,538, 310);
     BaG = new JPanel();
     BaG.setBackground(Color.black);
     BaG.setSize(600, 600);
     //Imagenes 
    Immage = new JLabel();
    ImageIcon icon = new ImageIcon("C:\\Users\\srg12\\Documents\\NetBeansProjects\\Freddys\\src\\Imagenes\\Fondo1.png"); // Reemplaza "ruta_de_tu_imagen.png" con la ruta real de tu imagen
    Immage.setIcon(icon);
    Immage.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
     
     //Llenar
     Nombre = new JTextField();
     Nombre.setBounds(150,150,300,20);
     //Nombre.setBackground(new java.awt.Color(0,0,0,1));
     //Botones
     btn1= new JButton("Siguiente");
     btn1.setBounds(400,250,100,25);
     btn2=new JButton("Corregir");
     btn2.setBounds(100,250,100,25);
     
     //Agregar todo, Va por capas, lo de hasta abajo es la ultima capa
     add (txt1);
     add(Nombre);
    
     add(btn1);
     add(btn2);
       add(Immage);
     add(bag3);
     add(bag2);
    
     add(BaG);//Poner siempre al final de todos los add
     btn1.addActionListener(this);
     
     
    
 }
    @Override
 public void actionPerformed(ActionEvent e){
     if(e.getSource()==btn1);
     {
         JOptionPane.showMessageDialog(null,"Estas seguro de que quieres continuar?");
         Cantidad cant= new Cantidad();
         cant.setVisible(true);
         dispose();
     }
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Inicio ventana= new Inicio();    
 //TODO code application logic here
    }

    
    
}

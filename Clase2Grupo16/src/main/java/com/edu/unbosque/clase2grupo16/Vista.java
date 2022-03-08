/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase2grupo16;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class Vista extends JFrame implements ActionListener{

    JLabel etiqueta =new JLabel("Nombre: ");
    JTextField texto= new JTextField(20);
    JTextField numero= new JTextField(5);
    JButton boton= new JButton("Capturar");

    Vista(String nombre){
        
    this.setLayout(new GridLayout(2,2));
    JPanel lado1= new JPanel(new FlowLayout());
    this.setTitle(nombre);
    this.setSize(600,400);
    lado1.add(etiqueta);
    lado1.add(texto);
    lado1.add(numero);
    lado1.add(boton);
    boton.addActionListener(this);
    this.add(lado1);
    this.add(new JPanel());
    this.setVisible(true);
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton){
            String n=texto.getText();
            int num=Integer.parseInt(numero.getText());
            JOptionPane.showMessageDialog(null, "Nombre: "+n+"\nEdad:"+num);
        }
    }
}

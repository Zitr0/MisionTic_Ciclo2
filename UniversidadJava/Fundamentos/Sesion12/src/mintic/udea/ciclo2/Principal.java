/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.udea.ciclo2;

import java.awt.Color;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CREAR LOS OBJETOS DE GUI
        JFrame v = new JFrame("EJEMPLO DE VENTANA UDEA");
        JLabel etiTitulo = new JLabel("INICIAR SESION");
        JLabel etiEmail = new JLabel("EMAIL:");
        JLabel etiClave = new JLabel("CLAVE:");
        JTextField campoEmail = new JTextField();
        JPasswordField campoClave = new JPasswordField();
        JButton botonOk, botonCancelar;
        botonCancelar = new JButton("Cancelar");
        botonOk = new JButton("Entrar");
        
        // CONFIGURAR EL ESTADO E INVOCAR 
        // EL COMPORTAMIENTO DE LOS OBJETOS GUI
        // quitar el Gestor de diseño por defecto de la ventana
        v.setLayout(null);
        // configurar las coordenadas, el ancho y alto del componente
        etiTitulo.setBounds(50, 20, 250, 35);
        etiEmail.setBounds(50, (20+35+10), 100, 35);
        campoEmail.setBounds(150, (20+35+10), 100, 35);
        etiClave.setBounds(50, (60+35+10), 100, 35);
        campoClave.setBounds(150, (60+35+10), 100, 35);
        
        botonOk.setBounds(75, (120+35+10), 80, 35);
        botonCancelar.setBounds(160, (120+35+10), 90, 35);
        // Quitar la transparencia al componente
        // etiTitulo.setOpaque(true);
        // cambiar el color de fonde del componente
        // etiTitulo.setBackground(Color.BLUE);
        // cambiar el color de texto del componete
        etiTitulo.setForeground(Color.BLUE);
        // cambiar el tipo de letra al componente
        Font tipoDeLetra = new Font("Arial",Font.BOLD, 22);
        etiTitulo.setFont(tipoDeLetra);
        etiEmail.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
        etiClave.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
        // Centar el texto dentro de la etiqueta
        etiTitulo.setHorizontalAlignment(JLabel.CENTER);
        // agregamos el componente a la ventan 
        v.add(etiTitulo);
        v.add(etiEmail);
        v.add(campoEmail);
        v.add(etiClave);
        v.add(campoClave);
        v.add(botonOk);
        v.add(botonCancelar);
        // -- COLOCAR LA VENTANA EN LA PANTALLA
        // v.setLocation(500, 200);
        // COLOCAR EL TAMAÑO DE LA VENTAN
        v.setSize(400, 300);
        // Colocar la Ventana en el Centro de la pantalla
        v.setLocationRelativeTo(null);

        // -- MOSTRAR LA VENTANA EN LA PANTALLA
        // -- CAMBIAR EL COMPORTAMIENTO DEL CIERRE DE LA VENTANA
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setVisible(true);
        // CERRAR LA VENTANA POR COMPLETO
       // v.dispose();
        
    }
    
}

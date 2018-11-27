/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Renan
 */

import javax.swing.*;
import java.awt.*;

public class tela_inicio {
    
    public tela_inicio(){
        
    }
    
    public void iniciaComponentes(){
        
        JFrame telaIni = new JFrame();
        
        JTextField texto1 = new JTextField();
        JPanel painel1 = new JPanel();
        JLabel quadrado1 = new JLabel();
        JLabel quadrado2 = new JLabel();
        JTextField texto2 = new JTextField();
        JLabel quadrado3 = new JLabel();
        JTextField texto3 = new JTextField();
        
        telaIni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quadrado1.setText("Registro");
        quadrado2.setText("Nome:");
        quadrado3.setText("Idade:");
        
        telaIni.setVisible(true);
        
        
    }
    
}

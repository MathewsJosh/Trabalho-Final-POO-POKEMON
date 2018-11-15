/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexf;

import Treinadores.*;
import TiposDePokemon.*;
import Sons.*;
import pokedexf.*;
import Pokemons.*;
import javax.swing.JOptionPane;
import jplay.*;

/**
 *
 * @author Mathews
 */
public class PokedexF
{

    public static void main(String[] args)                          //Ganhar xp deve ser um random da função combate (se ganhar luta)
    {

        /*Mathews m = new Mathews();
        m.apresentaTreinador();
        
        Treinador t1= new Treinador();
        
        Bulbassauro b = new Bulbassauro();
        b.apresentarPokemon();
        System.out.println(b.atacar());
        */
        Window janela = new Window (424,290);
        GameImage plano = new GameImage("Trabalho-de-OO//PokedexF//src//recursos//Sprites//Menu.png");
        Keyboard teclado = janela.getKeyboard();
        
        while(true){
            plano.draw();
            janela.update();
            
            if(teclado.keyDown(Keyboard.ENTER_KEY)){
                JOptionPane.showMessageDialog(null,"funcionando");
            }
        }
        
        /* O JPlay é uma biblioteca para a criação de interface gráfica -
        https://www.youtube.com/watch?v=ntDvADUoMs8&list=PLnOrFdw5rkTzLcPRa_JKmpMqzNGIlLi3r&index=1 
        disponível nessas video aulas. A ideia aqui é criar um menu com um sprite já criado em uma das versões, mas no NetBeans
        está dando erro de resolução do display */
    }

}

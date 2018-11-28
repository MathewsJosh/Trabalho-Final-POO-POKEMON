/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexf;

import Interface.*;
import Treinadores.*;
import TiposDePokemon.*;
import Sons.*;
import pokedexf.*;
import Pokemons.*;

/**
 *
 * @author Mathews,Renan
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
      
        //TelaPrincipal telaPrincipal = new TelaPrincipal();
        //telaPrincipal.setVisible(true);
        Sel_Treinador d = new Sel_Treinador();
        d.setVisible(true);
 
        
    }

}

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
import Pokebolas.*;
import Pokemons.*;


/**
 *
 * @author Mathews
 */
public class PokedexF
{

    public static void main(String[] args)                          //Ganhar xp deve ser um random da função combate (se ganhar luta)
    {
        Treinador p1=new Treinador();
        p1.apresentaTreinador();
        p1.ganharXpT(500);
        
        Mathews m= new Mathews();
        m.apresentaTreinador();
        Bulbassauro b= new Bulbassauro();
        b.emitesom();
        
        
    }
    
}

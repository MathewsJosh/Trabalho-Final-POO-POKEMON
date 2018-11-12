/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexf;

import TiposDePokemon.*;
import Sons.*;
import java.util.Random;
import pokedexf.*;

/**
 *
 * @author Mathews
 */
public abstract class Pokemon
{
    protected String nome;
    protected char sexo;
    protected int nivel;
    protected float peso;
    protected int xp;
    protected String som;

    protected int hp;
    protected int ataque;
    protected int defesa;
    protected int ataqueEspecial;
    protected int defesaEspecial;
    protected int velocidade;
    

    protected static int pp = 100; //Mana

    public Pokemon()
    {
    }

    public void treinar()
    {
    }



    //public void emiteSom();
}

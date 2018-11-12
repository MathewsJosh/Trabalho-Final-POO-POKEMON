/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import TiposDePokemon.*;
import pokedexf.*;
import Sons.*;

/**
 *
 * @author Renan
 */
public class Charmander extends Pokemon implements Fogo
{

    protected int hp;
    protected int ataque;
    protected int defesa;
    protected int ataqueEspecial;
    protected int defesaEspecial;
    protected int velocidade;
    protected static int pp;
//Utilizar pp como "mana" provavelnte terá valor 20

    public Charmander()
    {
        this.hp = 188;
        this.ataque = 98;
        this.defesa = 81;
        this.ataqueEspecial = 112;
        this.defesaEspecial = 94;
        this.velocidade = 121;
    }

    /**
     * Sobrescrição da Classe Mãe
     *
     * Função: Tocar o Som do Pokemon
     *
     * @author Mathews
     */
    @Override
    public void emitesom()
    {
        TocarSom som = new TocarSom();
        som.play("CharmanderSound");
    }

    @Override
    public int ember()
    {
        System.out.println("Cospe fogo");
        return -40;
    }

    @Override
    public int fireBlast()
    {
        System.out.println("Raio de fogo");
        return -70;
    }

    @Override
    public int fireSpin()
    {
        System.out.println("Espiral de fogo");
        return -15;
    }

    @Override
    public int inferno()
    {
        System.out.println("Queima o oponente");
        return -100;
    }

}

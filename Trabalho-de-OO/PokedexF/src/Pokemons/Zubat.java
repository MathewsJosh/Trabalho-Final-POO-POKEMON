/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import TiposDePokemon.*;
import Sons.*;
import pokedexf.*;

/**
 *
 * @author Mathews
 */
public class Zubat extends Pokemon implements Veneno, Voador
{
    protected int hp;
    protected int ataque;
    protected int defesa;
    protected int ataqueEspecial;
    protected int defesaEspecial;
    protected int velocidade;
    protected static int pp;

    public Zubat()
    {
        this.hp = 190;
        this.ataque = 85;
        this.defesa = 67;
        this.ataqueEspecial = 58;
        this.defesaEspecial = 76;
        this.velocidade = 103;
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
        som.play("SquirtleSound");
    }

    /**
     * Sobrescrição da Interface Veneno
     *
     * Função: Definir ataques especiais
     *
     * @author Mathews
     * @return
     */
    @Override
    public int acid()
    {
        return 1;
    }

    @Override
    public int poisonSting()
    {
        return 1;
    }

    @Override
    public int toxic()
    {
        return 1;
    }

    /**
     * Sobrescrição da Interface Voador
     *
     * Função: Definir ataques especiais
     *
     * @author Mathews
     * @return
     */
    @Override
    public int aerialAce()
    {
        return 1;
    }

    @Override
    public int airCutter()
    {
        return 1;
    }

    @Override
    public int drillPeck()
    {
        return 1;
    }

    @Override
    public int hurricane()
    {
        return 1;
    }
}

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
public class Diglett extends Pokemon implements Terra
{
    protected int hp;
    protected int ataque;
    protected int defesa;
    protected int ataqueEspecial;
    protected int defesaEspecial;
    protected int velocidade;
    protected static int pp;

    public Diglett()
    {
        this.hp = 130;
        this.ataque = 103;
        this.defesa = 49;
        this.ataqueEspecial = 67;
        this.defesaEspecial = 85;
        this.velocidade = 175;
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
        som.play("OddishSound");
    }
    /**
     * Sobrescrição da Interface Terra
     *
     * Função: Definir ataques especiais
     *
     * @author Mathews
     * @return
     */
    @Override
    public int sandAttack()
    {
        return 1;
    }

    @Override
    public int mudSlap()
    {
        return 1;
    }

    @Override
    public int magnitude()
    {
        return 1;
    }

    @Override
    public int bulldoze()
    {
        return 1;
    }

}

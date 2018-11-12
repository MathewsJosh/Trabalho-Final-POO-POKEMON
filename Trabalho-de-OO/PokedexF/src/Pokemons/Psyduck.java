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
public class Psyduck extends Pokemon implements Agua
{
    protected int hp;
    protected int ataque;
    protected int defesa;
    protected int ataqueEspecial;
    protected int defesaEspecial;
    protected int velocidade;
    protected static int pp;

    public Psyduck()
    {
        this.hp = 210;
        this.ataque = 98;
        this.defesa = 90;
        this.ataqueEspecial = 121;
        this.defesaEspecial = 94;
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
        som.play("PsyduckSound");
    }

    /**
     * Sobrescrição da Interface Agua
     *
     * Função: Definir ataques especiais
     *
     * @author Mathews
     * @return
     */
    @Override
    public int bubble()
    {
        return 1;
    }

    @Override
    public int dive()
    {
        return 1;
    }

    @Override
    public int hydroCannon()
    {
        return 1;
    }

    @Override
    public int waterPulse()
    {
        return 1;
    }

    @Override
    public int surf()
    {
        return 1;
    }

}

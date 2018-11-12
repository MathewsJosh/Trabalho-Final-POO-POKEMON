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
 * Classe Base de pokemon
 *
 * @author Renan
 */
public class Caterpie extends Pokemon implements Inseto
{

    protected int hp;
    protected int ataque;
    protected int defesa;
    protected int ataqueEspecial;
    protected int defesaEspecial;
    protected int velocidade;
    protected static int pp;
//Utilizar pp como "mana" provavelnte terá valor 20

    public Caterpie()
    {
        this.hp = 200;
        this.ataque = 58;
        this.defesa = 67;
        this.ataqueEspecial = 40;
        this.defesaEspecial = 40;
        this.velocidade = 85;
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
        som.play("CaterpieSound");
    }

    @Override
    public int bugBuzz()
    {
        return 1;
    }

    @Override
    public int megahorn()
    {
        return 1;
    }

    @Override
    public int signalBeam()
    {
        return 1;
    }

    @Override
    public int xScissor()
    {
        return 1;
    }
}

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
public class Vulpix extends Pokemon implements Fogo
{
    protected int hp;
    protected int ataque;
    protected int defesa;
    protected int ataqueEspecial;
    protected int defesaEspecial;
    protected int velocidade;
    protected static int pp;

    public Vulpix()
    {
        this.hp = 186;
        this.ataque = 78;
        this.defesa = 76;
        this.ataqueEspecial = 94;
        this.defesaEspecial = 121;
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
        som.play("VulpixSound");
    }

        /**
     * Sobrescrição da Interface Fogo
     *
     * Função: Definir ataques especiais
     *
     * @author Mathews
     * @return
     */
    @Override
    public int ember()
    {
        return 1;
    }

    @Override
    public int fireBlast()
    {
        return 1;
    }

    @Override
    public int fireSpin()
    {
        return 1;
    }

    @Override
    public int inferno()
    {
        return 1;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import TiposDePokemon.*;
import pokedexf.*;
import Sons.*;
import java.util.Random;

/**
 * Classe Base de pokemon
 *
 * @author Renan
 */
public class Caterpie extends Pokemon implements Inseto
{

    public Caterpie()
    {
        super();
        this.nome = "Caterpie";
        this.peso = 2.9f;
        
        Random s = new Random();
        int x = s.nextInt(1);
        if (x == 1)
        {
            this.sexo = 'M';
        }
        else
        {
            this.sexo = 'F';
        }
        this.nivel = 0;
        this.xp = 0;
  
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

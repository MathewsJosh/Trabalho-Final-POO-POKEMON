/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import TiposDePokemon.*;
import Sons.*;
import java.util.Random;
import pokedexf.*;

/**
 *
 * @author Mathews
 */
public class Vulpix extends Pokemon implements Fogo
{

    public Vulpix()
    {
        super();
        this.nome = "Vulpix";
        this.peso = 9.9f;

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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import TiposDePokemon.*;
import Sons.TocarSom;
import java.util.Random;
import pokedexf.*;

/**
 *
 * @author Renan
 */
public class Magikarp extends Pokemon implements Agua
{

    public Magikarp()
    {
        super();
        this.nome = "Magikarp";
        this.peso = 10f;

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

        this.hp = 150;
        this.ataque = 22;
        this.defesa = 103;
        this.ataqueEspecial = 31;
        this.defesaEspecial = 40;
        this.velocidade = 148;
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
        som.play("MagikarpSound");
    }

    @Override
    public int bubble()
    {
        System.out.println("Bolhas");
        return -10;
    }

    @Override
    public int dive()
    {
        System.out.println("O pokemon mergulha e ataca!");
        return -80;
    }

    @Override
    public int hydroCannon()
    {
        System.out.println("Jato D'água!");
        return -150;
    }

    @Override
    public int waterPulse()
    {
        System.out.println("Pulso de água!");
        return -60;
    }

    @Override
    public int surf()
    {
        System.out.println("O pokemon surfa");
        return -90;
    }

}

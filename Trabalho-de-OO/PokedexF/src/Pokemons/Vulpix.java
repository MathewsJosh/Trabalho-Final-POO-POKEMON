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
 * @author Mathews
 */
public final class Vulpix extends Pokemon implements Fogo
{
    String som = "VulpixSound";

    public Vulpix()
    {
        super("Vulpix", 9.9f, 0, 0, 186, 78, 76, 94, 121, 121, "VulpixSound", 5);
    }

    /**
     * Apresenta todos os dados do Pokemon
     *
     * @return 
     */
    @Override
    public String apresentarPokemon()
    {
        return super.apresentarPokemon();
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
        super.emitesom();
    }

    /**
     * Método atacar() seleciona o ataque de acordo com a possibilidade do mesmo
     * ocorrer
     *
     * @author Mathews
     * @return
     */
    @Override
    public int atacar()
    {
        Random possibilidade = new Random();
        int prob = possibilidade.nextInt(101);

        switch (defineAtaque1())
        {
            case 0:                                                             //Ataque basico
                return basicAttack();
            case 1:                                                             //Ataques especiais tipo Grama
                return ember();
            case 2:
                if (prob <= 75)
                {
                    return fireBlast();
                }
                else
                {
                    return basicAttack();
                }
            case 3:
                if (prob <= 50)
                {
                    return fireSpin();
                }
                else
                {
                    return basicAttack();
                }
            case 4:
                if (prob <= 25)
                {
                    return inferno();
                }
                else
                {
                    return basicAttack();
                }
            default:
                System.out.println("Erro! Array fora dos Limites");
                return basicAttack();
        }
    }

    Random attack = new Random();
    int dano;

    /**
     * Sobrescrição da interface de ataque básico
     *
     * @author Mathews
     * @return
     */
    @Override
    public int basicAttack()
    {
        System.out.println("Ataque Básico!");
        dano = attack.nextInt(this.ataque);
        return dano;
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
        System.out.print("Ataque do tipo Fogo!   ");
        System.out.println("Brasa!");
        dano = attack.nextInt(this.ataqueEspecial - 64);
        return dano;
    }

    @Override
    public int fireBlast()
    {
        System.out.print("Ataque do tipo Fogo!   ");
        System.out.println("Explosão de Fogo!");
        dano = attack.nextInt((this.ataqueEspecial - 30) + 1) + 30;
        return dano;
    }

    @Override
    public int fireSpin()
    {
        System.out.print("Ataque do tipo Fogo!   ");
        System.out.println("Redemoinho de Fogo!");
        dano = attack.nextInt((this.ataqueEspecial - 60) + 1) + 60;
        return dano;
    }

    @Override
    public int inferno()
    {
        System.out.print("Ataque do tipo Fogo!   ");
        System.out.println("Inferno! - ULTIMATE");
        return this.ataqueEspecial;
    }
    
    @Override
    public int sofredano(int dano){
        return super.sofredano(dano);
    }

}

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
 *
 * @author Renan
 */
public final class Charmander extends Pokemon implements Fogo
{
    String som = "CharmanderSound";

    public Charmander()
    {
        super("Charmander", 8.5f, 0, 0, 188, 98, 81, 112, 94, 121, "CharmanderSound", 5);
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
     * Sobrescrição da Classe Mãe Função: Tocar o Som do Pokemon
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
     * Sobrescrição da interface de ataque Fogo
     *
     * @author Mathews
     * @return
     */
    @Override
    public int ember()
    {
        System.out.print("Ataque do tipo Fogo!   ");
        System.out.println("Brasa!");
        dano = attack.nextInt(this.ataqueEspecial - 82);
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
        dano = attack.nextInt((this.ataqueEspecial - 70) + 1) + 70;
        return dano;
    }

    @Override
    public int inferno()
    {
        System.out.print("Ataque do tipo Fogo!   ");
        System.out.println("Inferno! - ULTIMATE");
        return this.ataqueEspecial;
    }

}

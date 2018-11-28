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
public final class Zubat extends Pokemon implements Veneno, Voador
{
    String som = "ZubatSound";

    public Zubat()
    {
        super("Zubat", 7.5f, 0, 0, 190, 85, 67, 58, 76, 103, "ZubatSound", 8);
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
                return aerialAce();
            case 2:
                if (prob <= 75)
                {
                    return airCutter();
                }
                else
                {
                    return basicAttack();
                }
            case 3:
                if (prob <= 50)
                {
                    return drillPeck();
                }
                else
                {
                    return basicAttack();
                }
            case 4:
                if (prob <= 25)
                {
                    return hurricane();
                }
                else
                {
                    return basicAttack();
                }
            case 5:                                                             //Ataques Especiais tipo Veneno
                return acid();
            case 6:
                if (prob <= 50)
                {
                    return poisonSting();
                }
                else
                {
                    return basicAttack();
                }
            case 7:
                if (prob <= 25)
                {
                    return toxic();
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
     * Sobrescrição da interface de ataque Veneno
     *
     * @author Mathews
     * @return
     */
    @Override
    public int acid()
    {
        System.out.print("Ataque do tipo Veneno!  ");
        System.out.println("Ácido");
        dano = attack.nextInt(this.ataqueEspecial - 30);
        return dano;
    }

    @Override
    public int poisonSting()
    {
        System.out.print("Ataque do tipo Veneno!  ");
        System.out.println("Espinhos venenosos!");
        dano = attack.nextInt((this.ataqueEspecial - 30) + 1) + 30;
        return dano;
    }

    @Override
    public int toxic()
    {
        System.out.print("Ataque do tipo Veneno!  ");
        System.out.println("Fumaça venenosa! - ULTIMATE");
        return this.ataqueEspecial;
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
        System.out.print("Ataque do tipo Voador:   ");
        System.out.println("Ataque Aéreo!");
        dano = attack.nextInt(this.ataqueEspecial - 52);
        return dano;
    }

    @Override
    public int airCutter()
    {
        System.out.print("Ataque do tipo Voador:   ");
        System.out.println("Lâmina de Ar!");
        dano = attack.nextInt((this.ataqueEspecial - 15) + 1) + 15;
        return dano;
    }

    @Override
    public int drillPeck()
    {
        System.out.print("Ataque do tipo Voador:   ");
        System.out.println("Bico Broca!");
        dano = attack.nextInt((this.ataqueEspecial - 45) + 1) + 45;
        return dano;
    }

    @Override
    public int hurricane()
    {
        System.out.print("Ataque do tipo Voador:   ");
        System.out.println("Furacão! - ULTIMATE");
        return this.ataqueEspecial;
    }

}

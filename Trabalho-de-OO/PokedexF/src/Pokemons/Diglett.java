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
public final class Diglett extends Pokemon implements Terra
{
    String som = "DiglettSound";

    public Diglett()
    {
        super("Diglett", 0.8f, 0, 0, 130, 103, 49, 67, 85, 175, "DiglettSound", 5);
    }

    /**
     * Apresenta todos os dados do Pokemon
     *
     */
    @Override
    public void apresentarPokemon()
    {
        super.apresentarPokemon();
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
                return sandAttack();
            case 2:
                if (prob <= 75)
                {
                    return mudSlap();
                }
                else
                {
                    return basicAttack();
                }
            case 3:
                if (prob <= 50)
                {
                    return magnitude();
                }
                else
                {
                    return basicAttack();
                }
            case 4:
                if (prob <= 25)
                {
                    return bulldoze();
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
        System.out.print("Ataque do tipo Terra!   ");
        System.out.println("Ataque de Areia!");
        dano = attack.nextInt(this.ataqueEspecial - 52);
        return dano;
    }

    @Override
    public int mudSlap()
    {
        System.out.print("Ataque do tipo Terra!   ");
        System.out.println("Tapa de Lama!");
        dano = attack.nextInt((this.ataqueEspecial - 15) + 1) + 15;
        return dano;
    }

    @Override
    public int magnitude()
    {
        System.out.print("Ataque do tipo Terra!   ");
        System.out.println("Magnitude!");
        dano = attack.nextInt((this.ataqueEspecial - 45) + 1) + 45;
        return dano;
    }

    @Override
    public int bulldoze()
    {
        System.out.print("Ataque do tipo Terra!   ");
        System.out.println("Arrasar! - ULTIMATE");
        return this.ataqueEspecial;
    }

}

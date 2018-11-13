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
public final class Pidgey extends Pokemon implements Normal, Voador
{
    String som = "PidgeySound";

    public Pidgey()
    {
        super("Pidgey", 1.8f, 0, 0, 190, 85, 76, 67, 67, 105, "PidgeySound", 9);
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
            case 1:                                                             //Ataques especiais tipo Voador
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
            case 5:                                                             //Ataques Especiais tipo Normal
                return cut();
            case 6:
                if (prob <= 50)
                {
                    return furyAttack();
                }
                else
                {
                    return basicAttack();
                }
            case 7:
                if (prob <= 25)
                {
                    return gigaImpact();
                }
                else
                {
                    return basicAttack();
                }
            case 8:
                if (prob <= 25)
                {
                    return hornAttack();
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
     * Sobrescrição da Interface Normal
     *
     * Função: Definir ataques especiais
     *
     * @author Mathews
     * @return
     */
    @Override
    public int cut()
    {
        System.out.print("Ataque do tipo Normal:   ");
        System.out.println("Corte!");
        dano = attack.nextInt(this.ataqueEspecial - 52);
        return dano;
    }

    @Override
    public int furyAttack()
    {
        System.out.print("Ataque do tipo Normal:   ");
        System.out.println("Ataque de Fúria!");
        dano = attack.nextInt(((this.ataqueEspecial - 15) + 1) + 15);
        return dano;
    }

    @Override
    public int gigaImpact()
    {
        System.out.print("Ataque do tipo Normal:   ");
        System.out.println("Giga Impacto!");
        dano = attack.nextInt(((this.ataqueEspecial - 45) + 1) + 45);
        return dano;
    }

    @Override
    public int hornAttack()
    {
        System.out.print("Ataque do tipo Normal:   ");
        System.out.println("Ataque de Chifre! - ULTIMATE");
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

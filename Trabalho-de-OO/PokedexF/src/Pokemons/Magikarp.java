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
 * @author Renan
 */
public final class Magikarp extends Pokemon implements Agua
{
    String som = "MagikarpSound";

    public Magikarp()
    {
        super("Magikarp", 10f, 0, 0, 150, 22, 103, 31, 40, 148, "MagikarpSound", 6);
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
                return bubble();
            case 2:
                if (prob <= 80)
                {
                    return dive();
                }
                else
                {
                    return basicAttack();
                }
            case 3:
                if (prob <= 60)
                {
                    return hydroCannon();
                }
                else
                {
                    return basicAttack();
                }
            case 4:
                if (prob <= 40)
                {
                    return waterPulse();
                }
                else
                {
                    return basicAttack();
                }
            case 5:
                if (prob <= 20)
                {
                    return surf();
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
     * Sobrescrição da interface de ataque Agua
     *
     * @author Mathews
     * @return
     */
    @Override
    public int bubble()
    {
        System.out.print("Ataque do tipo Agua!   ");
        System.out.println("Mergulho!");
        dano = attack.nextInt(this.ataqueEspecial - 25);
        return dano;
    }

    @Override
    public int dive()
    {
        System.out.print("Ataque do tipo Agua!   ");
        System.out.println("Mergulho!");
        dano = attack.nextInt(((this.ataqueEspecial - 5) + 1) + 5);
        return dano;
    }

    @Override
    public int hydroCannon()
    {
        System.out.print("Ataque do tipo Agua!   ");
        System.out.println("Mergulho!");
        dano = attack.nextInt((this.ataqueEspecial - 10) + 1) + 10;
        return dano;
    }

    @Override
    public int waterPulse()
    {
        System.out.print("Ataque do tipo Agua!   ");
        System.out.println("Mergulho!");
        dano = attack.nextInt((this.ataqueEspecial - 20) + 1) + 20;
        return dano;
    }

    @Override
    public int surf()
    {
        System.out.print("Ataque do tipo Agua!   ");
        System.out.println("Mergulho! - ULTIMATE");
        return this.ataqueEspecial;
    }

}

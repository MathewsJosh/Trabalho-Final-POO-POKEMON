/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import TiposDePokemon.*;
import java.util.Random;
import pokedexf.*;

/**
 *
 * @author Renan
 */
public final class Bulbassauro extends Pokemon implements Grama, Veneno
{
    String som = "BulbasaurSound";

    public Bulbassauro()
    {
        super("Bulbassauro", 6.9f, 0, 0, 200, 92, 92, 121, 121, 85, "BulbasaurSound", 8);
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
                return seedBomb();
            case 2:
                if (prob <= 75)
                {
                    return solarBeam();
                }
                else
                {
                    return basicAttack();
                }
            case 3:
                if (prob <= 50)
                {
                    return leafBlade();
                }
                else
                {
                    return basicAttack();
                }
            case 4:                                                             //Ultimate
                if (prob <= 25)
                {
                    return megaDrain();
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
            case 7:                                                             //ultimate
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
     * Sobrescrição da interface de ataque Grama
     *
     * @author Mathews
     * @return
     */
    
    @Override
    public int seedBomb()
    {
        System.out.print("Ataque do tipo Grama!   ");
        System.out.println("Bomba de Sementes!");
        dano = attack.nextInt(this.ataqueEspecial-80);
        return dano;                                                             //Colocar Random
    }

    @Override
    public int solarBeam()
    {
        System.out.print("Ataque do tipo Grama:   ");
        System.out.println("Raio Solar!");
        dano = attack.nextInt(((this.ataqueEspecial-40) - 40)+1)+40;
        return dano;
    }

    @Override
    public int leafBlade()
    {
        System.out.print("Ataque do tipo Grama!   ");
        System.out.println("Folhas navalha!");
        dano = attack.nextInt((this.ataqueEspecial - 80)+1)+80;
        return dano;
    }

    @Override
    public int megaDrain()
    {
        System.out.print("Ataque do tipo Grama!   ");
        System.out.println("Mega Dreno! - ULTIMATE");
        return this.ataqueEspecial;
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
        dano = attack.nextInt(this.ataqueEspecial-80);
        return dano;
    }

    @Override
    public int poisonSting()
    {
        System.out.print("Ataque do tipo Veneno!  ");
        System.out.println("Espinhos venenosos!");
        dano = attack.nextInt((this.ataqueEspecial - 80)+1)+80;
        return dano;
    }

    @Override
    public int toxic()
    {
        System.out.print("Ataque do tipo Veneno!  ");
        System.out.println("Fumaça venenosa! - ULTIMATE");
        return this.ataqueEspecial;
    }
}

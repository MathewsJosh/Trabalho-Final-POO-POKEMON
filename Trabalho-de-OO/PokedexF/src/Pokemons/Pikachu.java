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
 * @author Mathews
 */
public final class Pikachu extends Pokemon implements Eletrico
{
    String som = "PikachuSound";

    public Pikachu()
    {
        super("Pikachu", 6f, 0, 0, 180, 103, 76, 94, 94, 166, "PikachuSound", 5);
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
                return shockWave();
            case 2:
                if (prob <= 75)
                {
                    return thunder();
                }
                else
                {
                    return basicAttack();
                }
            case 3:
                if (prob <= 50)
                {
                    return spark();
                }
                else
                {
                    return basicAttack();
                }
            case 4:
                if (prob <= 25)
                {
                    return thunderShock();
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
     * Sobrescrição da Interface Eletrico
     *
     * Função: Definir ataques especiais
     *
     * @author Mathews
     * @return
     */
    @Override
    public int shockWave()
    {
        System.out.print("Ataque do tipo Elétrico!   ");
        System.out.println("Onda de Choque!");
        dano = attack.nextInt(this.ataqueEspecial - 64);
        return dano;
    }

    @Override
    public int thunder()
    {
        System.out.print("Ataque do tipo Elétrico!   ");
        System.out.println("Trovão!");
        dano = attack.nextInt((this.ataqueEspecial - 30) + 1) + 30;
        return dano;
    }

    @Override
    public int spark()
    {
        System.out.print("Ataque do tipo Elétrico!   ");
        System.out.println("Faíscas!");
        dano = attack.nextInt((this.ataqueEspecial - 60) + 1) + 60;
        return dano;
    }

    @Override
    public int thunderShock()
    {
        System.out.print("Ataque do tipo Elétrico!   ");
        System.out.println("Choque do Trovão! - ULTIMATE");
        return this.ataqueEspecial;
    }
}

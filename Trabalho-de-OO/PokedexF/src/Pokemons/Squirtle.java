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
 * @author Mathews
 */
public final class Squirtle extends Pokemon implements Agua
{
    String som = "SquirtleSound";

    public Squirtle()
    {
        super("Squirtle", 9f, 0, 0, 198, 90, 121, 94, 119, 81, "SquirtleSound", 5);
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
     * Sobrescrição da Interface Agua
     *
     * Função: Definir ataques especiais
     *
     * @author Mathews
     * @return
     */
    @Override
    public int bubble()
    {
        System.out.print("Ataque do tipo Agua!   ");
        System.out.println("Bolhas!");
        dano = attack.nextInt(this.ataqueEspecial - 80);
        return dano;
    }

    @Override
    public int dive()
    {
        System.out.print("Ataque do tipo Agua!   ");
        System.out.println("Mergulho!");
        dano = attack.nextInt((this.ataqueEspecial - 30) + 1) + 30;
        return dano;
    }

    @Override
    public int hydroCannon()
    {
        System.out.print("Ataque do tipo Agua!   ");
        System.out.println("Canhão de Agua!");
        dano = attack.nextInt((this.ataqueEspecial - 60) + 1) + 60;
        return dano;
    }

    @Override
    public int waterPulse()
    {
        System.out.print("Ataque do tipo Agua!   ");
        System.out.println("Pulso de Água!");
        dano = attack.nextInt((this.ataqueEspecial - 90) + 1) + 90;
        return dano;
    }

    @Override
    public int surf()
    {
        System.out.print("Ataque do tipo Agua!   ");
        System.out.println("Surf! - ULTIMATE");
        return this.ataqueEspecial;
    }
    
    
    @Override
    public int sofredano(int dano){
        return super.sofredano(dano);
    }

}

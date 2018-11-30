/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import TiposDePokemon.*;
import pokedexf.*;
import java.util.Random;

/**
 * @author Renan
 */
public final class Caterpie extends Pokemon implements Inseto
{
    String som = "CaterpieSound";

    public Caterpie()
    {
        super("Caterpie", 2.9f, 0, 0, 200, 58, 67, 40, 40, 85, "CaterpieSound", 5);
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
                return bugBuzz();
            case 2:
                if (prob <= 75)
                {
                    return megahorn();
                }
                else
                {
                    return basicAttack();
                }
            case 3:
                if (prob <= 50)
                {
                    return signalBeam();
                }
                else
                {
                    return basicAttack();
                }
            case 4:
                if (prob <= 25)
                {
                    return xScissor();
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
     * Sobrescrição da Classe Inseto
     *
     * @author Mathews
     * @return
     */
    @Override
    public int bugBuzz()
    {
        System.out.print("Ataque do tipo Inseto!   ");
        System.out.println("Zumbido de Inseto!");
        dano = attack.nextInt((this.ataqueEspecial - 30));
        return dano;
    }

    @Override
    public int megahorn()
    {
        System.out.print("Ataque do tipo Inseto!   ");
        System.out.println("Mega Chifre!");
        dano = attack.nextInt((this.ataqueEspecial - 10)+1)+10;
        return dano;
    }

    @Override
    public int signalBeam()
    {
        System.out.print("Ataque do tipo Inseto!   ");
        System.out.println("Raio Sinalizador!");
        dano = attack.nextInt((this.ataqueEspecial - 20)+1)+20;
        return dano;
    }

    @Override
    public int xScissor()
    {
        System.out.print("Ataque do tipo Inseto!   ");
        System.out.println("Corte X! - ULTIMATE");
        return this.ataqueEspecial;
    }
    
    @Override
    public int sofredano(int dano){
        return super.sofredano(dano);
    }
}

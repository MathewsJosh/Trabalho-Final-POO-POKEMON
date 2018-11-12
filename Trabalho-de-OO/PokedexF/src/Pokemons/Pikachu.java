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
 *
 * @author Mathews
 */
public class Pikachu extends Pokemon implements Eletrico
{

    public Pikachu()
    {
        super();
        this.nome = "Pikachu";
        this.peso = 6f;
        
        Random s = new Random();
        int x = s.nextInt(1);
        if (x == 1)
        {
            this.sexo = 'M';
        }
        else
        {
            this.sexo = 'F';
        }
        this.nivel = 0;
        this.xp = 0;
        
        this.hp = 180;
        this.ataque = 103;
        this.defesa = 76;
        this.ataqueEspecial = 94;
        this.defesaEspecial = 94;
        this.velocidade = 166;
    }
    
    /**
     * Sobrescrição da Classe Mãe
     *
     * Função: Tocar o Som do Pokemon
     *
     * @author Mathews
     */

    public void emitesom()
    {
        TocarSom som = new TocarSom();
        som.play("PikachuSound");
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
        System.out.println("Onda de choque");
        return -60;
    }

    @Override
    public int thunder()
    {
        System.out.println("Raio!");
        return -110;
    }

    @Override
    public int spark()
    {
        System.out.println("Faícas");
        return -10;
    }

    @Override
    public int thunderShock()
    {
        System.out.println("Choque do trovão");
        return -40;
    }
}

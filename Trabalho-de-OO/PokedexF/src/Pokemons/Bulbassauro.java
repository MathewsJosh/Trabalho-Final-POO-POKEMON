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
 * Classe Base de pokemon
 *
 * @author Renan
 */
public class Bulbassauro extends Pokemon implements Grama, Veneno
{

    public Bulbassauro()
    {
        super();
        this.nome = "Bulbassauro";
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
        this.peso = 6.9f;
        this.xp = 0;
        this.hp = 200;
        this.ataque = 92;
        this.defesa = 92;
        this.ataqueEspecial = 121;
        this.defesaEspecial = 121;
        this.velocidade = 85;
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
        som.play("BulbasaurSound");
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
        System.out.println("Bomba de sementes");
        return -60;
    }

    @Override
    public int solarBeam()
    {
        System.out.println("Raio Solar!");
        return -110;
    }

    @Override
    public int leafBlade()
    {
        System.out.println("Folhas navalha");
        return -40;
    }

    @Override
    public int megaDrain()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        System.out.println("ácido");
        return -60;
    }

    @Override
    public int poisonSting()
    {
        System.out.println("espinhos venenosos!");
        return -20;
    }

    @Override
    public int toxic()
    {
        System.out.println("fumaça venenosa");
        return -10;
    }

}

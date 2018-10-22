/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.pokebolas;

import Pokemon.*;

/**
 * Classe Base de pokemon
 *
 * @author Renan
 */
public class Zubat extends Pokemon implements Veneno, Voador {
    protected int hp;
    protected int ataque;
    protected int defesa;
    protected int ataqueEspecial;
    protected int defesaEspecial;
    protected int velocidade;
    protected static int pp; 
//Utilizar pp como "mana" provavelnte terá valor 20

    public Zubat()
    {
        this.hp = 190;
        this.ataque = 85;
        this.defesa = 67;
        this.ataqueEspecial = 58;
        this.defesaEspecial = 76;
        this.velocidade = 103;
    }
    
}

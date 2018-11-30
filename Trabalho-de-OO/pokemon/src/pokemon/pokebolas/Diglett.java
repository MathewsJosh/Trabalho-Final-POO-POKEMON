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
public class Diglett extends Pokemon implements Normal
{
    protected int hp;
    protected int ataque;
    protected int defesa;
    protected int ataqueEspecial;
    protected int defesaEspecial;
    protected int velocidade;
    protected static int pp;
//Utilizar pp como "mana" provavelmente terá valor 20

    public Diglett()
    {
        this.hp = 130;
        this.ataque = 103;
        this.defesa = 49;
        this.ataqueEspecial = 67;
        this.defesaEspecial = 85;
        this.velocidade = 175;
    }
}

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
public class Nidoran extends Pokemon implements Normal
{
    protected int hp;
    protected int ataque;
    protected int defesa;
    protected int ataqueEspecial;
    protected int defesaEspecial;
    protected int velocidade;
    protected static int pp;
//Utilizar pp como "mana" provavelnte terá valor 20

    public Nidoran()
    {
        this.hp = 220;
        this.ataque = 89;
        this.defesa = 98;
        this.ataqueEspecial = 76;
        this.defesaEspecial = 76;
        this.velocidade = 78;
    }
}

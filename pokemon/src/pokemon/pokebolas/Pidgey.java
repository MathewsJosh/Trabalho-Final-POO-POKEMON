/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.pokebolas;

import pokemon.*;

/**
 * Classe Base de pokemon
 *
 * @author Renan
 */
public class Pidgey
{
    protected int hp;
    protected int ataque;
    protected int defesa;
    protected int ataqueEspecial;
    protected int defesaEspecial;
    protected int velocidade;
    protected static int pp;
//Utilizar pp como "mana" provavelnte terá valor 20

    public Pidgey()
    {
        this.hp = 190;
        this.ataque = 85;
        this.defesa = 76;
        this.ataqueEspecial = 67;
        this.defesaEspecial = 67;
        this.velocidade = 105;
    }
}

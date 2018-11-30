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
public class Vulpix extends Fogo
{
    protected int hp;
    protected int ataque;
    protected int defesa;
    protected int ataqueEspecial;
    protected int defesaEspecial;
    protected int velocidade;
    protected static int pp;
//Utilizar pp como "mana" provavelnte terá valor 20

    public Vulpix()
    {
        this.hp = 186;
        this.ataque = 78;
        this.defesa = 78;
        this.ataqueEspecial = 94;
        this.defesaEspecial = 121;
        this.velocidade = 121;
    }
}

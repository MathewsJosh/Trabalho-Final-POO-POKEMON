/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.pokebolas;
import Pokemon.*;
/**
 * Classe Base de pokemon
 * @author Renan
 */
public class Mankey extends Pokemon implements Normal{
        protected int hp;
    protected int ataque;
    protected int defesa;
    protected int ataqueEspecial;
    protected int defesaEspecial;
    protected int velocidade;
    protected static int pp; 
//Utilizar pp como "mana" provavelnte terá valor 20

    public Mankey()
    {
        this.hp = 190;
        this.ataque = 148;
        this.defesa = 67;
        this.ataqueEspecial = 67;
        this.defesaEspecial = 85;
        this.velocidade = 130;
    }
}

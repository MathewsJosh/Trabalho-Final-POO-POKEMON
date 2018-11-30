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
public class Caterpie extends Pokemon implements Inseto{
    protected int hp;
    protected int ataque;
    protected int defesa;
    protected int ataqueEspecial;
    protected int defesaEspecial;
    protected int velocidade;
    protected static int pp; 
//Utilizar pp como "mana" provavelnte terá valor 20

    public Caterpie()
    {
        this.hp = 200;
        this.ataque = 58;
        this.defesa = 67;
        this.ataqueEspecial = 40;
        this.defesaEspecial = 40;
        this.velocidade = 85;
    }
}
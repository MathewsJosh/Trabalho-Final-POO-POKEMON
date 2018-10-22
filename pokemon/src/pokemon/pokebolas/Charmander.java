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
public class Charmander extends Pokemon implements Fogo {
    protected int hp;
    protected int ataque;
    protected int defesa;
    protected int ataqueEspecial;
    protected int defesaEspecial;
    protected int velocidade;
    protected static int pp; 
//Utilizar pp como "mana" provavelnte terá valor 20

    public Charmander()
    {
        this.hp = 188;
        this.ataque = 98;
        this.defesa = 81;
        this.ataqueEspecial = 112;
        this.defesaEspecial = 94;
        this.velocidade = 121;
    }
}

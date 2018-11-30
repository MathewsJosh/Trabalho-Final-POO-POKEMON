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
public class Bulbasaur extends Pokemon implements Grama, Veneno {
    protected int hp;
    protected int ataque;
    protected int defesa;
    protected int ataqueEspecial;
    protected int defesaEspecial;
    protected int velocidade;
    protected static int pp;

    public Bulbasaur()
    {
        this.hp = 200;
        this.ataque = 92;
        this.defesa = 92;
        this.ataqueEspecial = 121;
        this.defesaEspecial = 121;
        this.velocidade = 85;
        Bulbasaur.pp=20;
    }
    
    
}

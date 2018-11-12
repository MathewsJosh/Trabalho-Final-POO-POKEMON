/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexf;

public abstract class Pokemon
{
    protected String nome;
    protected char sexo;
    protected int nivel;
    protected int hp;
    protected int peso;
    protected int xp;
    protected int posicao;
    protected String raridade;

    public abstract void emitesom();
      
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Treinadores;

/**
 *
 * @author Mathews
 */
public class Mathews
{
    protected String nome;
    protected int idade;
    protected String genero;

    protected int insignias;
    protected int numPokemons;
    protected int nivel;
    protected int xpT;

    public Mathews()
    {
        this.nome = "Mathews";
        this.idade = 19;
        this.genero = "Masculino";
        this.insignias = 2;
        this.numPokemons = 3;
        this.nivel = 2;
        this.xpT = 30;
    }

    public void apresentaTreinador()
    {
        System.out.println("\nTreinador: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Gênero: " + getGenero());

        System.out.println("Insignias: " + getInsignias());
        System.out.println("Número de Pokemons: " + getNumPokemons());
        System.out.println("Nivel do Treinador: " + getNivelAtual());
        System.out.println("XP Atual: " + getXpT() + "\n");

    }

    public void GanharPokemons(int x)
    {
        this.numPokemons = this.numPokemons + x;
    }

    public void subirDeNivel(int n)                     //A cada 100 de xp, sobe de nivel
    {
        this.nivel = nivel + n;
    }

    /**
     * Ganha uma quantidade de xp, caso >=100 sobe de nivel
     *
     * @param xp
     */
    public void ganharXpT(int xp)                           //Se xp ou this.xpT+xp for 100+, sobe de nivel                 
    {
        int soma = xpT + xp;
        if (soma < 100)                                     //Cada nivel vai de 0 a 99 de xp       
        {
            this.xpT = soma;
        }
        else                                                //Se soma>100 quer dizer que subiu um nivel
        {
            subirDeNivel(xp / 100);
            this.xpT = soma - 100;
            System.out.println("\n=>Você subiu de nivel!!!!");
            System.out.println("=>Xp Atual: " + getXpT());
            System.out.println("=>Level Atual: " + getNivelAtual());
        }

    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public String getGenero()
    {
        return genero;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public int getInsignias()
    {
        return insignias;
    }

    public int getNumPokemons()
    {
        return numPokemons;
    }

    public int getNivelAtual()
    {
        return nivel;
    }

    public int getXpT()
    {
        return xpT;
    }

    public void setInsignias(int insignias)
    {
        this.insignias = insignias;
    }

}

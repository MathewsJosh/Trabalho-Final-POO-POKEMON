/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Treinadores;

import TiposDePokemon.*;
import pokedexf.*;
import Pokebolas.*;
import Pokemons.*;
import java.util.Scanner;

/**
 * Interface de Criação interativa
 *
 * @author Mathews
 */
public class Treinador
{
    protected String nome;
    protected int idade;
    protected String genero;

    protected int insignias;
    protected int numPokemons;
    protected int nivel;
    protected int xpT;

    public Treinador()
    {
        this.insignias = 0;
        this.numPokemons = 0;
        this.nivel = 1;
        this.xpT = 0;

        Scanner s = new Scanner(System.in);
        int x;

        System.out.println("========Bem vindo ao jogo, treinador!========");
        System.out.println("\nPor favor, diga-me alguns dados sobre você:");
        System.out.println("Qual é o seu nome? ");
        this.nome = s.next();

        int flag = 1;
        while (flag == 1)
        {
            try
            {
                System.out.println("Quantos anos você tem? ");
                x = Integer.parseInt(s.next());
                this.idade = x;
                flag = 0;
            }
            catch (NumberFormatException erro)
            {
                System.out.println("Idade Inválida, Tente Novamente!!");
            }
        }

        while (flag == 0)
        {
            try
            {
                System.out.println("Você é garoto(M) ou garota(F)?  ");
                String sexo = s.next();

                if ("M".equals(sexo) || "m".equals(sexo))
                {
                    this.genero = "Masculino";
                    flag = 1;
                }
                else if ("F".equals(sexo) || "f".equals(sexo))
                {
                    this.genero = "Feminino";
                    flag = 1;
                }
                else
                    throw new erro("\nGênero inválido, tente novamente!");
            }
            catch (erro erro)
            {
                System.out.println(erro);
            }
        }
    }

    private static class erro extends Exception
    {
        private erro(String message)
        {
            super(message);
        }
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
            subirDeNivel(xp/100);
            this.xpT = soma - 100;
            System.out.println("\n=>Você subiu de nivel!!!!");
            System.out.println("=>Xp Atual: "+getXpT());
            System.out.println("=>Level Atual: "+getNivelAtual());
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

    public void setInsignias(int insignias)
    {
        this.insignias = insignias;
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

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexf;

import Sons.*;
import java.util.Random;

/**
 * Classe abstrata pokemon A mesma possui vários metodos comuns aos pokemons,
 * como: apresentarPokemon(), emitirSom() e treinar()
 *
 * @author Mathews
 */
public abstract class Pokemon
{
    protected String nome;
    protected String sexo;
    protected float peso;
    protected String som;

    protected int nivel;
    protected int xp;
    protected int qtdAtaques;

    protected int hp;
    protected int ataque;
    protected int defesa;
    protected int ataqueEspecial;
    protected int defesaEspecial;
    protected int velocidade;

    protected static int pp = 100; //Mana

    public Pokemon(String nome, float peso, int nivel, int xp, int hp, int ataque, int defesa, int ataqueEspecial, 
            int defesaEspecial, int velocidade, String sound, int qtdAt)
    {
        this.nome = nome;
        Random s = new Random();
        int x = s.nextInt(1);
        if (x == 1)
        {
            this.sexo = "Macho";
        }
        else
        {
            this.sexo = "Fêmea";
        }
        this.nivel = nivel;
        this.peso = peso;
        this.xp = xp;
        this.som = sound;
        this.qtdAtaques=qtdAt-1;

        this.hp = hp;
        this.ataque = ataque;
        this.defesa = defesa;
        this.ataqueEspecial = ataqueEspecial;
        this.defesaEspecial = defesaEspecial;
        this.velocidade = velocidade;
    }

    /**
     * Apresenta todos os dados do Pokemon
     *
     * @return 
     */
    public String apresentarPokemon()
    {
        emitesom();  
        return "========Informações do Pokemon========" +
        "<br> Nome: " + getNome() +
        "<br> Sexo: " + getSexo() +
        "<br> Peso: " + getPeso() +
        "<br> Nível: " + getNivel() +
        "<br> Xp Atual: " + getXp() +
        "<br> HP: " + getHp() +
        "<br> Ataque: " + getAtaque() +
        "<br> Defesa: " + getDefesa() +
        "<br> Ataque Especial: " + getAtaqueEspecial() +
        "<br> Defesa Especial: " + getDefesaEspecial() + 
        "<br> Velocidade: " + getVelocidade() + "\n";
                                              
    }

    /**
     * Sobrescrição da Classe Mãe
     *
     * Função: Tocar o Som do Pokemon
     *
     * @author Mathews
     */
    public void emitesom()
    {
        TocarSom som1 = new TocarSom();
        som1.play(som);
    }

    /** PRECISA DE UM try catch para OutOfBonds
     *
     * @return
     */
    public int defineAtaque1()
    {
        Random defineAtaque = new Random();
        int qualAtaque = defineAtaque.nextInt(qtdAtaques);
        return qualAtaque;
    }
    
    public int atacar()
    {
        return 0;
    }

    public void treinar()
    {
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getSexo()
    {
        return sexo;
    }

    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }

    public int getNivel()
    {
        return nivel;
    }

    public void setNivel(int nivel)
    {
        this.nivel = nivel;
    }

    public float getPeso()
    {
        return peso;
    }

    public void setPeso(float peso)
    {
        this.peso = peso;
    }

    public int getXp()
    {
        return xp;
    }

    public void setXp(int xp)
    {
        this.xp = xp;
    }

    public int getHp()
    {
        return hp;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public int getAtaque()
    {
        return ataque;
    }

    public void setAtaque(int ataque)
    {
        this.ataque = ataque;
    }

    public int getDefesa()
    {
        return defesa;
    }

    public void setDefesa(int defesa)
    {
        this.defesa = defesa;
    }

    public int getAtaqueEspecial()
    {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial)
    {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getDefesaEspecial()
    {
        return defesaEspecial;
    }

    public void setDefesaEspecial(int defesaEspecial)
    {
        this.defesaEspecial = defesaEspecial;
    }

    public int getVelocidade()
    {
        return velocidade;
    }

    public void setVelocidade(int velocidade)
    {
        this.velocidade = velocidade;
    }

    public static int getPp()
    {
        return pp;
    }

    public static void setPp(int pp)
    {
        Pokemon.pp = pp;
    }

}

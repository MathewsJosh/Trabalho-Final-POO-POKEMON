/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 * Pacote pai de todos os pokemons
 * Ele Possui os elementos básicos e em comum que todos os objetos pokemons devem possuir
 * @author Renan,Mathew,Julia
 */
public abstract class Pokemon {
    
    protected String nome;
    protected String genero;
    protected int nivel;
    protected int numero;
    protected float peso;
    protected float altura;
    protected int exp;
    protected int vida;
   
    /**
     * Construtor de um pokemon Genérico
     */
    public Pokemon(){
        this.nivel = 1;
        this.exp = 0;
        this.vida = 100;
        
    }
    
    /**
     * Get do para o nome do pokemon
     * @return nome
     */
    public String getNome(){
        return this.nome;
    }
    
    /**
     * Get Para o gênero do pokemon (macho ou fêmea)
     * @return genero
     */
    public String getGenero(){
        return this.genero;
    }
    /**
     * Get para o nível de cada pokemon
     * @return nivel
     */
    public int getNivel(){
        return this.nivel;
    }
    
    /**
     * Get para a colocação do pokemon na classificação (pokedex)
     * @return numero 
     */
    public int getNumero(){
        return this.numero;
    }
    
    /**
     * Get para informações de altura
     * @return altura
     */
    public float getAltura(){
        return this.altura;
    }
    
    /**
     * Get para informações de peso
     * @return peso
     */
    public float getPeso(){
        return this.peso;
    }
    
    /**
     * Get para informações de experiencia de batalha de um pokemon
     * @return xp
     */
    public int getXP(){
        return this.exp;
    }
    
    /**
     * Define o nome do pokemon
     * @param n 
     */
    public void setNome(String n){
        this.nome = "n";
    }
    
    /**
     * Define o genero do pokemon
     * @param g 
     */
    public void setGenero(String g){
        this.genero = "g";
    }
    
    /** Define o Nivel do pokemon
     * @param nivel 
     */
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    
    /**
     * Define a colocação na pokedex
     * @param num 
     */
    public void setNumero(int num){
        this.numero = num;
    }
    
    /**
     * Define a Altura do pokemon
     * @param h 
     */
    public void setAltura(float h){
        this.altura = h;
    }
    
    /**
     * Define o Peso de um pokemon
     * @param p 
     */
    public void setPeso(float p){
        this.peso = p;
    }
    
    /**
     * Define a experiencia de batalha ganha
     * @param XP 
     */
    public void setXP(int XP){
        this.exp = XP;
    }
    
    /**
     * Atualiza o Nivel do pokemon para que ele evolua
     */
    public void atualizaNivel(){
        if (this.exp == 100)
            this.nivel++;
        else
            System.out.println("Faltam "+(100-this.exp));
    }
    
    /** 
     * Verfica se o pokemon está apto a evolução, e retorna verdadeiro ou falso
     * @return 0 ou 1
     */
    public boolean verificaEvolucao(){
        return this.nivel == 3;
    }
}

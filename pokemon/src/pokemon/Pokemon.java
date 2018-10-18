/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 * Pacote pai de todos os pokemons
 * @author Renan,Mathew,Julia
 */
abstract class Pokemon {
    
    protected String nome;
    protected String genero;
    protected int nivel;
    protected int numero;
    protected float peso;
    protected float altura;
    protected int exp;
    protected int vida;
   
    public Pokemon(){
        this.nivel = 1;
        this.exp = 0;
        this.vida = 100;
        
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public int getNivel(){
        return this.nivel;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public float getAltura(){
        return this.altura;
    }
    
    public float getPeso(){
        return this.peso;
    }
    
    public int getXP(){
        return this.exp;
    }
    
    public void setNome(String n){
        this.nome = "n";
    }
    
    public void setGenero(String g){
        this.genero = "g";
    }
    
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    
    public void setNumero(int num){
        this.numero = num;
    }
    
    public void setAltura(float h){
        this.altura = h;
    }
    
    public void setPeso(float p){
        this.peso = p;
    }
    
    public void setXP(int XP){
        this.exp = XP;
    }
    
    public void atualizaNivel(){
        if (this.exp == 100)
            this.nivel++;
        else
            System.out.println("Faltam "+(100-this.exp));
    }
    
    public boolean verificaEvolucao(){
        return this.nivel == 3;
    }
}

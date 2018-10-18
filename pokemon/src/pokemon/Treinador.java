/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 * Classe com os dados do jogador/treinador pokemon
 * @author Renan,Mathew,Júlia
 */
public class Treinador {
    protected String nome;
    protected int idade;
    protected int insigneas;
    
    public Treinador(String nome,int idade){
        this.nome = "nome";
        this.idade = idade;
        this.insigneas = 0;
    }
}

  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexf;

import java.util.Scanner;

/**
 *
 * @author Renan
 */
public class Treinador {
    protected String nome;
    protected int idade;
    protected int insigneas;
    protected String genero;
    protected int numPokemons;
    
    Scanner t = new Scanner(System.in);
    
    public  Treinador (String Nome, int Idade){
        String resposta;
        
        this.nome = Nome;
        this.idade = Idade;
        
        System.out.println("Você é um garoto(B) ou uma garota?(G)");
        resposta = t.next();
        
        if("B".equals(resposta))
            this.genero = "garoto";
        else  if ("G".equals(resposta))
            this.genero = "garota";
        else
            System.out.println("Resposta Inválida");
        
        insigneas = 0;
    }

    public Treinador()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Treinador(String luiz, int i, String m, int i0, int i1, int i2, int i3)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

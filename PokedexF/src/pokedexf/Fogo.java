/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexf;

/**
 *
 * @author Mathews
 */
public class Fogo extends Pokemon
{
        public int ember (){
        System.out.println("Cospe fogo");
        return -40;
    }
    
        public int fireBlast (){
        System.out.println("Raio de fogo");
        return -70;
    }
        
    public int fireSpin (){
        System.out.println("Espiral de fogo");
        return -15;
    }
    
    public int inferno (){
        System.out.println("Queima o oponente");
        return -100;
    }
}

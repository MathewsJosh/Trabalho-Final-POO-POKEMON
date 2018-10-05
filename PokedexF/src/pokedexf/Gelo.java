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
public class Gelo extends Pokemon
{
        public int auroraBeam (){
        System.out.println("Raio aurora!");
        return -60;
    }

    public int iceBall (){
        System.out.println("Bola de Neve!");
        return -10;
    }
    
    public int iceBeam (){
        System.out.println("Raio de Gelo");
        return -40;
    }
    
    public int iceHammer (){
        System.out.println("Martelo de Gelo");
        return -100;
    }
}

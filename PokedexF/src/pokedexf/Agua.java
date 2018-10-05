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
public class Agua extends Pokemon
{
    public int bubble (){
        System.out.println("Bolhas");
        return -10;
    }

    public int dive (){
        System.out.println("O pokemon mergulha e ataca!");
        return -80;
    }
    
    public int hydroCannon (){
        System.out.println("Jato D'água!");
        return -150;
    }
    
    public int waterPulse(){
        System.out.println("Pulso de água!");
        return -60;
    }
    
    public int surf(){
        System.out.println("O pokemon surfa");
        return -90;
    }
}

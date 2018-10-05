/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexf;

/**
 *
 * @author Renan
 */
public class Veneno {
    
    public int acid (){
        System.out.println("ácido");
        return -60;
    }

    public int poisonSting (){
        System.out.println("espinhos venenosos!");
        return -20;
    }
    
    public int toxic (){
        System.out.println("fumaça venenosa");
        return -10;
    }
}

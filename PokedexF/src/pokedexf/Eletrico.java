package pokedexf;

/**
 *
 * @author Mathews
 */
public class Eletrico extends Pokemon
{
    public int shockWave (){
        System.out.println("Onda de choque");
        return -60;
    }

    public int thunder (){
        System.out.println("Raio!");
        return -110;
    }
    
    public int spark (){
        System.out.println("Faicas");
        return -10;
    }
    
    public int thundeShock (){
        System.out.println("Choque do trovão");
        return -40;
    }
}

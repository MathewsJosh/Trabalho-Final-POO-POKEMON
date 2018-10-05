package pokedexf;

public class Normal extends Pokemon
{
        public int cut (){
        System.out.println("Corte");
        return -90;
    }

    public int furyAttack (){
        System.out.println("ataque de furia!");
        return -40;
    }
    
    public int gigaImpact (){
        System.out.println("Giga Impact");
        return -80;
    }
    
    public int hornAttack (){
        System.out.println("Ataque de cifre");
        return -100;
    }
}

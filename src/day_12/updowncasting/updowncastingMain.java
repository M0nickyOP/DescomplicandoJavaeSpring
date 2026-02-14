package day_12.updowncasting;

import java.util.ArrayList;
import java.util.List;

import static day_12.updowncasting.AlimentarAnimais.alimentar;

public class updowncastingMain {
    public static void main(String[] args) {
        // passaro pombo = new passaro();
        //  Animal animal = pombo;
        // pombo.comer();
        List<Animal> animalLista = new ArrayList<Animal>();
        animalLista.add(new Passaro());
        animalLista.add(new Cachorro());
        for( Animal a : animalLista){
            alimentar(a);
        }
    }
}

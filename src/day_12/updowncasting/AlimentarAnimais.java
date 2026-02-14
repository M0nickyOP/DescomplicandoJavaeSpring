package day_12.updowncasting;

public class AlimentarAnimais {

    public static void alimentar(Animal animal){
        animal.comer();

        if (animal instanceof Cachorro){
            ((Cachorro)animal).latir();
        }
    }
}

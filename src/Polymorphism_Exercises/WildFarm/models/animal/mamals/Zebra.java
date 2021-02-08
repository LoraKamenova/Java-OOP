package Polymorphism_Exercises.WildFarm.models.animal.mamals;

import models.animal.base.Mammal;
import models.food.base.Food;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

}

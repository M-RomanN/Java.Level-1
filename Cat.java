package lesson7;

import java.util.Random;

public class Cat {

    private String name;
    private int appetite;
    public boolean satiety;


    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        System.out.println(this + " приготовился к трапезе.");
        int catEatFoodCount = new Random().nextInt(2, 6);
        plate.decreaseFood(catEatFoodCount);
        System.out.println(this + " съел " + catEatFoodCount + " единиц еды.");

     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    @Override
    public String toString() {
        return name;
    }

}
package lesson6;

import org.w3c.dom.ls.LSOutput;

public abstract class Animal {
    protected String breed;
    protected int maxSwimDistance;
    protected int maxRunDistance;

    abstract void run(int distance);

    abstract void swim(int distance);

    private static int count;
    private static int countDog;
    private static int countCat;

    public Animal(String breed, int runDistance, int swimDistance) {
        this.breed = breed;
        this.maxRunDistance = runDistance;
        this.maxSwimDistance = swimDistance;
        this.count++;

    }


    public static int getCountDog() {
        return countDog;
    }

    public static void setCountDog(int countDog) {
        Animal.countDog = countDog;
    }


    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    public void setMaxSwimDistance(int maxSwimDistance) {
        this.maxSwimDistance = maxSwimDistance;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Animal.count = count;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void printInfo() {
        System.out.printf("%s может: пробежать %s метров и проплыть %s метров. %n", breed, maxRunDistance, maxSwimDistance);
    }
}

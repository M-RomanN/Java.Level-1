package lesson6;

public class Cat extends Animal {
    private static int count;

    public Cat(String breed, int runDistance, int swimDistance) {
        super(breed, runDistance, swimDistance);
    }

    @Override
    void run(int distance) {
        if ((distance >= 0) && (distance <= maxRunDistance)) {
            System.out.printf("Кошка породы: '%s' пробежала %s метров.%n", breed, distance);
        } else {
            System.out.printf("Не ври, %s метров кошка породы: '%s' не пробежит!%n", distance, breed);
        }
    }

    @Override
    void swim(int distance) {
        System.out.printf("Кошки породы: '%s' не любят плавать!%n", breed);
    }

    public static int getCount() {
        return count;
    }


}

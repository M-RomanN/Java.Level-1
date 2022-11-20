package lesson6;

public class Dog extends Animal {
    private static int count;

    public Dog(String breed, int runDistance, int swimDistance) {
        super(breed, runDistance, swimDistance);
    }

    @Override
    void run(int distance) {
        if ((distance >= 0) && (distance <= maxRunDistance)) {
            System.out.printf("Собака породы: '%s' пробежала %s метров.%n", breed, distance);
        } else {
            System.out.printf("Не ври, %s метров собака породы: '%s' не пробежит!%n", distance, breed);
        }
    }

    @Override
    void swim(int distance) {
        if ((distance >= 0) && (distance <= maxSwimDistance)) {
            System.out.printf("Собака породы: '%s' пропыла %s метров.%n", breed, distance);
        } else {
            System.out.printf("Не ври, %s метров собака породы: '%s' не проплывёт!%n", distance, breed);
        }
    }

    public static int getCount() {
        return count;
    }

}

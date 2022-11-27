package lesson7;

public class Plate {

    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int foodToDecrease) {
        food -= foodToDecrease;
    }

    public void increaseFood(int foodToIncrease) {
        food += foodToIncrease;
    }


    @Override
    public String toString() {
        return "Plate[" + food + "]";
    }
}

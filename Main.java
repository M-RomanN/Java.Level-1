/*
--1. Расширить задачу про котов и тарелки с едой.
--2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
--3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
--4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
--5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
--6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
*/

package lesson7;

public class Main {

    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Jerry", 2, false);
        cat[1] = new Cat("Murzik", 2, false);
        cat[2] = new Cat("Gav", 2, false);
        Plate plate = new Plate(10);


        int i;
        for (i = 0; i < cat.length; i++) {

            if (cat[i].isSatiety() == false && cat[i].getAppetite() < plate.food) {
                cat[i].eat(plate);
                System.out.printf("%s покушал. %n", cat[i].getName());
                System.out.println("Остаток: " + plate);

            } else {
                System.out.printf("%s не поел. %n", cat[i].getName());
                System.out.println("Остаток: " + plate);
            }

        }


        // Кот, который ест из какой-то тарелки.
        /*
        Cat jerry = new Cat("Jerry", 5);
        Cat murzik = new Cat("Murzik", 3);
        Cat gav = new Cat("Gav", 4);
        Plate plate = new Plate(10);

        System.out.println(jerry);
        System.out.println(murzik);
        System.out.println(gav);
        System.out.println(plate);


        jerry.eat(plate); // OK
        murzik.eat(plate); // OK
        gav.eat(plate); // НЕ ОК. Не трогаем тарелку
        System.out.println(plate); // 2
        */

    }
}
/*Урок 6. Продвинутое ООП
        1. Создать классы Собака и Кот с наследованием от класса Животное.
        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
        Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
        4. * Добавить подсчет созданных котов, собак и животных.
*/

package lesson6;

public class Main {

    public static void main(String[] args) {
        Dog dogRetriever = new Dog("Ретривер", 500, 10);
        Cat catSiberian = new Cat("Сибирская", 200, 0);
        Cat catBengal = new Cat("Бенгальская", 200, 0);

        catSiberian.printInfo();
        dogRetriever.printInfo();
        catBengal.printInfo();

        System.out.println();

        dogRetriever.run(499);
        dogRetriever.swim(9);
        catSiberian.run(199);
        catSiberian.swim(0);
        catBengal.run(150);
        catBengal.swim(0);

        System.out.printf("%nВсего создано котов: " + Cat.getCount());
        System.out.printf("%nВсего создано собак: " + Dog.getCount());
        System.out.printf("%nВсего создано животных: " + Animal.getCount());
    }

}

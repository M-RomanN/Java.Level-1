package lesson5;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setFullName("Пушков Алексей Сергеевич");
        employee1.setPosition("Слесарь");
        employee1.setEmail("pas@mail.ru");
        employee1.setPhone("8-999-123-45-67");
        employee1.setSalary(111222.9);
        employee1.setAge(25);

        employee2.setFullName("Петушков Сергей Алексеевич");
        employee2.setPosition("Токарь");
        employee2.setEmail("psa@gmail.com");
        employee2.setPhone("8-999-765-43-21");
        employee2.setSalary(111233.);
        employee2.setAge(26);

        employee3.setFullName("Васнецова Юлия Алексеевна");

        employee4.setFullName("Чехова Наталья Алексеевна");
        employee4.setPosition("Гардеробщик");
        employee4.setPhone("8-999-879-87-87");
        employee4.setSalary(11233.11);
        employee4.setAge(59);

        employee5.setFullName("Волкова Марина Александровна");
        employee5.setPosition("Директор");
        employee5.setEmail("vma@inbox.ru");
        employee5.setPhone("8-999-505-55-55");
        employee5.setSalary(200000.0);
        employee5.setAge(41);

        employee1.printInfo();
        employee2.printInfo();
        employee3.printInfo();
        employee4.printInfo();
        employee5.printInfo();

        System.out.println("Всего сотруднников: " + Employee.getEmployeesCount());
        System.out.println();

        Employee[] employeesArray = {employee1, employee2, employee3, employee4, employee5};
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].getAge() > 40) {
                employeesArray[i].printInfo();

            }
        }
    }
}




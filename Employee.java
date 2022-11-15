package lesson5;

public class Employee {
    private static int employeesCount;
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private Double salary;
    private Integer age;

    public static int getEmployeesCount() {
        return employeesCount;
    }

    public Employee(String fullName, String position, String email, String phone, Double salary, Integer age) {
        setFullName(fullName);
        setPosition(position);
        setEmail(email);
        setPhone(phone);
        setSalary(salary);
        setAge(age);

        employeesCount++;
    }

    public Employee(String fullName) {
        this(fullName, "нет данных", "нет данных", "нет данных", 0.00, 14);
    }

    public Employee() {
        this("");
    }

    void printInfo() {
        System.out.println(String.format("Сотрудник: %s (возраст: %s лет), занимает должность: '%s', с окладом: %s руб." +
                " Телефон: %s и email: %s.", fullName, age, position, salary, phone, email));
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

}




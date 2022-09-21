package school.lesson3;


public class HomeWorkThree {
    public static void main(String[] args) {
        Employee.doCheck();

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Max", "dev", "qa@mail.com", "+25666545", 5, 50);
        persArray[1] = new Employee("Alex", "BA", "qa123@mail.com", "+26545", 100, 35);
        persArray[2] = new Employee("Jack", "PM", "qapm@mail.com", "+75525666545", 200, 60);
        persArray[3] = new Employee("Jhon", "PC", "pc@mail.com", "+125666545", 25, 41);
        persArray[4] = new Employee("Stephen", "lead", "lead@mail.com", "+250666545", 100, 40);
        for (Employee employee : persArray)
            if (employee.age > 40)
                System.out.println(employee.name + " " + employee.position + " " + employee.phoneNumber + " " + employee.salary + " " + employee.age);
    }

    public static class Employee {
        private String name;
        private String position;
        private String email;
        private String phoneNumber;
        private int salary;
        private int age;

        public Employee(String name, String position, String email,
                        String phoneNumber, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;

        }

        public static void doCheck() {
            Employee person = new Employee("yuliya", "qa", "test@test.com", "555655", 10, 10);
            System.out.println(person.name + "\n-" + person.position + "\n-" + person.email + "\n-" + person.phoneNumber + "\n-" + person.salary + "\n-" + person.age);

        }

    }

}












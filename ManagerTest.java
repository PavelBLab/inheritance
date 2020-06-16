package inheritance;

public class ManagerTest {
    public static void main(String[] args) {
        // construct a Manager object
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[4];

        // fill the staff array with Manger and Employee objects

        staff[0] = boss;
        staff[1] = new Manager("Tom Smith", 75000, 1980, 1, 1);
        staff[2] = new Employee("Harry Potter", 50000, 1987, 10, 1);
        staff[2].setSalary(65000);
        staff[3] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        // Cast
        Manager xxx = (Manager) staff[1];
        xxx.setBonus(5000);

        Manager[] managers = new Manager[4];
        System.out.println(managers instanceof Manager[]);
        Employee[] staff2 = managers;
        System.out.println(managers instanceof Manager[]);
        System.out.println(managers instanceof Employee[]);
        System.out.println(staff2 instanceof Manager[]);

        System.out.println("====>" + (staff[0].getClass() == staff[3].getClass()));
        System.out.println("====>" + (staff[0].getClass() == xxx.getClass()));
        System.out.println("====>" + (staff[2].getClass() == staff[3].getClass()));


        // print out information about all Employee objects
        for (Employee e: staff) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
        }

    }

}

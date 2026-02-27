public class employee {
    String name;
    int id;
    double salary;

    employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        employee ob = new employee("Nithin", 1, 20000);
        ob.display();
    }

}

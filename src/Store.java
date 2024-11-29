import java.util.ArrayList;

class Store {
    private int id;
    private String name;
    private String address;
    private ArrayList<Employee> employees;
    private ArrayList<String> products;

    public Store(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.employees = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        if (employees.size() < 20) {
            employees.add(employee);
        } else {
            System.out.println("Maximum employee capacity reached.");
        }
    }

    public void addProduct(String product) {
        products.add(product);
    }

    public void displayDetails() {
        System.out.println("Store ID: " + id + ", Name: " + name + ", Address: " + address);
        System.out.println("Products: " + products);
        System.out.println("Employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

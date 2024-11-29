public class StoreManagement {
    public static void main(String[] args) {
        // Create stores
        Store store1 = new Store(1, "Carrefour", "City Center");
        Store store2 = new Store(2, "Monoprix", "Menzah 6");

        // Add employees to store1
        store1.addEmployee(new Cashier(1, "Alice", "123 Main St", 190, 101));
        store1.addEmployee(new Cashier(2, "Bob", "456 Elm St", 170, 102));
        store1.addEmployee(new Salesperson(3, "Charlie", "789 Oak St", 0, 15.0));
        store1.addEmployee(new Manager(4, "Diana", "101 Pine St", 180, 500));

        // Add employees to store2
        store2.addEmployee(new Cashier(5, "Eve", "202 Maple St", 200, 103));
        store2.addEmployee(new Salesperson(6, "Frank", "303 Birch St", 0, 20.0));
        store2.addEmployee(new Salesperson(7, "Grace", "404 Cedar St", 0, 10.0));
        store2.addEmployee(new Salesperson(8, "Hank", "505 Walnut St", 0, 30.0));
        store2.addEmployee(new Manager(9, "Ivy", "606 Aspen St", 170, 700));

        // Add products to stores
        store1.addProduct("Apple");
        store1.addProduct("Banana");
        store2.addProduct("Orange");
        store2.addProduct("Milk");

        // Display store details
        store1.displayDetails();
        store2.displayDetails();
    }
}

// Base Employee Class
abstract class Employee {
    private int id;
    private String name;
    private String address;
    private int hoursPerMonth;

    public Employee(int id, String name, String address, int hoursPerMonth) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.hoursPerMonth = hoursPerMonth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getHoursPerMonth() {
        return hoursPerMonth;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Address: " + address +
                ", Hours Worked: " + hoursPerMonth;
    }
}

// Cashier Class
class Cashier extends Employee {
    private int registerNumber;

    public Cashier(int id, String name, String address, int hoursPerMonth, int registerNumber) {
        super(id, name, address, hoursPerMonth);
        this.registerNumber = registerNumber;
    }

    @Override
    public double calculateSalary() {
        double salary = getHoursPerMonth() * 5;
        if (getHoursPerMonth() > 180) {
            salary += (getHoursPerMonth() - 180) * 5 * 0.15;
        }
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Register Number: " + registerNumber;
    }
}

// Salesperson Class
class Salesperson extends Employee {
    private double salesRate;

    public Salesperson(int id, String name, String address, int hoursPerMonth, double salesRate) {
        super(id, name, address, hoursPerMonth);
        this.salesRate = salesRate;
    }

    @Override
    public double calculateSalary() {
        return 450 * (salesRate / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Sales Rate: " + salesRate + "%";
    }
}

// Manager Class
class Manager extends Employee {
    private double bonus;

    public Manager(int id, String name, String address, int hoursPerMonth, double bonus) {
        super(id, name, address, hoursPerMonth);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        double salary = getHoursPerMonth() * 10;
        if (getHoursPerMonth() > 160) {
            salary += (getHoursPerMonth() - 160) * 10 * 0.2;
        }
        return salary + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bonus: " + bonus;
    }
}

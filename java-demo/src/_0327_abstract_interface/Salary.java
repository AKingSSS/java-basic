package _0327_abstract_interface;

/**
 * @ClassName Salary
 * @Description
 * @Author yangkang
 * @Date 2020/3/27 17:46
 * @Version 1.0
 **/
public class Salary extends Employee {
    private double salary; // Annual salary

    public Salary(double salary) {
        this.salary = salary;
    }

    @Override
    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary / 52;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee = new Salary(520000);
        employee.setName("Python大星");
        double pay = employee.computePay();
        System.out.println("pay = " + pay);
    }
}

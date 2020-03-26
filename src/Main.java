public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Thinh","Bui", 1000);
        System.out.println(employee.getFullName());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.toString());
        System.out.println("Salary up to: " +employee.upTOSalary(10));

    }
}

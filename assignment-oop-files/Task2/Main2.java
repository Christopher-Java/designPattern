public class Main2 {
    public static void main(String[] args) {

        Role initialRole = new Role("Java-utvecklare");

        Employee employee = new Employee("Bosse", "IT", initialRole);
        System.out.println(employee);

        Role newRole = new Role("ScrumMaster");
        employee.addRoles(newRole);

        System.out.println(employee);

        employee.removeRole("Java-utvecklare");

        System.out.println(employee);
    }
}

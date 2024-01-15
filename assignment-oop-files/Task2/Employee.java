import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {

    private List<Role> roles;
    private String name;
    private String department;

    public Employee(String name, String department, Role initialRole) {
        this.name = name;
        this.department = department;
        this.roles = new ArrayList<>();
        this.addRoles(initialRole);

    }

    public void addRoles(Role role) {
        roles.add(role);
    }

    public void removeRole(String deleteRole) {
        Iterator<Role> iterator = roles.iterator();

        while (iterator.hasNext()) {
            Role role = iterator.next();

            if (deleteRole.equals(role.getRoleName())) {
                iterator.remove();
            }
            else{
                System.out.println("There is no role with that name!");
            }
        }
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "roles=" + roles +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

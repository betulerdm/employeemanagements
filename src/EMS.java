import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class EMS <T extends Person> implements EmployeeOperations<T> {
    protected Map<String, T> employeeMap = new HashMap<>();
    private List<T> employeeList = new ArrayList<>();

    @Override
    public void addEmployee(T employee) {
        employeeMap.put(employee.getName(), employee);
        employeeList.add(employee); // Added to the List as well
        System.out.println("Employee added successfully!");

    }

    @Override
    public void removeEmployee(String employeeId) {
        if (employeeMap.containsKey(employeeId)) {
            employeeMap.remove(employeeId);  // Remove from the List as well
            System.out.println("Employee removed successfully!");
        } else {
            System.out.println("Employee with ID " + employeeId + " not found.");
        }


    }

    @Override
    public void updateEmployee(String employeeId, Consumer<T> updateFunction) {
        if (employeeMap.containsKey(employeeId)) {
            T employee = employeeMap.get(employeeId);
            updateFunction.accept(employee);
            System.out.println("Employee information updated successfully!");
        } else {
            System.out.println("Employee with ID " + employeeId + " not found.");
        }

    }

    @Override
    public void viewEmployee(String employeeId) {
        if (employeeMap.containsKey(employeeId)) {
            T employee = employeeMap.get(employeeId);
            System.out.println(employee);
        } else {
            System.out.println("Employee with ID " + employeeId + " not found.");
        }

    }
}


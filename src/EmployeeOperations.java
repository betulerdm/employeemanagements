import java.util.function.Consumer;

public interface EmployeeOperations<T extends Person> {
    void addEmployee(T employee);
    void removeEmployee(String employeeId);
    void updateEmployee(String employeeId, Consumer<T> updateFunction);
    void viewEmployee(String employeeId);
}

import java.util.Map;
import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EMS<Employee> employeeManagementSystem= new EMS<>();

        while (true){
            System.out.println("\nPlease Enter choice:");
            System.out.println("1: Add new employee");
            System.out.println("2: See All Employee Details");
            System.out.println("3: Remove Employee");
            System.out.println("4: Update Employee Details");
            System.out.println("5: See Employee Details");
            System.out.println("6: Exit the EMS Portal");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("Enter employee details:");
                        System.out.print("Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Surname: ");
                        String surname = scanner.nextLine();
                        System.out.print("Worker ID: ");
                        String workerId = scanner.nextLine();
                        System.out.print("Salary: ");
                        double salary = Double.parseDouble(scanner.nextLine());
                        System.out.print("age: ");
                        String age = scanner.nextLine();

                        Employee newEmployee = new Employee(name, surname, workerId, salary,age);
                        employeeManagementSystem.addEmployee(newEmployee);
                        System.out.print("Do you want to add another employee? (yes/no): ");
                        String addAnother = scanner.nextLine().toLowerCase();
                        if (!addAnother.equals("yes")) {
                            break;  // Exit the loop if the user doesn't want to add another employee
                        }
                    }

                break;

                case 2:
                    System.out.println("\nAll Employees:");
                    for (Map.Entry<String, Employee> entry : ((EMS<Employee>) employeeManagementSystem).employeeMap.entrySet()) {
                        System.out.println(entry.getValue());
                    }
                    break;

                case 3:
                    System.out.print("\nPlease Enter Employee's ID: ");
                    String removeId = scanner.nextLine();
                    employeeManagementSystem.removeEmployee(removeId);
                    break;

                case 4:
                    System.out.print("\nPlease Enter Employee's ID: ");
                    String updateId = scanner.nextLine();
                    employeeManagementSystem.viewEmployee(updateId);
                    System.out.print("Please Enter the detail you want to Update: ");
                    String field = scanner.nextLine();
                    System.out.print("Please Enter the Updated Info: ");
                    String updatedInfo = scanner.nextLine();

                    if (field.equalsIgnoreCase("name")){
                        employeeManagementSystem.updateEmployee(updateId, e -> e.name= updatedInfo);

                    } else if (field.equalsIgnoreCase("surname")) {
                        employeeManagementSystem.updateEmployee(updateId, e -> e.surname= updatedInfo);
                        
                    }else if (field.equalsIgnoreCase("workerId")) {
                        employeeManagementSystem.updateEmployee(updateId, e -> ((Employee) e).workerId = updatedInfo);

                    }else if (field.equalsIgnoreCase("salary")) {
                        employeeManagementSystem.updateEmployee(updateId, e -> ((Employee) e).salary = Double.parseDouble(updatedInfo));

                    } else if (field.equalsIgnoreCase("age")) {
                        employeeManagementSystem.updateEmployee(updateId, e -> ((Employee) e).age = String.valueOf(Double.parseDouble(updatedInfo)));

                    } else {
                System.out.println("Invalid field!");
            }

            break;
                case 5:
                    System.out.print("\nPlease Enter Employee's ID: ");
                    String employeeId = scanner.nextLine();
                    employeeManagementSystem.viewEmployee(employeeId);
                    break;


                case 6:
                    System.out.println("Exiting the EMS Portal...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }




        }









        }

        }


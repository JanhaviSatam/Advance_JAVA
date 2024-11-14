package Collections_API_3;
import java.util.*;

public class second_lecture {
    static ArrayList<Employee_2_1> employees = new ArrayList<Employee_2_1>();
    static Scanner scanner = new Scanner(System.in);

 
    public static void insert() {
        System.out.print("Enter Employee Number: ");
        int empNo = scanner.nextInt();
        System.out.print("Enter Employee Name: ");
        scanner.nextLine(); 
        String empName = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double empSalary = scanner.nextDouble();
        employees.add(new Employee_2_1(empNo, empName, empSalary)); // very important line
        System.out.println("Employee added successfully.");
    }

  
    public static void update() {
        System.out.print("Enter Employee Number to update: ");
        int empNo = scanner.nextInt();
        for (Employee_2_1 emp : employees) {
            if (emp.getEmpNo() == empNo) {
                System.out.print("Enter new Employee Name: ");
                scanner.nextLine(); // consume newline
                emp.setEmpName(scanner.nextLine());
                System.out.print("Enter new Employee Salary: ");
                emp.setEmpSalary(scanner.nextDouble());
                System.out.println("Employee updated successfully.");
               
            }
        }
        System.out.println("Employee not found.");
    }

    public static void delete() {
        System.out.print("Enter Employee Number to delete: ");
        int empNo = scanner.nextInt();
        for (Employee_2_1 emp : employees) {
            if (emp.getEmpNo() == empNo) {
                employees.remove(emp);
                System.out.println("Employee deleted successfully.");
               
            }
        }
        System.out.println("Employee not found.");
    }

    
    public static void display() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee_2_1 emp : employees) {
                System.out.println(emp);
            }
        }
    }


    public static void search() {
        System.out.print("Enter Employee Number to search: ");
        int empNo = scanner.nextInt();
        for (Employee_2_1 emp : employees) {
            if (emp.getEmpNo() == empNo) {
                System.out.println(emp);
                
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Search Employee");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: insert(); 
                        break;
                case 2: update();
                        break;
                case 3: delete(); 
                        break;
                case 4: display(); 
                        break;
                case 5: search(); 
                        break;
                case 6: System.exit(0);
                default: System.out.println("Invalid option.");
            }
        }
    }
}

	

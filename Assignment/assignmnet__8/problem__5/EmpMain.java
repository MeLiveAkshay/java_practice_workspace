package assignment.assignmnet__8.problem__5;

import java.util.Scanner;

public class EmpMain
{
    public static void main(String[] args)
    {
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);

            System.out.println("Enter Emp ID: ");
            int id = scanner.nextInt();
           scanner.nextLine();

            System.out.println("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Designation (Manager/Officer/Clerk): ");
            String designation = scanner.nextLine();

            System.out.print("Enter Basic Salary: ");
            double basic = scanner.nextDouble();

            
            Emp employee = new Emp(id, name, designation, basic);
            employee.printDetails();

        } catch (LowSalException exception)
        {
            System.out.println("Error: " + exception.getMessage());
        } catch (Exception e)
        {
            System.out.println("Invalid input. Please try again.");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}

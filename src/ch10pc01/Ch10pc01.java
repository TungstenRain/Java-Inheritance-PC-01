package ch10pc01;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Frank
 * date 11/23/2017
 * Purpose: To demonstrate the Employee superclass and the ProductionWorker subclass
 */
public class Ch10pc01 {

    public static void main(String[] args) {
        //variables
        String name;
        String employeeID;
        String date;
        LocalDate hireDate;
        int shift;
        double payRate;
        boolean validID , validDate, validShift;
        
        //create Scanner object keyboard
        Scanner keyboard = new Scanner(System.in);
                
        //Request input from user
        System.out.print("Please enter the name of the employee hired: ");
        name = keyboard.nextLine();
        do {
            System.out.print("Please enter the employee's ID: ");
            employeeID = keyboard.nextLine();
            if (Employee.validID(employeeID))
                validID = true;
            else {
                System.out.println("Invalid employee ID.  Please use the appropriate format (NNN-L).");
                validID = false;
            }
        } while (!validID);
        
        do{
            System.out.print("Please enter the employee's hire date: ");
            date = keyboard.nextLine();
            if (Employee.validDate(date))
                    validDate = true;
            else {
                System.out.println("Invalid date.  Please use the appropriate format (MM/DD/YYYY).");
                validDate = false;
            }
        }while (!validDate);
        //convert date from String into LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        hireDate = LocalDate.parse(date, formatter);
        
        do {
            System.out.print("Please enter the employee's shift (1 for dayshift, 2 for nightshift): ");
            shift = keyboard.nextInt();
            if (ProductionWorker.validShift(shift))
                validShift = true;
            else {
                System.out.println("Invalid shift.  Please enter a valid shift.");
                validShift = false;
            }
        } while (!validShift);
        
        System.out.print("Please enter the employee's wage: ");
        payRate = keyboard.nextDouble();
        
        //Instantiate the ProductionWorker class
        ProductionWorker employee = new ProductionWorker(name, employeeID, hireDate, shift, payRate);
        
        //Display output to user:
        System.out.print("Congratulations on hiring " + employee.name + " on " + employee.hireDate + ".  The employee will receive a wage of $" + employee.payRate + ".");
    }
}

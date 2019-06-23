package ch10pc01;
import java.time.LocalDate;
import java.util.regex.Pattern;

/**
 *
 * @author Frank
 * 
 * purpose: Employee superclass
 */
public class Employee {
    //fields
    public String name;
    public String employeeID;
    public LocalDate hireDate;
    
    //constructors
    public Employee(){
        name = "";
        employeeID = "";
        hireDate = LocalDate.now();
    }
    
    public Employee (String name, String employeeID, LocalDate hireDate){
        this.name = name;
        this.employeeID = employeeID;
        this.hireDate = hireDate;
    }
    
    //methods
    //accessors
    public String getName(){
        return name;
    }
    public String getEmployrrID(){
        return employeeID;
    }
    public LocalDate getDate(){
        return hireDate;
    }
    
    //mutators
    public void setEmployeeName(String name){
        this.name = name;
    }
    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }
    public void setHireDate (LocalDate hireDate){
        this.hireDate = hireDate;
    }
    
    //validators
    public static boolean validID(String eID){
        //must fit the following format
        // XXX-L where X = number, and L
        // is a letter from A-M
        //regex code: [A-M]{3}\-\d
        String REGEX = "[A-Ma-m]{3}-\\d";
        
        return Pattern.matches(REGEX, eID);        
    }
    public static boolean validDate(String date){
        // MM/DD/YYYY
        String REGEX = "\\d{2}/\\d{2}/\\d{4}";
        
        return Pattern.matches(REGEX, date);
    }
}

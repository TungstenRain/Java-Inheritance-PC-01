package ch10pc01;

import java.time.LocalDate;


/**
 *
 * @author Frank
 * 
 * purpose: subclass to Employee superclass
 */
public class ProductionWorker extends Employee{
    //fields
    public int shift;
    public double payRate;
    
    //constructors
    public ProductionWorker(){
        name = "";
        employeeID = "";
        hireDate = LocalDate.now();
        shift = 0;
        payRate = 0.0;
    }
    public ProductionWorker(String name, String employeeID, LocalDate hireDate, int shift, double payRate){
        this.name = name;
        this.employeeID = employeeID;
        this.hireDate = hireDate;
        this.shift = shift;
        this.payRate = payRate;
    }
    
    //methods
    //accessors
    public int getShift(){
        return shift;
    }
    public double getRayRate(){
        return payRate;
    }
    
    //mutators
    public void setShift(int shift){
        this.shift = shift;
    }
    public void setPayRate(double payRate){
        this.payRate = payRate;
    }
    
    //validators
    public static boolean validShift(int shift){
        if (shift == 1 || shift == 2)
            return true;
        else
            return false;
    }
}

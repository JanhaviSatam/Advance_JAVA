package Collections_API_3;

import java.util.*;


class Employee_2_1 {
    int empNo;
    String empName;
     double empSalary;

 
    public Employee_2_1(int empNo, String empName, double empSalary) {
        this.empNo = empNo;
        this.empName = empName;
        this.empSalary = empSalary;
    }

  
    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }
 
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    
    @Override
    public String toString() {
        return "Employee Number: " + empNo + ", Name: " + empName + ", Salary: " + empSalary;
    }
}
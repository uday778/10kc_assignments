package com.company.app;
import com.company.hr.Employee;
import com.company.admin.Department;

public class CompanyApp {
    public static void main(String[] args) {
        Employee emp=new Employee();
        Department dept=new Department();

        emp.setId(21);
        emp.setName("uday");
        emp.setSalary(120000.000);
        emp.showDepartmentDetails();

        System.out.println("++++++++++++");

        dept.setDeptName("engineering");
        dept.setDeptId(100);
        dept.showDepartmentDetails();
   }
}










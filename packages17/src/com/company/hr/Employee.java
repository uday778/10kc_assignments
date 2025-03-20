package com.company.hr;

public class Employee {
    private int id;
    private  String name;
    private  double salary;

    public String getname(){
        return name;
    }
     public int getId(){
        return id;
    }
     public double getsalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }

    public void showDepartmentDetails(){
        System.out.println("salary: "+salary);
        System.out.println("name: "+name);
        System.out.println("id: "+ id);
    }


}

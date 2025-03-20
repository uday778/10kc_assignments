package com.company.admin;

public class Department {
    private String deptName;
    private int deptId;


    public  void setDeptName(String deptName){
        this.deptName=deptName;
    }
    public  void setDeptId(int id){
        this.deptId=id;
    }
    public String getDeptName(){
        return deptName;
    }
    public int getDeptId(){
        return deptId;
    }

    public void showDepartmentDetails(){
        System.out.println("deptName :"+deptName);
        System.out.println("deptId :"+deptId);
    }

}

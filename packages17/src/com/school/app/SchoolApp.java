package com.school.app;
import  com.school.management.School;
import  com.school.staff.PrincipalName;

public class SchoolApp {
    public static void main(String[] args) {
        School school=new School();
        school.setName("model school");
        school.setLocation("jagtial");

        PrincipalName principalname=new PrincipalName();
        principalname.setPrincipalName("raj kumar");
        principalname.setExperienceYears(10);

        school.showSchoolInfo();
        System.out.println("__________");
        principalname.showPricipalInfo();
    }
}

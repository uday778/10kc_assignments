package com.school.staff;

public  class PrincipalName {
    private String principalName;
    private int experienceYears;

    public String getPrincipalName(){
        return principalName;
    }
    public int getExperienceYears(){
        return experienceYears;
    }
    public void setExperienceYears(int years){
        this.experienceYears=years;
    }
    public void setPrincipalName(String name){
        this.principalName=name;
    }
    public void showPricipalInfo(){
        System.out.println("pricipalname"+principalName);
        System.out.println("experience"+experienceYears);
    }
}

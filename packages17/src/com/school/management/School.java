package com.school.management;

    public class School{
        private String name;
        private String location;

        public String getName(){
            return name;
        }
        public String getLocation(){
            return location;
        }
        public void setName(String name){
            this.name=name;
        }
        public void setLocation(String location){
            this.location=location;
        }
        public void showSchoolInfo(){
            System.out.println("school name: "+name);
            System.out.println("location :"+location);
        }


    }


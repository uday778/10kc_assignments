public class MyClass{
    
    // 1.	Check Even or Odd
    public boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }

    //2.	Check Positive or Negative
    public String checkNumber(int num){

        if(num>0)
            return "Positive";
        else if(num<0)
            return "Negative";
        return "Zero";
    } 

    // 3.	Check Eligibility to Vote
    public boolean canVote(int age){
        if(age>=18) 
            return true;
        return false;
    }

    // 4.	Find the Greater Number
    public int findGreater(int num1,int num2){
        if(num1>num2) return num1;
        if(num2>num1)return num2;
        return num1;
    }
    // 5.	Check Divisibility by 5
    public boolean isDivisibleBy5(int num){
        if(num%5==0) return true;
        return false;
    }


    public static void main(String []args){
        MyClass  obj=new  MyClass();

        System.out.println("Is 10 is even ? :"+ obj.isEven(10));

        System.out.println("Check -5: " + obj.checkNumber(-5));
        
        System.out.println("Can vote (Age 20)? " + obj.canVote(20));

        System.out.println("Greater number (10, 25): " + obj.findGreater(10, 25));

        System.out.println("Is 15 divisible by 5? " + obj.isDivisibleBy5(15));




    }
}
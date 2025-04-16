public class AllOverridingExamples {

   
    static class Animal {
        void makeSound() {
            System.out.println("Animal sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Bark");
        }
    }

    public static void runAnimalExample() {
        System.out.println("---- Example 1: Basic Method Overriding ----");
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.makeSound(); 
        dog.makeSound();  
    }

    
    static class Vehicle {
        void start() {
            System.out.println("Vehicle started");
        }
    }

    static class Car extends Vehicle {
        @Override
        void start() {
            System.out.println("Car started");
        }
    }

    public static void runVehicleExample() {
        System.out.println("\n---- Example 2: Overriding with @Override Annotation ----");
        Vehicle v = new Vehicle();
        Car c = new Car();

        v.start(); // 
        c.start(); // 
    }

    
    static class Person {
        protected void display() {
            System.out.println("I am a person");
        }
    }

    static class Student extends Person {
        @Override
        public void display() {
            System.out.println("I am a student");
        }
    }

    public static void runPersonExample() {
        System.out.println("\n---- Example 3: Overriding with Access Modifiers ----");
        Student s = new Student();
        s.display(); 
    }

   
    public static void main(String[] args) {
        runAnimalExample();
        runVehicleExample();
        runPersonExample();
    }
}

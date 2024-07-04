// Polymorphism allows methods to do different things based on the object it is acting upon, even if they share the same name.

/*
* There are two types of Polymorphism
*
* 1. Compile-time Polymorphism (Method Overloading): Same method name but different parameters.
*
* 2. Runtime Polymorphism (Method Overriding): A child class provides a specific implementation of a method that is already defined in its parent class.
*
* */

public class Polymorphism {

    // Compile-time Polymorphism

    public static class MathOperations {
        // Overloaded methods

        private int a;
        private int b;
        private int c;

        public MathOperations(int a, int b, int c) { // constructor

            this.a = a;
            this.b = b;
            this.c = c;

        }

        public int add(int a, int b) {

            this.a = a;
            this.b = b;

            return (a+b);
        }

        public int add(int a, int b, int c ) {

            this.a = a;
            this.b = b;
            this.c = c;

            return(a+b+c);
        }

    }

    // Runtime Polymorphism (overriding the method inherited from a parent class and providing your own output)

    public static class Animal {

        public Animal () {

        }

        public void sound() {

            System.out.println("This animal makes a sound.");

        }

    }

    public static class Dog extends Animal{

        private String name;

        public Dog(String name) {

            this.name = name;

        }

        @Override
        public void sound() {

            System.out.println("The dog " + name + ", barks!");

        }

    }


    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 15;

        MathOperations mathOperations = new MathOperations(a, b, c); // instantiate the class

        int n1 = mathOperations.add(a , b); // calls first method

        System.out.println(n1);

        int n2 = mathOperations.add(a , b, c); // calls second method

        System.out.println(n2);

        Animal generic_animal = new Animal();

        generic_animal.sound(); // default parent class method

        Dog dog1 = new Dog("Chico"); // instantiate the class

        dog1.sound(); // overriden method.

    }

}

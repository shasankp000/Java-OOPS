/*
* Abstraction is the concept of hiding the complex
* implementation details and showing only the
* necessary features of an object.
*
* Abstract Class: A class that cannot be instantiated and can contain
* abstract methods (methods without implementation).
*
* Interface: A reference type in Java, it is similar to
* class and is a collection of abstract methods.
* A class implements an interface, thereby
* inheriting the abstract methods of the interface.
*
* */

abstract class Animal { // abstract class

    // abstract method

   abstract void sound();


}

// or

interface Animal2 {

    void sound();

}


public class Abstraction {

    public static class Dog extends Animal {

        private String name;

        public Dog(String name) { // constructor

            this.name = name;

        }

        @Override
        void sound() {

            System.out.println("The dog " + name + ", barks!");

        }

    }

    public static class Cat implements Animal2 { // inheriting from an interface needs the keyword "implements"

        private String name;

        public Cat(String name) { // constructor

            this.name = name;

        }

        @Override
        public void sound() { // overriden methods from interface need to be set to public

            System.out.println("The cat " + name + ", meows!");

        }

    }



    public static void main(String[] args) {

        Dog dog1 = new Dog("Chico");
        dog1.sound();

        Cat cat1 = new Cat("Sparkles");
        cat1.sound();

    }

}

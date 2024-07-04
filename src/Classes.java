// classes and methods

// Class: A blueprint for creating objects (a particular data structure), containing methods and properties.

public class Classes {

    public static class Dog {

        private String name;
        private int age;

        public Dog(String name, int age) { // create a constructor for the class

            this.name = name;
            this.age = age;

        }


        // creating a method


        public void bark() {

            System.out.println(name + " of age " + age + " is barking");

        }

    }

    public static void main(String[] args) {

        // instantiate the class by creating an object.

        Dog dog = new Dog("Chico", 5);

        dog.bark(); // call the method


    }


}



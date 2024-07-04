// Inheritance is a mechanism where a new class (child class) inherits properties and methods from an existing class (parent class).


public class Inheritance {

    public static class Animal {

        static boolean eats = true;

        public static void eatsFood() {

            if (eats) {

                System.out.println("This animal eats!");

            }

        }
    }

    public static class Cat extends Animal {

        String name;
        int age;

        public Cat(String name, int age) {

            this.name = name;
            this.age = age;

        }

        public void meow() {

            System.out.println("The cat " + name + ", meows." );

        }

    }


    public static void main(String[] args) {

        Cat cat1 = new Cat("Miles", 10);

        cat1.meow(); // own method
        cat1.eatsFood(); // inherited method from the parent class.


    }

}

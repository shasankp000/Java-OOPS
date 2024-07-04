/*
* Encapsulation is the technique of making the fields in a class private and
* providing access to the fields via public methods (getters and setters).
* */

public class Encapsulation {

    public static class Person {

        private String name;
        private int age;

        public Person(String name, int age) { // constructor

            this.name = name;
            this.age = age;

            // kinda acts as a setter.

        }

        // getter for name
        public String getName() {

            return name;
        }

        // setter for age
        public void setName(String name) {

            this.name = name;
        }

        // getter for age
        public int getAge() {

            return age;
        }

        // setter for age
        public void setAge(int age) {

            this.age = age;
        }
    }


    public static void main(String[] args) {

        Person person1 = new Person("", 0); // instantiate the class.
        person1.setName("Aiden");
        person1.setAge(35);

        String name = person1.getName();
        System.out.println("Name: " + name);
        int age = person1.getAge();
        System.out.println("Age: " + age);


    }

}

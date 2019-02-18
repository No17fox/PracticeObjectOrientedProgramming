package main.java.company;

import main.java.company.model.Person;
import main.java.company.model.Student;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person(0001, "Tom", 20);
        Person person2 = new Person(0001, "Tom", 20);
        Person person3 = new Person(0002, "Tom", 20);
        System.out.println(person1.introduce());
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person1.hashCode() == person2.hashCode());
        System.out.println(person1.hashCode() == person3.hashCode());

        Student student1 = new Student(0001, "Tom", 20, 2);
        Student student2 = new Student(0001, "Tom", 20, 3);
        System.out.println(student1.introduce());
        System.out.println(student1.equals(student2));
    }
}

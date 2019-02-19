package main.java.company;

import main.java.company.model.Class;
import main.java.company.model.Person;
import main.java.company.model.Student;
import main.java.company.model.Teacher;

public class Main {

    public static void main(String[] args) {
        System.out.println("Add a class named Person, it should have field as id, name, and age:");
        Person person1 = new Person(0001, "Tom", 20);
        System.out.println(person1.toString());

        System.out.println("\nPerson should have a introduce method:");
        System.out.println(person1.introduce());

        System.out.println("\nPerson should have a method to judge the same person by id:");
        Person person2 = new Person(0001, "Tom", 20);
        Person person3 = new Person(0002, "Tom", 20);
        System.out.println("is same person: " + person1.equals(person2));
        System.out.println("is same person: " + person1.equals(person3));
        System.out.println("is same person: " + (person1.hashCode() == person2.hashCode()));
        System.out.println("is same person: " + (person1.hashCode() == person3.hashCode()));

        System.out.println("\nAdd a class named Class, it should have field as number, leader, and teacher:");
        Class klass1 = new Class(1);
        System.out.println(klass1.toString());

        System.out.println("\nAdd a class named Student, it should have field as class in addition to the fields of Person:");
        Student student1 = new Student(0001, "Tom", 20, klass1);
        System.out.println(student1.toString());

        System.out.println("\nStudent should have a introduce method:");
        System.out.println(student1.introduce());

        System.out.println("\nClass should have a method to assignLeader:");
        klass1.assignLeader(student1);
        System.out.println(klass1.toString());
        System.out.println(student1.introduce());
        Class klass2 = new Class(2);
        klass2.assignLeader(student1);
        klass2.appendMenber(student1);
        klass2.assignLeader(student1);
        System.out.println(student1.introduce());

        System.out.println("\nAdd a class named Teacher, it should have field as classes in addition to the fields of Person:");
        Teacher teacher = new Teacher(0001, "Tom", 20);
        System.out.println(teacher.toString());

        System.out.println("\nTeacher should have a introduce method:");
        System.out.println(teacher.introduce());
        teacher.setClasses(klass1);
        teacher.setClasses(klass2);
        System.out.println(teacher.introduce());

        System.out.println("\nTeacher should have a method to judge if a student is in his/her class:");
        System.out.println("is teaching: " + teacher.isTeaching(student1));
        Class klass3 = new Class(3);
        Student student3 = new Student(0001, "Jerry", 20, klass3);
        System.out.println("is teaching: " + teacher.isTeaching(student3));

        System.out.println("\nTeacher should noice the changes in class member:");
        klass3.setTeacher(teacher);
        System.out.println(klass3.toString());
        klass3.appendMenber(student3);
        klass3.assignLeader(student3);
    }
}

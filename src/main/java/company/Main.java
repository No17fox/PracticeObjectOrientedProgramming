package main.java.company;

import main.java.company.model.Class;
import main.java.company.model.Person;
import main.java.company.model.Student;
import main.java.company.model.Teacher;

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

        Class klass1 = new Class(1);
        Student student1 = new Student(0001, "Tom", 20, klass1);
        Student student2 = new Student(0001, "Tom", 20, klass1);
        System.out.println(student1.introduce());
        System.out.println(student1.equals(student2));

        klass1.assignLeader(student1);
        System.out.println(klass1.getNumber());
        System.out.println(klass1.getLeader().getName());
        System.out.println(student1.introduce());

        Class klass2 = new Class(2);
        klass2.assignLeader(student1);
        klass2.appendMenber(student1);
        klass2.assignLeader(student1);
        System.out.println(student1.introduce());

        Teacher teacher = new Teacher(0001, "Tom", 20);
        System.out.println(teacher.introduce());
        teacher.setClasses(klass1);
        teacher.setClasses(klass2);
        System.out.println(teacher.introduce());

        System.out.println(teacher.isTeaching(student1));
        Class klass3 = new Class(3);
        Student student3 = new Student(0001, "Jerry", 20, klass3);
        System.out.println(teacher.isTeaching(student3));

        klass3.setTeacher(teacher);
        klass3.appendMenber(student3);
        klass3.assignLeader(student3);
    }
}

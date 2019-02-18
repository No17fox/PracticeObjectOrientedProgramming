package main.java.company.model;

public class Student extends Person {
    private int klass;

    public Student(int id, String name, int age, int klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + "I am a Student. I am at Class " + this.klass + ".";
    }

    public int getKlass() {
        return this.klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}

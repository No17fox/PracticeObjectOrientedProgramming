package main.java.company.model;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        boolean isLeader = (this.klass.getLeader() != null) && this.equals(this.klass.getLeader());
        if (isLeader) {
            return super.introduce() + "I am a Student. I am Leader of Class " + this.klass.getNumber() + ".";
        }
        return super.introduce() + "I am a Student. I am at Class " + this.klass.getNumber() + ".";
    }

    public Klass getKlass() {
        return this.klass;
    }

}

package main.java.company.model;

public class Student extends Person {
    private Class klass;

    public Student(int id, String name, int age, Class klass) {
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

    public Class getKlass() {
        return this.klass;
    }

    public void setKlass(Class klass) {
        this.klass = klass;
    }
}

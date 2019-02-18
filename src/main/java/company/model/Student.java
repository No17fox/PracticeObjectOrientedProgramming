package main.java.company.model;

public class Student extends Person {
    private Class aClass;

    public Student(int id, String name, int age, Class aClass) {
        super(id, name, age);
        this.aClass = aClass;
    }

    @Override
    public String introduce() {
        boolean isLeader = (this.aClass.getLeader() != null) && this.equals(this.aClass.getLeader());
        if (isLeader) {
            return super.introduce() + "I am a Student. I am Leader of Class " + this.aClass.getNumber() + ".";
        }
        return super.introduce() + "I am a Student. I am at Class " + this.aClass.getNumber() + ".";
    }

    public Class getaClass() {
        return this.aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }
}

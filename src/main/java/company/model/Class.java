package main.java.company.model;

public class Class {
    private final int number;
    private Student leader;

    public Class(int number) {
        this.number = number;
    }

    public void assignLeader(Student student) {
        if (student.getKlass().equals(this)) {
            this.leader = student;
        } else {
            System.out.println("It is not one of us");
        }
    }

    public void appendMenber(Student student) {
        student.setKlass(this);
    }

    @Override
    public boolean equals(Object object) {
        return this.number == ((Class)object).getNumber();
    }

    @Override
    public int hashCode() {
        return this.number;
    }

    public int getNumber() {
        return this.number;
    }

    public Student getLeader() {
        return this.leader;
    }
}

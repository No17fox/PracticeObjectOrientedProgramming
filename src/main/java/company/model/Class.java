package main.java.company.model;

public class Class {
    private final int number;
    private Student leader;

    public Class(int number) {
        this.number = number;
    }

    public void assignLeader(Student student) {
        this.leader = student;
    }

    public int getNumber() {
        return this.number;
    }

    public Student getLeader() {
        return this.leader;
    }
}

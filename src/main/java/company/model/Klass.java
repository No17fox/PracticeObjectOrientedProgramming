package main.java.company.model;

public class Klass {
    private final int number;
    private Student leader;

    public Klass(int number) {
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

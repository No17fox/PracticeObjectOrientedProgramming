package main.java.company.model;

public class Class {
    private final int number;
    private Student leader;
    private Teacher teacher;

    public Class(int number) {
        this.number = number;
    }

    public void assignLeader(Student student) {
        if (isIn(student)) {
            this.leader = student;
            if (teacher != null) {
                System.out.println(teacher.noticeAssignLeader(student));
            }
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public void appendMenber(Student student) {
        student.setKlass(this);
        if (teacher != null) {
            System.out.println(teacher.noticeAddAStudent(student));
        }
    }

    public boolean isIn(Student student) {
        return student.getKlass().equals(this);
    }

    @Override
    public boolean equals(Object object) {
        return this.number == ((Class) object).getNumber();
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

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
        teacher.setClasses(this);
    }
}

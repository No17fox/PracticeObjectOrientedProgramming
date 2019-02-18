package main.java.company.model;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private List<Class> classes = new ArrayList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        if (this.classes.isEmpty()) {
            return super.introduce() + "I am a Teacher. I teach No class.";
        }
        List<String> classNumber = new ArrayList<>();
        for (Class klass : this.classes) {
            classNumber.add(String.valueOf(klass.getNumber()));
        }
        return super.introduce() + "I am a Teacher. I teach Class " + String.join(",", classNumber) + ".";
    }

    public boolean isTeaching(Student student) {
        boolean result = false;
        for (Class klass : classes) {
            result = result || klass.isIn(student);
        }
        return result;
    }

    public List<Class> getClasses() {
        return this.classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }
}

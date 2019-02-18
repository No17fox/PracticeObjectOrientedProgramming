package main.java.company.model;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private Class[] classes = new Class[3];

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        if (this.classes[0] == null) {
            return super.introduce() + "I am a Teacher. I teach No class.";
        }
        List<String> teachedClass = new ArrayList<>();
        for (int i = 0; i < this.classes.length; i++) {
            teachedClass.add(String.valueOf(this.classes[i].getNumber()));
        }
        return super.introduce() + "I am a Teacher. I teach Class " + String.join(",", teachedClass) + ".";
    }

    public boolean isTeaching(Student student) {
        boolean result = false;
        for (Class klass : classes) {
            result = result || klass.isIn(student);
        }
        return result;
    }

    public Class[] getClasses() {
        return this.classes;
    }

    public void setClasses(Class[] classes) {
        this.classes = classes;
    }
}

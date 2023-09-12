package ru.kk.university.entity;

public class University {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void employmentTeacher(Teacher teacher) {
        System.out.println(this.name + " успешно зарегистрировал учителя " + teacher.getName() + " в своей базе данных.");
    }

    public void enrollStudent(Student student) {
        System.out.println("Студент " + student.getName() + " успешно поступил в " + this.name + ".");
    }
}

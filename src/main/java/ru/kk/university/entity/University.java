package ru.kk.university.entity;

public class University {
    public String name;

    public void employmentTeacher(Teacher teacher) {
        System.out.println( this.name + " успешно зарегистрировал учителя " + teacher.name + " в своей базе данных.");
    }

    public void enrollStudent(Student student) {
        System.out.println("Студент " + student.name + " успешно поступил в " + this.name + ".");
    }
}

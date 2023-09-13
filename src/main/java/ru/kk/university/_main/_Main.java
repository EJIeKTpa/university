package ru.kk.university._main;

import ru.kk.university.entity.Actions;
import ru.kk.university.entity.Student;
import ru.kk.university.entity.Teacher;
import ru.kk.university.entity.University;

import static ru.kk.university.service.PerformAction.performAction;

public class _Main {
    private static Actions actions;

    public static void main(String[] args) {
        University university = new University();
        university.setName("Массачусетский технологический институт");
        Teacher teacher = new Teacher();
        teacher.setName("Peter Diamond");
        teacher.setUniversity(university);
        Student student = new Student();
        student.setName("Michel Mind");
        student.setUniversity(university);
        university.employmentTeacher(teacher);
        university.enrollStudent(student);
        performAction(teacher);
        performAction(student);
    }
}



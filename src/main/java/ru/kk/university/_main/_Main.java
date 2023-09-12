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

//Вызывает метод doAction() для объекта типа Actions. Этот метод будет выполнен, независимо от типа объекта actions.
//
//Проверяет тип объекта actions с помощью оператора instanceof. Если объект является экземпляром класса, реализующего интерфейс StudentActions, выполняются следующие действия:
//
//Вызывается метод study(), который описывает активность учебы.
//Вызывается метод participateInAcademicLife(), который описывает участие в академической жизни.
//Если объект actions является экземпляром класса, реализующего интерфейс TeacherActions, выполняются следующие действия:
//
//Вызывается метод teach(), который описывает процесс преподавания.
//Вызывается метод provideFeedback(), который описывает предоставление обратной связи.


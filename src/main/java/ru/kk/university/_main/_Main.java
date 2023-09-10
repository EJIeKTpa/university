package ru.kk.university._main;

import ru.kk.university.entity.*;

public class _Main {
    private static Actions actions;

    public static void main(String[] args) {
        University university = new University();
        university.name = "Массачусетский технологический институт";

        Teacher teacher = new Teacher();
        teacher.name = "Peter Diamond";
        teacher.university = university;

        Student student = new Student();
        student.name = "Michel Mind";
        student.university = university;

        university.employmentTeacher(teacher);
        university.enrollStudent(student);

        performAction(teacher);
        performAction(student);
    }

    public static void performAction(Actions actions) {
        actions.doAction();
        if (actions instanceof StudentActions) {
            ((StudentActions) actions).study();
            ((StudentActions) actions).participateInAcademicLife();
        }
        if (actions instanceof TeacherActions) {
            ((TeacherActions) actions).teach();
            ((TeacherActions) actions).provideFeedback();
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
    }
}

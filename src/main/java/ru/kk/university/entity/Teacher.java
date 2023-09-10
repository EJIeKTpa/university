package ru.kk.university.entity;

public class Teacher implements TeacherActions {
    public String name;
    public University university;

    @Override
    public void doAction() {
        System.out.println("Учитель " + this.name + " идет на работу в " + this.university.name + ".");
    }

    @Override
    public void teach() {
        System.out.println("Учитель " + this.name + " преподает Физику.");
    }

    @Override
    public void provideFeedback() {
        System.out.println("Учитель " + this.name + " оценил выполненную студентом работу и отправил ему обратную связь.");
    }
}
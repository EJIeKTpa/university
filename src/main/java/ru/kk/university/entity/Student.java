package ru.kk.university.entity;

public class Student implements StudentActions {
    public String name;
    public University university;

    @Override
    public void doAction() {
        System.out.println("Студент " + this.name + " идет на занятия в " + this.university.name + ".");
    }

    @Override
    public void study() {
        System.out.println("Студент " + this.name + " слушает лекцию.");
    }

    @Override
    public void participateInAcademicLife() {
        System.out.println("Студент " + this.name + " активно участвует в проводимых университетом научных конференциях и семинарах.");
    }
}

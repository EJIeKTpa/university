package ru.kk.university.entity;

public class Student implements StudentActions {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    private String name;
    private University university;

    @Override
    public void doAction() {
        System.out.println("Студент " + this.name + " идет на занятия в " + this.university.getName() + ".");
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

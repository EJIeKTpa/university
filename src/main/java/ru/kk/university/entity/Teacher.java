package ru.kk.university.entity;

public class Teacher implements TeacherActions {
    private String name;
    private University university;

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

    @Override
    public void doAction() {
        System.out.println("Учитель " + this.name + " идет на работу в " + this.university.getName() + ".");
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
package ru.kk.university.service;

import ru.kk.university.entity.Actions;
import ru.kk.university.entity.StudentActions;
import ru.kk.university.entity.TeacherActions;

public class PerformAction {
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
    }
}

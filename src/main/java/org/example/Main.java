package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PatientSubject subjectOne = new PatientSubject();
        EventManager observer1 = new MySubjectEvent("Jean-Marie", "vous êtes malade !!");

        subjectOne.addEventSubject(observer1);
        subjectOne.notificationSubject(" Prendre rendez-vous chez le medecin.");



    }
}
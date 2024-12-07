package org.example;

public class MySubjectEvent implements EventManager{
    private String name;
    private String notification;

    public MySubjectEvent(String name, String notification) {
        this.name = name;
        this.notification = notification;
    }

    @Override
    public void addNotification(String action){
        System.out.println(name+" "+notification+" Action => "+action);
    }


}

package org.example;

import java.util.ArrayList;
import java.util.List;

public class PatientSubject {
    private List<EventManager> eventManagers = new ArrayList<>();
    private String name;

    public void addEventSubject(EventManager eventManager){
        eventManagers.add(eventManager);
    }

    public void notificationSubject(String action){
        for (EventManager eventManager : eventManagers){
            eventManager.addNotification(action);
        }
    }



}

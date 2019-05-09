package design.patterns.java.observer;

import java.util.List;
import java.util.Observable;

public class EventRegistry extends Observable {

    private List<Event> eventList;

    public EventRegistry(List<Event> eventList) {
        this.eventList = eventList;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void updatedEvent() {
        setChanged();
        notifyObservers();
    }

    public void addEvent(String eventName, String eventDate) {
        eventList.add(new Event(eventName, eventDate));
        updatedEvent();
    }
}

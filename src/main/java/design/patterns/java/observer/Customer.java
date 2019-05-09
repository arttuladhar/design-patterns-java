package design.patterns.java.observer;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Customer implements Observer{

    Observable observable;
    List<Event> eventList;

    public Customer(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        EventRegistry eventRegistry = (EventRegistry) o;
        eventList = eventRegistry.getEventList();
        display();
    }

    public void display(){
        System.out.println("Customer Events: ");
        eventList.forEach(event -> {
            System.out.println(event.toString());
        });
    }
}

package design.patterns.java.observer;

import com.google.common.collect.Lists;


public class ObserverPatternDemo {
    public static void main(String[] args) {

        EventRegistry eventRegistry = new EventRegistry(Lists.newArrayList());

        Customer target = new Customer(eventRegistry);
        Vendor pillsbury = new Vendor(eventRegistry);

        eventRegistry.addEvent("Minnesota SBA Meeting", "05/21/1988");
        eventRegistry.addEvent("University of Minnesota", "06/22/2017");

    }
}

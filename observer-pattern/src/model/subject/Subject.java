package model.subject;

import model.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer); // subscribe

    void removeObserver(Observer observer); // unsubscribe

    void notifyObservers(); // notify
}

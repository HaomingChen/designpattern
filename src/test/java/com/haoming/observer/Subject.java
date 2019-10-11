package com.haoming.observer;

/**
 * @author Haoming Chen
 * Created on 2019/9/23
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}

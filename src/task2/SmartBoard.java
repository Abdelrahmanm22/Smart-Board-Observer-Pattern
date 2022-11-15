/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author future
 */
public class SmartBoard implements Subject{
    private List<Observers> observers;
    boolean power;
    
    SmartBoard(){
        observers = new ArrayList<Observers>();
    }
    public void registerObserver(Observers o) {
	observers.add(o);
    }
	
    public void removeObserver(Observers o) {
	observers.remove(o);
    }
	
    public void notifyObservers() {
        for (Observers observer : observers) {
            observer.update(power);
        }
    }
    
    public void statesChanged() {
	notifyObservers();
    }
	
    public void setSate(boolean stat) {
	power=stat;
	statesChanged();
    }
	
}

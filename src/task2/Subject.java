/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package task2;

/**
 *
 * @author future
 */
public interface Subject {
    public void registerObserver(Observers o);
    public void removeObserver(Observers o);
    public void notifyObservers();
}

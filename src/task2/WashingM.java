/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

/**
 *
 * @author future
 */
public class WashingM implements Observers{
    private SmartBoard smartBoard;
    boolean power;
    public WashingM(SmartBoard smartBoard) {
        this.smartBoard = smartBoard;
	smartBoard.registerObserver((Observers) this);
    }
    public void update(boolean state) {
	this.power=state;
        if(power==true){
            System.out.println("Washing Machine is ON");
        }else{
            System.out.println("Washing Machine is OFF");
        }
    }
}

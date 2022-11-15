/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

/**
 *
 * @author future
 */
public class Tv implements Observers{
    private SmartBoard smartBoard;
    boolean power;
    public Tv(SmartBoard smartBoard) {
        this.smartBoard = smartBoard;
	smartBoard.registerObserver(this);
    }
    public void update(boolean state) {
	this.power=state;
        if(power==true){
            System.out.println("Tv is ON");
        }else{
            System.out.println("Tv is OFF");
        }
    }
}

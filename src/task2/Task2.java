/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2;

/**
 *
 * @author future
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SmartBoard smartBoard = new SmartBoard();
        Tv tv = new Tv(smartBoard);
        Ac ac= new Ac(smartBoard);
        WashingM w = new WashingM(smartBoard);
        
        smartBoard.setSate(true);
        
        smartBoard.setSate(false);
        
        smartBoard.removeObserver(tv);
        
    }
    
}

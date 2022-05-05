/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasingleton;

/**
 *
 * @author aitgal
 */
public class PruebaSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n"
                + "If you see different values, then 2 singletons were created (booo!!)" + "\n\n"
                + "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.getValue());
        System.out.println(anotherSingleton.getValue());
    }
    
}

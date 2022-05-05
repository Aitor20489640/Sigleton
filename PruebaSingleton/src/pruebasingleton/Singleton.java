/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasingleton;

/**
 *
 * @author aitgal
 */
public class Singleton {

    private static Singleton instance = null;
    private String value;

    private Singleton(String value) {
        //Este método existe solamente para evitar la instanciación.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    //Se utiliza el método getInstance para controlar la instanciación.
    //solamente existira un objeto único para la clase.
    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
    
    public String getValue(){
        return this.value;
    }

    //Se definen los distintos métodos de la clase singleton
    protected static void dimeAlgo() {
        System.out.println("Método de la clase singleton");
    }

}

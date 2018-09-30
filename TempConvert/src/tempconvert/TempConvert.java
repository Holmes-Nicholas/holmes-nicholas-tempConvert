/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package tempconvert;

/**
 *
 * @author N
 */
import java.util.Scanner;

public class TempConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float n1, temp;
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("Enter the temperature in degrees Celsius ");
        n1 = keyboard.nextFloat();
        
        temp = n1 * (9.0F / 5.0F) + 32;
        System.out.println("The temperature in degrees Fahrenheit is " + temp);
    }
    
}

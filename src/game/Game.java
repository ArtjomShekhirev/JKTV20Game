/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(9-0+1)+0;
        System.out.println("Program stored number in range of 0 to 9, test you'r luck!");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        if (number == userNumber) {
            System.out.println("You win!");
        }else{
            System.out.println(":, Wrong, right number was:" +number);
                    }
        
    }
    
}

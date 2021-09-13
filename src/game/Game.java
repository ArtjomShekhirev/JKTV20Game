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
          int attempt = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(9-0+1)+0;
        System.out.println("Program stored number in range of 0 to 9, test you'r luck!");
        for (int i = 0; i < 3; i++){
        
            int userNumber = scanner.nextInt();
            if (number == userNumber) {
                System.out.println("You win!");
                break;
            }else{
                if(attempt < 2){
                    System.out.println("Wrong, try again!");
                }else{
                    System.out.println("You lose!");
                }

            }attempt++;  

        }
    }
}
    

package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner sc = new Scanner(System.in);
    public static void main( String[] args ) {

        boolean gameNotWon = true;
        String activePlayer = "O";

        GameBoard test = new GameBoard();

        while (gameNotWon){
            test.printTheGameboard();
            System.out.println("In which column would you like to place your brick?");
            test.addABrick(Integer.parseInt(sc.nextLine()), activePlayer);
            test.printTheGameboard();
        }
    }
}

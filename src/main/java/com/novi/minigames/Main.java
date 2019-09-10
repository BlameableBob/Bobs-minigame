package com.novi.minigames;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
          //Get name of player 1
        //Get name of player 2 
        //hier vraag ik spelersnamen
        System.out.println("Type the name of player 1: " );
        String player1Name = input.next();
        Player player1 = new Player(player1Name, 'X');
        System.out.println("Hello " + player1.getName());
        
        System.out.println("Now type the name of player 2: ");
        String player2Name = input.next();
        Player player2 = new Player(player2Name, 'O');
        System.out.println("Welcome " + player2.getName());
        
        //hier vraag ik om een spelkeuze
        System.out.println("Press 1 for tic tac toe.");
        System.out.println("Press 2 for four in a row.");
        String spelKeuze = input.next();
        
        //nu ga ik spel 1 starten wanneer spelkeuze 1 is.
        if(spelKeuze.equals("1")){
            
            //print board
            //Use:  Dots and/or numbers for fields 
                //      X's and O's for player pawns
                //hier ergens een while zodat ie het grid blijft loopen
            int chosenField;
            
            char[] field = {
            '1', '2', '3', '4', '5', '6', '7', '8', '9'};
            Player currentPlayer = player1;
            while(true){
                
            
            for(int rij = 0; rij < 3; rij++){
                for(int kolom = 0; kolom < 3; kolom++){
                System.out.print(field[kolom + 3 * rij]);
                
                        //1 2 3
                        //4 5 6
                        //7 8 9
                
            }
                System.out.println(" ");
                
            }
             //Print current player
            System.out.println("Huidige speler: " + currentPlayer.getName());
             //Get chosen field
             //Change field to current player pawn (X or O)
            chosenField = input.nextInt();
            field[chosenField -1] = currentPlayer.getToken();
            //proberen switchen tussen spelers
            if(player1.equals(currentPlayer))
            {
                currentPlayer = player2;
                
            }
            else
            {
                currentPlayer = player1;
            }
            }
        
        }
       

                //If game is won
                    //Print board
                    //Winner gets a point
                    //Print scores
                    //Go back to menu
                
                //If game is not won
                    //Switch players
                    //Start next turn
        
    }
}
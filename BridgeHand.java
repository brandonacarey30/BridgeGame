// Brandon Carey
// CSC 111
// October 11 2013
// This programs initializes a bridge hand, and creates a scoring method
// for the game.

import java.util.*;


public class BridgeHand
{
  public static void main(String[] args)
  { 
    // Sets up an input for the user.
    Scanner kbd = new Scanner(System.in);
    String input;
   
    // Prompts a user for the hand that  they wish to enter.
    System.out.println("Please Enter a Hand (or enter 'Q' to quit).");
    input = kbd.nextLine();
    String[] hand = input.split(" "); // Splits the hand at each space.

    while (!input.equalsIgnoreCase("Q")) // Enables the user to quit.
    {
      
      // Creates arrays to store the hands. 
      char [] spadeArray = new char[13];
      char [] diamondArray = new char[13];
      char [] heartArray = new char[13];
      char [] clubArray = new char[13];

      // Variables to keep track of the number of cards in each suit.
      int clubs = 0;
      int diamonds = 0;
      int spades = 0;
      int hearts = 0;


      int score = 0; // Keeps track of the score.
      int suitCard = 0;
      int longSuit = 0;

      char faceValue; //Initializes the character for the face value of a card.
      char suit; // Initializes which suit the card will go to. 
      

     for( int i = 0; i < hand.length; i++)
     {

        faceValue = hand[i].charAt(0); // Identifies first input as face.
        suit = hand[i].charAt(1); // Indentifies second input as suit. 

        // If statements move the cards to each suit. 
        // Also scoring methods are defined. 
	
        if (suit == 'C' || suit == 'c'){
            clubArray[clubs] = faceValue;
            clubs = clubs + 1;
        }

        if (suit == 'H' || suit == 'h'){
            heartArray[hearts] = faceValue;
            hearts = hearts + 1;
        }

        if (suit == 'D' || suit == 'd'){
            diamondArray[diamonds] = faceValue;
            diamonds = diamonds + 1;
        }
  
        if (suit == 'S' || suit == 's'){
            spadeArray[spades] = faceValue;
            spades = spades + 1;
        }

        if (faceValue == 'A' || faceValue == 'a'){
            score = score + 4;
            
        }

        if (faceValue == 'K' || faceValue == 'k'){
            score = score + 3;
            
        }

        if (faceValue == 'Q'|| faceValue == 'q'){
            score = score + 2;
            
        }

        if (faceValue == 'J' || faceValue == 'j'){
            score = score + 1;
            
        }

        if (faceValue == 'T' || faceValue == 't'){
            score = score + 0;
            
        }
      }

      
      // Creates a for loop to dictate which card is chosen.
      // Allows the program to check for long suit hands. 
      for (int x = 1; x < 5; x++)
      {

        if (x == 1){
            suitCard = hearts;
        }

        if (x == 2){
            suitCard = clubs;
        }

        if (x == 3){
            suitCard = spades;
        }
   
        if (x == 4){
            suitCard = diamonds;
        }

        if (suitCard == 0){
            score = score + 3;
        }
 
        if (suitCard == 1){
            score = score + 2;
        }

        if (suitCard == 2){
            score = score + 1;
        }

        if (suitCard > 5){
            longSuit = suitCard - 5;
            score += longSuit;
        }
      }
        
        // Sorts the arrays in numerical order.
        Arrays.sort(heartArray);
        Arrays.sort(diamondArray);
        Arrays.sort(spadeArray);
        Arrays.sort(clubArray); 


        // Converts the arrays to String format for printing. 
        String hearts2 = new String(heartArray);
        String diamonds2 = new String(diamondArray);
        String spades2 = new String(spadeArray);
        String clubs2 = new String(clubArray);


        // Prints out the Strings, trims the spaces, 
        // and makes the output uppercase. 
        System.out.print("Hearts: ");
        System.out.println(hearts2.replace("", " ").trim().toUpperCase());
        System.out.print("Spades: ");
        System.out.println(spades2.replace("", " ").trim().toUpperCase());
        System.out.print("Diamonds: ");
        System.out.println(diamonds2.replace("", " ").trim().toUpperCase());
        System.out.print("Clubs: ");
        System.out.println(clubs2.replace("", " ").trim().toUpperCase());
        System.out.println("Your score is: " + score);


        // Prompts a user for another input. 
        System.out.println("Please Enter a Hand (or enter 'Q' to quit).");
        input = kbd.nextLine();
        hand = input.split(" ");      
      
    }
        System.out.println("Goodbye!"); // Issues a closed program statement. 
  }
}


	
																																									
  

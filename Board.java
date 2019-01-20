import java.io.Console;
import java.util.Scanner;

public class Board{
  private String spacing = "   "; 
  private int height = 8;
  private int width = 8;
  private int[] heightNumbers = {8,7,6,5,4,3,2,1};
  private char[] widthChars = {'a','b', 'c', 'd', 'e', 'f', 'g', 'h'};
 
  private char[][] boardInit = {
   {'r','k','b','K','Q','b','k','r'},
   {'p','p','p','p','p','p','p','p'},
   {' ',' ',' ',' ',' ',' ',' ',' '},
   {' ',' ',' ',' ',' ',' ',' ',' '},
   {' ',' ',' ',' ',' ',' ',' ',' '},
   {' ',' ',' ',' ',' ',' ',' ',' '},
   {'p','p','p','p','p','p','p','p'},
   {'r','k','b','Q','K','b','k','r'}
  };

  public Board(){
  }
  public static void main(String [] args){
   Board chessBoard = new Board();
   System.out.println("Starting Chess Game with white pieces ...");
   String pos = "a7";
   int posNew = pos.charAt(1).getNumericValue();
   System.out.println(posNew);   
//chessBoard.startChessGame();
 }
  private void startChessGame(){
   this.displayBoard();
   this.enterNextMove();
  }
  private String getUserInput(){
   Console console = System.console();
   String input = console.readLine();
   return input;
  }
  private boolean checkIfEqual(String checkChar){
   String[] validPieces = {"p","k", "K", "Q", "r", "b"};
   boolean isValid = false;
   if(checkChar.length()<=1){
   for(int i=0; i<validPieces.length; i++){
   if(checkChar.equals(validPieces[i])){
      isValid=true;
     }
    }
   }
    return isValid;
   }
  private void enterNextMove(){
   Scanner input = new Scanner(System.in);
   System.out.println("Enter piece to move: ");
   String piece = this.getUserInput();
   if(checkIfEqual(piece)){
    System.out.println("Enter old position on board: ");
    String posOld = getUserInput();    
    System.out.print("Enter new position: ");
    String posNew = getUserInput();    
    System.out.println("Computing your move: " + piece
    +"from: " +posOld +" to: " +posNew );
    this.startChessGame();
    }
    else{
    System.out.println(piece +" invalid. Enter again: ");
    this.enterNextMove();
    }
   }
  private void move(String piece,String posOld, String posNew){
  //char firstPosOld = posOld.charAt(0);
  //int firstPosOld = Integer.parseInt(posOld.charAt(1);
}
  private void displayBoard(){ 
    for(int i = 0; i < 8; i++){
     System.out.print(heightNumbers[i]+spacing+spacing);
     for(int j = 0; j < 8; j++){
      System.out.print(boardInit[i][j] );
      System.out.print(spacing);
     }
     System.out.println();
     System.out.println();
    }
   System.out.print(spacing+spacing+" ");
   for(int i = 0; i<8; i++){
    System.out.print(widthChars[i]+spacing);
   }
  System.out.println();	
  }	
}

import java.io.Console;

public class Board{
  private String spacing = "   "; 
  private int height = 8;
  private int width = 8;
  private int[] heightNumbers = {1,2,3,4,5,6,7,8};
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
   System.out.println("Starting Chess Game ...");
   chessBoard.startChessGame();
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
   System.out.println("Check if "+checkChar + " equals " + validPieces[i]); 
   if(checkChar.equals(validPieces[i])){
      isValid=true;
     }
    }
   }
    return isValid;
   }
  private void enterNextMove(){
   System.out.println("Enter piece to move: ");
   String piece = this.getUserInput();
   if(checkIfEqual(piece)){
    System.out.println("Enter new position on board: ");
    String pos = getUserInput();    
    System.out.println("Computing your move: " + piece
    + " to: " +pos );
    this.startChessGame();
    }
    else{
    System.out.println(piece +" invalid. Enter again: ");
    this.enterNextMove();
    }
   }
  private void move(String piece, String newPos){
   
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
   System.out.print(spacing+spacing);
   for(int i = 0; i<8; i++){
    System.out.print(widthChars[i]+spacing);
   }
  System.out.println();	
  }	
}

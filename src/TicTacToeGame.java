import java.util.Scanner;

public class TicTacToeGame {

    Scanner sc=new Scanner(System.in);
    public char[] board=new char[10];
    public char playerChoice;
    public char computerChoice;

    public char[] createBoard() {

        for(int i=1;i<board.length;i++) {
            board[i]=' ';
        }

        System.out.println("Created the board");
        System.out.println(board);
        return board;
    }

    public void makeChoice() {

        System.out.println("Enter your choice(O/X): ");
        char Choice=sc.next().charAt(0);
        if(Choice=='X') {
            computerChoice='O';
        }
        else {
            computerChoice='X';
        }
        playerChoice=Choice;

    }

    public void displayBoard() {

        System.out.println("\n"+board[1]+" | "+board[2]+" | "+board[3]);
        System.out.println("_____");
        System.out.println("\n"+board[4]+" | "+board[5]+" | "+board[6]);
        System.out.println("_____");
        System.out.println("\n"+board[7]+" | "+board[8]+" | "+board[9]);
        System.out.println(" ");
        System.out.println(" ");
    }

    // User can make a move to a desired position
    public void fillBoard() {
        while(true) {
            System.out.println("Enter the position where you want to insert: ");
            int pos=sc.nextInt();
            sc.nextLine();
            if(board[pos]!=' ') {
                System.out.println("Space not available! Select another position");
            }
            else {
                board[pos]=playerChoice;
                break;
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

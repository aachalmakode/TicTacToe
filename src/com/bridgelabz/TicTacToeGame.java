package com.bridgelabz;

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

    public static void main(String[] args) {
	// write your code here
    }
}

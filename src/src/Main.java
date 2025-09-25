import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfGames = 1;
        String[] games = {"Tetris"};
        System.out.println("Hello there, welcome to the game house! Which game would you like to play?\nPlease select from the options below:");
        System.out.println("1. Tetris");
        System.out.println("\n");

        int choice = scan.nextInt();
        while(choice > numberOfGames){
            System.out.println("Invalid number, please try again:");
            choice = scan.nextInt();
        }
        System.out.println("You chose: " + games[choice-1]);
    }
}
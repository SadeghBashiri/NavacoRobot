import exception.ToyRobotException;
import simulator.SquareBoard;
import simulator.ToyRobot;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        SquareBoard squareBoard = new SquareBoard(4, 4);
        ToyRobot robot = new ToyRobot();
        Game game = new Game(squareBoard, robot);

        System.out.println("Toy Robot Simulator");
        System.out.println("Enter a command, Valid commands are:");
        System.out.println("\'PLACE X,Y,NORTH|SOUTH|EAST|WEST\', MOVE, LEFT, RIGHT, REPORT or EXIT");

        boolean keepRunning = true;
        while (keepRunning) {
            String inputString = console.nextLine();
            if ("EXIT".equals(inputString)) {
                keepRunning = false;
            } else {
                try {
                    String outputVal = game.eval(inputString);
                    System.out.println(outputVal);
                } catch (ToyRobotException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
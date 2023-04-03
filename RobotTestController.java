// RobotTestController.java file
//package robotclass;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author leeme
 */
public class RobotTestController {

    @FXML
    private TextArea displayScreen;
    @FXML
    private Button pickUpButton;
    @FXML
    private Button dropOffButton;
    @FXML
    private Button moveUpButton;
    @FXML
    private Button moveLeftButton;
    @FXML
    private Button moveRightButton;
    @FXML
    private Button moveDownButton;

    // Instance variables
    private int lx = 0;
    private int ly = 0;
    private char payload = ' ';
    private int bx = 10;
    private int by = 8;
    private int cx = 22;
    private int cy = 4;
    boolean b = false;
    boolean c = false;
    
    
    /**
     * Initializes the controller class.
     */
    public void initialize() {
        printBoard(lx, ly);
    }
    
    // Function to print the grid after each new input from GUI
    private void printBoard(int lx, int ly) {
        // Clear the previous grid
        displayScreen.clear();
        // Create the new 2D grid with inputs
        char board[][] = new char[25][25];
        
        // Initialize the grid with nested for loops
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25; j++) {
                board[i][j] = ' '; // Empty characters
            }
        }
        // Check if 'B' has been picked up
        if (b == false) {
            board[bx][by] = 'B';
        }
        // Check if 'C' has been picked up
        if (c == false) {
            board[cx][cy] = 'C';
        }
        // Print 'R' to represent the robot
        board[lx][ly] = 'R';
        
        // Print the grid to the display screen
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25; j++) {
                String s = board[i][j] + "    "; 
                displayScreen.appendText(s);
            }
            String line = String.format("%n"); 
            displayScreen.appendText(line); 
        }
    }


    @FXML
    private void pickUp(ActionEvent event) {
        // Picking up 'B'
        // Check if Robot is at same location as 'B'
        if (lx == bx && ly == by && c == false) {
            b = true; // boolean b becomes true
            payload = 'B'; // payload is now full
        }
        
        // Picking up 'C'
        // Check if Robot is at same location as 'C'
        if (lx == cx && ly == cy && b == false) {
            c = true; // boolean c becomes true
            payload = 'C'; // payload is now full
        }
    }
    // Function to dropOff payload
    @FXML
    private void dropOff(ActionEvent event) {
        // Dropping off 'B'
        // Check if 'B' is being carried
        if (b == true) {
            b = false; // b becomes false
            bx = lx; // Set 'B' location to Robot location
            by = ly;
            payload = ' '; // Empty payload
        }
        
        // Dropping off 'C'
        // Check if 'C' is being carried
        if (c == true) {
            c = false; // c becomes false
            cx = lx; // Set 'C' location to Robot location
            cy = ly;
            payload = ' '; // Empty payload
        }
    }
    // Function to move Robot up one space on grid
    @FXML
    private void moveUp(ActionEvent event) {
        // Check boundaries
        if (0 < lx) {
            lx -= 1;
            printBoard(lx, ly);
        }
    }
    // Function to move Robot left one space on grid
    @FXML
    private void moveLeft(ActionEvent event) {
        // Check boundaries
        if (0 < ly) {
            ly -= 1;
            printBoard(lx, ly);
        }
    }
    // Function to move Robot right one space on grid
    @FXML
    private void moveRight(ActionEvent event) {
        // Check boundaries
        if (ly < 24) {
            ly += 1;
            printBoard(lx, ly);
        }
    }
    // Function to move Robot down one space on grid
    @FXML
    private void moveDown(ActionEvent event) {
        // Check boundaries
        if (lx < 24) {
            lx += 1;
            printBoard(lx, ly);
        }
    }
}
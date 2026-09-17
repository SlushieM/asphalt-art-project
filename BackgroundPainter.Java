import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus {
  
  /**
   * Paints the background of the neighborhood by zig-zagging.
   * from the top to bottom / left to right.
   */
  public void paintBackground(String color, int gridSize) {
    setPaint(gridSize * gridSize);
    while (canMove("south")) {
      paintRow(color);
      turnToWest();
      paintRow(color);
      turnToEast();
    }
  }

  /**
   * Helper method to paint a row of the neightboorhood.
   * Used in paintBackground method.
   */
  public void paintRow(String color) {
    while (canMove()) {
      paint(color);
      move();
    }
    paint(color);
  }

  public void downRight() {
     turnRight();
    move();
    turnRight();
    
  }

  public void downLeft() {
    turnLeft();
    move();
    turnLeft();
    
  }   public void Eyes(String color) {

   downRow();
    downRow();
    downRow();

    move();
    paint("black");
    move();
    paint(color);
    move();
    move();
    move();
    paint(color);
    move();
    paint("black");
    
    
  }
  public void bigFaceRow(){
    paint("Tan");
    move();
       paint("Tan");
    move();
       paint("Tan");
    move();
       paint("Tan");
    move();
       paint("Tan");
    move();
       paint("Tan");
  }
public void smallFaceRow(){


     paint("Tan");
  move();
     paint("Tan");
  move();
     paint("Tan");
  move();
     paint("Tan");
 
}
  public void face() {
    resetPosition();
    downRow();
    downRow();
    move();
    bigFaceRow();
    downRight();
    bigFaceRow();
    downLeft();
    bigFaceRow();
    downRight();
    move();
    smallFaceRow();
    downLeft();
    smallFaceRow();


  }
 public void lip(String color) {
   paint(color);
   move();
   paint(color);
   downRight();
   
 }
  public void mouth() {
    resetPosition();
    downRow();
    downRow();
    downRow();
    downRow();
    downRow();
    move();
    move();
    move();
    lip("Lightpink");
    lip("RosyBrown");
  }

  /**
   * Helper method used to turn after each row to 
   * achieve the zig-zag painted background
   */
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      
      if (canMove()){
        move();
      }
      
      turnLeft();
    }
  }
  
  /**
   * Helper method used to turn after each row to 
   * achieve the zig-zag painted background.
   */
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      
      if (canMove()){
        move();
      }
      
      turnRight();
    }
  }

  //turns south
  public void downRow() {
    turnRight();
    move();
    turnLeft();
  }
  /**
   * Resets the BackgroundPainter object to the starting location.
   */
  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();
      turnLeft();
    }
  }
  
}
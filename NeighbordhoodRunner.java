import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
  BackgroundPainter sheep = new BackgroundPainter();
    sheep.setPaint(120);
sheep.paintRow("silver");
   sheep.downRight();
    sheep.paintRow("silver");
    sheep.downLeft();
    sheep.paintRow("silver");
    sheep.downRight();
    sheep.paintRow("silver");
    sheep.downLeft();
    sheep.paintRow("silver");
    sheep.downRight();
    sheep.paintRow("silver");
    sheep.downLeft();
    sheep.paintRow("silver");
    sheep.downRight();
    sheep.paintRow("silver");
    sheep.turnRight();
    sheep.turnRight();
    sheep.resetPosition();
    sheep.face();
 sheep.resetPosition();
    sheep.Eyes("white");
    sheep.mouth();
 
    
  }
}
import org.code.theater.*;
import org.code.media.*;

/**
 * MusicNote is a subclass of Performer that scrolls left across the screen.
 */
public class MusicNote extends Performer {

  /**
   * Constructs a MusicNote with image and position.
   * @param image the image filename
   * @param xPos the x position
   * @param yPos the y position
   * @param size the image size
   */
 public MusicNote(String image, int xPos, int yPos, int size) {
    super(image, xPos, yPos, size);
  }

   /**
   * Moves the music note to the left and loops it when it exits the screen.
   */
  public void move() {
    setXPos(getXPos() - 10);
    if (getXPos() < -100) {
      setXPos(420);
    }
  }
}

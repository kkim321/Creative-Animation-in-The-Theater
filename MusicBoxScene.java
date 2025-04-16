import org.code.theater.*;
import org.code.media.*;

/**
 * Represents the animated music box scene with a ballerina and music notes.
 */
public class MusicBoxScene extends Scene {
  private Ballerina ballerina;
  private MusicNote notes;
  private String backgroundImage;

  // 1D array of words describing musical moods or ballet
  private String[] words = {"Grace", "Elegance", "Harmony", "Balance"};

 /**
   * Constructs a MusicBoxScene using a ballerina, music notes, and a background.
   * @param ballerina the ballerina object to animate
   * @param notes the music note object to animate
   * @param backgroundImage the background image filename
   */
  public MusicBoxScene(Ballerina ballerina, MusicNote notes, String backgroundImage) {
    this.ballerina = ballerina;
    this.notes = notes;
    this.backgroundImage = backgroundImage;
  }

  /**
   * Creates and animates the scene by drawing all elements over time.
   */
  public void createScene() {
    drawBackground();
    playSound(ballerina.getMusic());

    for (int i = 0; i < 40; i++) {
      drawBackground();
      displayWords(i);
      drawBallerina();
      drawMusicNotes();
      pause(0.5);
    }
  }

   /**
   * Draws the music box background.
   */
    private void drawBackground() {
    drawImage(backgroundImage, 0, 0, 420);
  }

   /**
   * Draws and animates the ballerina rotating.
   */
    private void drawBallerina() {
      ballerina.spin();
      drawImage(ballerina.getImage(), ballerina.getXPos(), ballerina.getYPos(), ballerina.getSize(), ballerina.getRotation());
    }
      
  /**
   * Draws and moves the scrolling music notes.
   */
    private void drawMusicNotes() {
      notes.move();
      drawImage(notes.getImage(), notes.getXPos(), notes.getYPos(), notes.getSize());
    }

  /**
 * Displays text on the scene.
 */
    private void displayWords(int count) {
      String wordToDisplay = words[count % words.length];
      drawText(wordToDisplay, 150, 25);
    }
}
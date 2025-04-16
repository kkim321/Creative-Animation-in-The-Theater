// import org.code.theater.*;
// import org.code.media.*;

/**
 * Ballerina is a subclass of Performer.
 * It contains additional music and a method to spin.
 */
public class Ballerina extends Performer {

  private double[] music;

  /**
   * Constructs a ballerina with an image, music, and position.
   * @param image the ballerina image
   * @param music the sound data for music
   * @param xPos the x position
   * @param yPos the y position
   * @param size the image size
   */
  public Ballerina(String image, double[] music, int xPos, int yPos, int size) {
    super(image, xPos, yPos, size);
    this.music = music;
  }

  /**
   * Spins the ballerina by increasing its rotation.
   */
  public void spin() {
    setRotation(getRotation() + 28);
  }

  /**
   * Gets the ballerina's music data.
   * @return the music array
   */
  public double[] getMusic() {
    return this.music;
  }
}
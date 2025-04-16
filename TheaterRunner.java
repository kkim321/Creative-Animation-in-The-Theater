import org.code.theater.*;
import org.code.media.*;

/**
 * Runs the ballerina music box animation by creating and playing a scene.
 */
public class TheaterRunner {
  public static void main(String[] args) {

  // Loads image and sound resources
    String ballerinaImage = "ballerina.png";
    String musicNoteImage = "musicnotes.png";
    String backgroundImage = "musicbox.png";
    double[] music = SoundEffects.increaseVolume(SoundLoader.read("music.wav"));

  // Create objects
  Ballerina ballerina = new Ballerina(ballerinaImage, music, 180, 200, 150);
  MusicNote notes = new MusicNote(musicNoteImage, 400, 50, 100);

  // Create and play the scene
  MusicBoxScene scene = new MusicBoxScene(ballerina, notes, backgroundImage);
  scene.createScene();
    
  Theater.playScenes(scene);
    
  }
}

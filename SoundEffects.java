import org.code.theater.*;
import org.code.media.*;

public class SoundEffects {

   /**
   * Increases the volume of a sound array by a specific amount.
   * @param sound the original sound array
   * @param amount the volume multiplier
   * @return a new sound array with increased volume
   */
  public static double[] increaseVolume(double[] sound, double amount) {
    double[] louder = new double[sound.length];
    for (int i = 0; i < sound.length; i++) {
      louder[i] = sound[i] * amount;
    }
    return louder;
  }

/**
 * Increases the volume of a sound by an amount of 1.5.
 * @param sound the original sound array
 * @return the louder sound array
 */
public static double[] increaseVolume(double[] sound) {
  return increaseVolume(sound, 1.5);
}
}
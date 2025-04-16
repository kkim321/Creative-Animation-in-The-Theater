// import org.code.theater.*;
// import org.code.media.*;

/**
 * Superclass that represents any animated character or object.
 * Contains basic properties like position, size, image, and rotation.
 */
public class Performer {
private String image;
  private int xPos;
  private int yPos;
  private int size;
  private int rotation;

  /**
   * Constructs a performer with image and position properties.
   * @param image the filename of the image
   * @param xPos the x position
   * @param yPos the y position
   * @param size the image size
   */
  public Performer(String image, int xPos, int yPos, int size) {
    this.image = image; 
    this.xPos = xPos;
    this.yPos = yPos;
    this.size = size;
    this.rotation = 0;
  }

  public String getImage() {
    return image;
}

  public int getXPos(){
    return xPos;
  }

  public int getYPos() {
    return yPos;
  }

  public int getSize(){
    return size;
  }

  public int getRotation() {
    return this.rotation;
  }

  public void setXPos(int xPos) {
    this.xPos = xPos;
  }

  public void setYPos(int yPos) {
    this.yPos = yPos;
  }

  public void setRotation(int rotation) {
    this.rotation = rotation;
  }
}
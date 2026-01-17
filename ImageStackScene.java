import org.code.theater.*;
import org.code.media.*;
// This Scene displays a stack of images representing my family and friends.
public class ImageStackScene extends Scene {
private String backgroundImage;
private String[] images;
  
/**
* Creates the ImageStackScene using a background image and image array.
* Draws each image in a rotated, stacked format. It then displays it.
* Precondiiton: The file backgroundImage must exist.
* Postcondiiton: All images are drawn and the scene is cleared after finishing running.
  */
  public ImageStackScene(String backgroundImage, String[] images) {
    this.backgroundImage = backgroundImage; 
    this.images = images;
  }
  
  public void drawStack(int xPos, int yPos, int width, int height) {
    drawImage(backgroundImage, 0, 0, getWidth());
    setFillColor("white");
    drawRectangle(xPos, yPos, width, height);
    setTextStyle(Font.MONO, FontStyle.BOLD);
    int fontSize = 37;
    setTextHeight(fontSize);
    setTextColor("black");
    int xLinePos = xPos + 5;
    int yLinePos = yPos + fontSize;
    drawText("Family & Friends", xLinePos, yLinePos);
    yLinePos += fontSize;
    
    int centerX = 200;  // center of the stack
    int centerY = 200;  // center of the stack
    int size = 250;
    
    for (String image : images) {
      int angle = (int) (Math.random() * 46);
      if (angle % 2 == 1) {
        angle = (-1) * angle;
      }
      double dAngle = (double) angle;
      double radians = Math.toRadians(dAngle);
      double halfSize = size / 2.0;
      int adjustedX = (int)(centerX - (halfSize * Math.cos(radians) - halfSize * Math.sin(radians)));
      int adjustedY = (int)(centerY - (halfSize * Math.sin(radians) + halfSize * Math.cos(radians)));
      drawImage(image, adjustedX, adjustedY, size, dAngle);
      pause(1);
    }
     clear("white");
  }
}
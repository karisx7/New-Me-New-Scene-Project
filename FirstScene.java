import org.code.theater.*;
import org.code.media.*;
// This Scene shows the title screen for the animation, setting up the background and sound.
public class FirstScene extends Scene {

private String backgroundImage;
private String soundFile;
 /**
* Creates a FirstScene object using a background image file and a sound file.
* Precondition: Image and sound file must exist.
* Postcondition: The screen is displayed as intended.
  */
  public FirstScene(String backgroundImage, String soundFile) {
    this.backgroundImage = backgroundImage;
    this.soundFile = soundFile;
    
  }

  public void drawScene(int xPos, int yPos, int width, int height) {
    drawImage(backgroundImage, 0, 0, getWidth());
    playSound(soundFile);
    setFillColor("white");
    drawRectangle(xPos, yPos, width, height);
    
    setTextStyle(Font.MONO, FontStyle.BOLD);
    int fontSize = 37;
    setTextHeight(fontSize);
    setTextColor("black");
    int xLinePos = xPos + 5;
    int yLinePos = yPos + fontSize;
    drawText("My 2025-26 Wrapped", xLinePos, yLinePos);
    yLinePos += fontSize;
    pause(2);
    fontSize = 40;
    setTextHeight(fontSize);
    drawText("NEXT -->", 5, 200);
    pause(3);
    clear("white");
  }

  
}
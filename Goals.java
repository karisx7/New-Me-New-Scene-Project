import org.code.theater.*;
import org.code.media.*;
// This Scene displays goals for the upcoming year using text and corresponding images.
public class Goals extends Scene {
private String matchaPic;
private String TBRpic;
private String APpic;
  
/**
* Creates the Goals scene using images. The second constructor is then used to draw the actual scene.
* Precondition: Scene coordinates (for the images) must be valid/on the grid.
* Postcondition: The Scene is displayed accurately and for the correct duration.
  */
public Goals(String matchaPic, String TBRpic, String APpic) {
    this.matchaPic = matchaPic;
    this.TBRpic = TBRpic;
    this.APpic = APpic;
  }

  public void drawScene(int xPos, int yPos, int width, int height) {
    setFillColor("white");
    drawRectangle(xPos, yPos, width, height);
    setTextStyle(Font.MONO, FontStyle.BOLD);
    int fontSize = 30;
    setTextHeight(fontSize);
    setTextColor("black");
    int xLinePos = xPos + 5;
    int yLinePos = yPos + fontSize;
    drawText("Goals for the New Year", xLinePos, yLinePos);
    yLinePos += fontSize;
    pause(1);
    
    fontSize = 30;
    setTextHeight(fontSize);
    drawText("-Make matcha", 0, 80);
    pause(1);
    drawText("-Finish TBR", 0, 120);
    pause(1);
    drawText("-Get 5s", 0, 160);
    drawImage(matchaPic, 350, 60, 160, 90);
    drawImage(APpic, 210, 240, 180);
    drawImage(TBRpic, 160, 190, 180, 90);
    pause(2);
    clear("white");
  }
}
import org.code.theater.*;
import org.code.media.*;

// This Scene displays my 2025 academic achievements using the Achievements and typeOfAchievement text file
public class Academics extends Scene {

public Academic[] academicList;
/**
* Creates the Academic scene by filtering the achievement files and creating a new 1D array to represent the filtered list.
* Precondition: The text files must exist
* Postcondition: academicList must exist and be accurately filtered.
*/
  
   public Academics (String Achievements, String typeOfAchievement) {
    this.academicList = createArray(Achievements, typeOfAchievement);
  }

  public Academic[] createArray(String Achievements, String typeOfAchievement) {
  String[] titleOfAchievement = FileReader.toStringArray(Achievements);
  String[] type = FileReader.toStringArray(typeOfAchievement);
  Academic[] awardsArray = new Academic[titleOfAchievement.length];
  for (int i = 0; i < awardsArray.length; i++) {
    awardsArray[i] = new Academic(titleOfAchievement[i], type[i]);
  }
  return awardsArray;
}
  
  /**
   * Top level drawScene method
   */
  public String[] filterType() {
  String[] display = new String[3];
    int i = 0;
    for (Academic achive : academicList) {
      if (achive.getType().equals("Competition")) {
        display[i] = achive.getTitle();
        i++;
      }
    }
    return display;
  }

  public void drawScene(int xPos, int yPos, int width, int height) {
    setFillColor("white");
    drawRectangle(xPos, yPos, width, height);
    setTextStyle(Font.MONO, FontStyle.BOLD);
    int fontSize = 30;
    setTextHeight(fontSize);
    setTextColor("black");
    int xLinePos = xPos + 15;
    int yLinePos = yPos + fontSize;
    drawText("Competitons I've won", xLinePos, yLinePos);
    yLinePos += fontSize;
    pause(1);
    fontSize = 18;
    setTextHeight(fontSize);
    String[] things = filterType();
    int y = 80;
    for (String thing : things) {
      drawText(thing, 5, y);
      y += 25;
      pause(1);
    }
  pause(2);
  clear("white");
  }

}
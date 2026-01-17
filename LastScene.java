import org.code.theater.*;
import org.code.media.*;
// This Scene displays the "thank you" screen for the animation.
public class LastScene extends Scene {
  int[] partyHat = {120, 100, 270, 100, 190, 10};

/*
* Creates the LastScene object and draws the final screen using shapes and text rather than images.
* Precondition: The Scene must be cleared in order to display only the shapes and text for this specific screen.
* Postcondition: The closing text is displayed and the animation finishes.
  */
public LastScene() {
}

public void drawScene() {
  setFillColor("yellow");
  drawEllipse(95, 80, 200, 200);
  setFillColor("black");
  drawEllipse(150, 140, 20, 20);
  drawEllipse(220, 140, 20, 20);
  setFillColor("red");
  drawEllipse(165, 190, 60, 60);
  setFillColor("purple");
  drawShape(partyHat, true);
 setTextStyle(Font.MONO, FontStyle.BOLD);
  int height = 50;
  setTextHeight(height);
  setTextColor(new Color(168, 84, 164));
  pause(1);
  drawText("Thank you!", 60, 350);
  pause(4);
}

  
}
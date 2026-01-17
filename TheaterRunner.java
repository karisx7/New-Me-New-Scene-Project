import org.code.theater.*;

// This class runs the entire animation by creating and playing all of the scenes in order.
public class TheaterRunner {

/** The main method initialized the Scene objects and plays them
* Precondition: All Scene objects exist
* Postcondition: Each Scene object is played in order for the right amount of time.h
  */
public static void main(String[] args) {
String[] images = FileReader.toStringArray("ImageStack.txt");

FirstScene first = new FirstScene("Screenshot-2026-01-14-204614-(1).jpg", "youtube-intro-music-2-447241.wav");
Academics aca = new Academics("Achievements.txt", "typeOfAchievement.txt");
ImageStackScene image = new ImageStackScene("Screenshot-2026-01-15-135543.jpg", images);
Goals goal = new Goals("IMG_5510.jpeg", "IMG_9261.jpeg","IMG_4677.jpeg");
LastScene last = new LastScene();

first.drawScene(0, 60, 400, 150);
aca.drawScene(0, 0, 400, 50);
image.drawStack(0, 0, 400, 50);
goal.drawScene(0, 0, 400, 50);
last.drawScene();

Theater.playScenes(first, aca, image, goal, last);   
  }
}
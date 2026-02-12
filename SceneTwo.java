import org.code.theater.*;
import org.code.media.*;

public class SceneTwo extends Scene {

  // instance variables 
  private int[][] hobbyHours;   // 2D array storing hobby hours
  private ImageFilter hobbyPic;

  // constructors 
  public SceneTwo() {

    hobbyHours = new int[][] {
      {1, 2, 1},
      {2, 3, 2},
      {3, 2, 2}
    };

    hobbyPic = new ImageFilter("hobby.jpg");
  }

 // draws study scene 
  public void drawScene() {
    clear("orange");

    hobbyPic.redTint();   // student-created filter
    drawImage(hobbyPic, 0, 0, 400);

    drawText("My Hobbies", 140, 40);

    int max = getMaxHobbyHours();
    drawText("Most Hours in One Day: " + max, 60, 80);

    pause(2);
  }

  
  // find highest number in hobbyHours array
  // returns largest value 
  public int getMaxHobbyHours() {
    int max = hobbyHours[0][0];

    for (int r = 0; r < hobbyHours.length; r++) {
      for (int c = 0; c < hobbyHours[0].length; c++) {
        if (hobbyHours[r][c] > max) {
          max = hobbyHours[r][c];
        }
      }
    }

    return max;
  }
}

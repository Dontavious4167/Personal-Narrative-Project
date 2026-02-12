import org.code.theater.*;
import org.code.media.*;

public class SceneOne extends Scene {

  // instance variable
  private int[][] studyHours;   // 2D array storing hours studied per week
  private ImageFilter schoolPic;

 // constructor 
  public SceneOne() {

    // Initialize 2D array (3 weeks, 3 subjects)
    studyHours = new int[][] {
      {2, 3, 1},
      {4, 2, 3},
      {3, 3, 2}
    };

    schoolPic = new ImageFilter("school.jpg");
  }

  // school scene 
  // make background blue 
  public void drawScene() {
    clear("blue");


    schoolPic.grayscale();   // filter from ImageFilter
    drawImage(schoolPic, 0, 0, 400);

    drawText("My School Life", 120, 40);

    int total = getTotalStudyHours();
    drawText("Total Study Hours: " + total, 80, 80);

    pause(2);
  }


  // calcualtes total study hours 
  // returns sum of all values 
  public int getTotalStudyHours() {
    int total = 0;

    for (int row = 0; row < studyHours.length; row++) {
      for (int col = 0; col < studyHours[0].length; col++) {
        total += studyHours[row][col];
      }
    }

    return total;
  }
}

import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {

  public ImageFilter(String fileName) {
    super(fileName);
  }

  
  public void grayscale() {
    Pixel[][] pixels = getImagePixels();

    for (int r = 0; r < pixels.length; r++) {
      for (int c = 0; c < pixels[0].length; c++) {

        Pixel p = pixels[r][c];
        int avg = (p.getRed() + p.getGreen() + p.getBlue()) / 3;

        p.setRed(avg);
        p.setGreen(avg);
        p.setBlue(avg);
      }
    }
  }

 
  public void invert() {
    Pixel[][] pixels = getImagePixels();

    for (int r = 0; r < pixels.length; r++) {
      for (int c = 0; c < pixels[0].length; c++) {

        Pixel p = pixels[r][c];

        p.setRed(255 - p.getRed());
        p.setGreen(255 - p.getGreen());
        p.setBlue(255 - p.getBlue());
      }
    }
  }

 
  public void redTint() {
    Pixel[][] pixels = getImagePixels();

    for (int r = 0; r < pixels.length; r++) {
      for (int c = 0; c < pixels[0].length; c++) {

        Pixel p = pixels[r][c];

        int newRed = p.getRed() + 50;

        if (newRed > 255) {
          newRed = 255;
        }

        p.setRed(newRed);
      }
    }
  }
}

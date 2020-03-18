package noomechanism.icosahedron.patterns;

import static processing.core.PApplet.map;

import noomechanism.icosahedron.IcosahedronModel;
import heronarts.lx.LX;
import heronarts.lx.LXCategory;
import heronarts.lx.LXPattern;
import heronarts.lx.model.LXPoint;

@LXCategory(LXCategory.COLOR)
public class Rainbow extends LXPattern {

  public Rainbow(LX lx) {
    super(lx);
  }

  public void run(double deltaMs) {
  	int numPixelsPerRow = 150;
    int pointNumber = 0;
    for (LXPoint p : model.points) {
      int rowNumber = pointNumber / numPixelsPerRow; // Ranges 0-29
      float hue = map(rowNumber, 0, 30 - 1, 0, 360);
      // We can get the position of this point via p.x, p.y, p.z
      colors[p.index] = LX.hsb(hue, 100, 100);
      pointNumber++;
    }
  }
}

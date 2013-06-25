package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    //    createColorPalette (recipe below) --#8
    //    ------------- Recipe for createColorPalette --#8
    ColorWheel.addColor(Colors.Blues.SteelBlue);
    ColorWheel.addColor(Colors.Purples.DarkOrchid);
    ColorWheel.addColor(Colors.Blues.DarkSlateBlue);
    ColorWheel.addColor(Colors.Blues.Teal);
    ColorWheel.addColor(Colors.Purples.Indigo);
    //    ------------- End of createColorPalette recipe 
    //    DrawPentagon (recipe below) --#10
    //    ------------- Recipe for drawPentagon --#10
    for (int i = 1; i <= 200; i++)
    {
      //        AdjustPen (recipe below) --#9
      //        ------------- Recipe for adjustPen --#9
      Tortoise.setPenColor(ColorWheel.getNextColor());
      int penWidth = Tortoise.getPenWidth();
      Tortoise.setPenWidth(penWidth + 1);
      if (penWidth > 4)
      {
        Tortoise.setPenWidth(1);
      }
      //        ------------- End of adjustPen recipe 
      int sideLength = 100;
      Tortoise.move(sideLength);
      Tortoise.turn(360 / 5);
      Tortoise.turn(1);
    }
    //    ------------- End of drawPentagon recipe
  }
}

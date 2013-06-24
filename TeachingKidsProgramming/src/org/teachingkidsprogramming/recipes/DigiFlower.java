package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class DigiFlower
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Make the background silver --#8
    Tortoise.setPenWidth(3);
    //    createColorPalette (recipe below) --#9
    //    Do the following 15 times --#19
    for (int i = 1; i <= 15; i++)
    {
      //      drawOctogon (recipe below) --#10
      //    Repeat
      //    ------------- Recipe for createColorPalette --#9
      //    Color 1 is red --#3
      //    Color 2 is dark orange --#11
      //    Color 3 is gold --#12
      //    Color 4 is yellow --#13
      ColorWheel.addColor(Colors.Reds.Red);
      ColorWheel.addColor(Colors.Oranges.DarkOrange);
      ColorWheel.addColor(Colors.Yellows.Gold);
      ColorWheel.addColor(Colors.Yellows.Yellow);
      ColorWheel.addColor(Colors.Yellows.Yellow);
      ColorWheel.addColor(Colors.Yellows.Gold);
      ColorWheel.addColor(Colors.Oranges.DarkOrange);
      ColorWheel.addColor(Colors.Reds.Red);
      //    ------------- Recipe for drawOctogon --#10
      for (int i = 1; i <= 6; i++)
      {
        Tortoise.setPenColor(ColorWheel.getNextColor());
        Tortoise.move(50);
        Tortoise.turn(360 / 8);
      }
    }
  }
}
